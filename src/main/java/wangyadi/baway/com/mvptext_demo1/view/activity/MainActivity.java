package wangyadi.baway.com.mvptext_demo1.view.activity;

import android.graphics.Color;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import wangyadi.baway.com.mvptext_demo1.R;
import wangyadi.baway.com.mvptext_demo1.model.home.Bean;
import wangyadi.baway.com.mvptext_demo1.presenter.HomePresenter;
import wangyadi.baway.com.mvptext_demo1.view.adapter.MyBaseAda;
import wangyadi.baway.com.mvptext_demo1.view.adapter.RecycleAda;
import wangyadi.baway.com.mvptext_demo1.view.iview.IrecycleView;
import wangyadi.baway.com.mvptext_demo1.view.iview.iHomeView;

public class MainActivity extends AppCompatActivity implements iHomeView<Bean>,SwipeRefreshLayout.OnRefreshListener{

    private HomePresenter homepresenter;
    private ListView list_view;
    private MyBaseAda ada;
    private RecyclerView recycle_view;
    private RecycleAda recycleada;
    private SwipeRefreshLayout swipe;
    private GridLayoutManager gridLayoutManager;
    private ProgressBar progress_bar;
    private boolean isResult;
    private Bean b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        recycleView();
    }

    private void recycleView() {
       //LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        gridLayoutManager = new GridLayoutManager(MainActivity.this, 3);
       // StaggeredGridLayoutManager staggermanager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recycle_view.addItemDecoration(new DividerItemDecoration(MainActivity.this,DividerItemDecoration.VERTICAL));
        recycle_view.setLayoutManager(gridLayoutManager);
        //设置下拉刷新
        swipe.setEnabled(true);
        //下拉刷新设置监听
        swipe.setOnRefreshListener(this);
        //设置刷新圆圈的颜色
        swipe.setColorSchemeColors(Color.RED,Color.BLUE,Color.GREEN);
        //设置距离
        swipe.setDistanceToTriggerSync(1000);
        //设置背景颜色
        swipe.setBackgroundColor(Color.YELLOW);
        //设置刷新圆圈的位置
       // swipe.setProgressViewOffset(true,50,500);
        //加载更多
        recycle_view.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy>0)
                {
                    //int first = gridLayoutManager.findFirstVisibleItemPosition();
                    int last = gridLayoutManager.findLastVisibleItemPosition();
                    int itemCount = gridLayoutManager.getItemCount();
                    if(last+1==itemCount)
                    {
                        progress_bar.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this,"last"+last+"+itemCount="+itemCount,Toast.LENGTH_SHORT).show();
                        new Thread(){
                            @Override
                            public void run() {
                                super.run();
                                try {
                                    sleep(2000);
                                    isResult=false;
                                    recycleada.addMore(b.getData(),isResult);
                                    runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            progress_bar.setVisibility(View.GONE);
                                        }
                                    });
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }.start();
                    }
                }
            }
        });
    }

    private void initView() {
        //list_view = (ListView) findViewById(R.id.list_view);
        swipe = (SwipeRefreshLayout) findViewById(R.id.swipe);
        recycle_view = (RecyclerView) findViewById(R.id.recycle_view);
        progress_bar = (ProgressBar) findViewById(R.id.progress_bar);
    }

    private void initData() {
        homepresenter = new HomePresenter();
        homepresenter.attachView(this);
        ada = new MyBaseAda(this);
        homepresenter.getDataFramServer(Bean.class);
        ada.setHomePresenter(homepresenter);
        recycleada = new RecycleAda(this);
        //list_view.setAdapter(ada);
        recycle_view.setAdapter(recycleada);
        //接口回调监听的方法
        recycleada.setRecycleOnclick(new IrecycleView() {
            @Override
            public void callOnclick(View v, int position) {
                //Toast.makeText(MainActivity.this,"您点击了条目"+position,Toast.LENGTH_SHORT).show();
                recycleada.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void callBack(Bean bean) {
        b = bean;
        ada.setData(bean.getData());
        ada.notifyDataSetChanged();
        recycleada.setData(bean.getData());
        recycleada.setHomePresenter(homepresenter);
        recycleada.notifyDataSetChanged();
    }

    @Override
    public void callErr(String errMsg, String errCode) {

    }

    @Override
    public void onRefresh() {
        isResult=true;
        homepresenter.getDataFramServer(Bean.class);
        recycleada.notifyDataSetChanged();
        //停止刷新
        swipe.setRefreshing(false);
    }
}
