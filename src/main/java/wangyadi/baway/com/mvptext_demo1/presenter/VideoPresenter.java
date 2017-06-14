package wangyadi.baway.com.mvptext_demo1.presenter;

import java.util.HashMap;

import wangyadi.baway.com.mvptext_demo1.model.Utiles.HttpUtils;
import wangyadi.baway.com.mvptext_demo1.view.iview.IVideoView;

/**
 * 类的作用：
 * 类的思路：
 * 时间：2017/5/11
 * 作者：王亚迪
 */

public class VideoPresenter extends BasePresenter<IVideoView>{
    private String url="http://api.expoon.com/AppNews/getNewsList/type/2/p/1";
    private HashMap<String,String> hashMap=new HashMap<>();

    public<T> void getVideoData(final Class<T> classOfT)
    {
        HttpUtils.getTestData(url,hashMap, new HttpUtils.CallbackVideoData<T>() {
            @Override
            public void callback(T t) {
                getMvpView().getVideoBean(t);
            }
        },classOfT);
    }
}
