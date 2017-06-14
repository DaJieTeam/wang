package wangyadi.baway.com.mvptext_demo1.view.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import wangyadi.baway.com.mvptext_demo1.R;
import wangyadi.baway.com.mvptext_demo1.model.home.Bean;
import wangyadi.baway.com.mvptext_demo1.presenter.HomePresenter;

/**
 * 类的作用：
 * 类的思路：
 * 时间：2017/5/9
 * 作者：王亚迪
 */

public class MyBaseAda extends BaseAdapter{
    private Context context;
    private HomePresenter mpresenter;
    private List<Bean.DataBean> list=new ArrayList<>();

    public MyBaseAda(Context context)
    {
        this.context=context;
    }

    public void setData(List<Bean.DataBean> list)
    {
        if (list!=null)
        {
            this.list.addAll(list);
        }
    }

    public void setHomePresenter(HomePresenter presenter)
    {
        this.mpresenter=presenter;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Bean.DataBean getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder viewholder;
        if (convertView==null)
        {
            viewholder=new viewHolder();
            convertView=convertView.inflate(context, R.layout.home_item,null);
            viewholder.text_view= (TextView) convertView.findViewById(R.id.text_view);
            viewholder.image_view= (ImageView) convertView.findViewById(R.id.image_view);
            convertView.setTag(viewholder);
        }else{
            viewholder= (viewHolder) convertView.getTag();
        }
        viewholder.text_view.setText(getItem(position).getNews_title());
        mpresenter.getImageFromServer(viewholder.image_view,getItem(position).getPic_url());
        return convertView;
    }

    static class viewHolder
    {
        TextView text_view;
        ImageView image_view;
    }
}
