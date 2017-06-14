package wangyadi.baway.com.mvptext_demo1.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import wangyadi.baway.com.mvptext_demo1.R;
import wangyadi.baway.com.mvptext_demo1.model.home.Bean;
import wangyadi.baway.com.mvptext_demo1.presenter.HomePresenter;
import wangyadi.baway.com.mvptext_demo1.view.iview.IrecycleView;

/**
 * 类的作用：
 * 类的思路：
 * 时间：2017/5/17
 * 作者：王亚迪
 */

public class RecycleAda extends RecyclerView.Adapter{
    private Context context;
    private IrecycleView mirecycleView;
    private HomePresenter mhomePresenter;
    private List<Bean.DataBean> list=new ArrayList<>();
    private  DisplayImageOptions options;
    public RecycleAda(Context context)
    {
        this.context=context;
    }
    public void setData(List<Bean.DataBean> mlist)
    {
        if (list!=null)
        {
            list.addAll(mlist);
        }
    }

    public void addMore(List<Bean.DataBean> lists,boolean isResult)
    {
        for (Bean.DataBean data:lists) {
            if (isResult)
            {
                list.add(0,data);
            }else{
                list.add(data);
            }
        }
    }


    public void setRecycleOnclick(IrecycleView irecycleView)
    {
        this.mirecycleView=irecycleView;
    }

    public void setHomePresenter(HomePresenter homePresenter)
    {
        this.mhomePresenter=homePresenter;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.home_item, null);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final MyViewHolder myViewHolder= (MyViewHolder) holder;
        myViewHolder.text_view.setText(list.get(position).getNews_title());
        //mhomePresenter.getImageFromServer(myViewHolder.image_view,list.get(position).getPic_url());
        //ImageLoader加载图片
        ImageLoader.getInstance().displayImage(list.get(position).getPic_url(),myViewHolder.image_view);
        myViewHolder.image_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mirecycleView.callOnclick(v,position);
                list.remove(list.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        private final TextView text_view;
        private final ImageView image_view;

        public MyViewHolder(View itemView) {
            super(itemView);
            text_view = (TextView) itemView.findViewById(R.id.text_view);
            image_view = (ImageView) itemView.findViewById(R.id.image_view);
        }
    }
}
