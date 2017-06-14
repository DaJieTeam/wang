package wangyadi.baway.com.mvptext_demo1.presenter;

import android.util.Log;
import android.widget.ImageView;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.HashMap;

import wangyadi.baway.com.mvptext_demo1.model.Utiles.HttpUtils;
import wangyadi.baway.com.mvptext_demo1.model.home.Bean;
import wangyadi.baway.com.mvptext_demo1.view.iview.iHomeView;

/**
 * 类的作用：
 * 类的思路：
 * 时间：2017/5/9
 * 作者：王亚迪
 */

public class HomePresenter extends BasePresenter<iHomeView>{

    private String url="http://api.expoon.com/AppNews/getNewsList/type/2/p/1";
    private HashMap<String,String> hashMap=new HashMap<>();

    public<T> void getDataFramServer(Class<T> t)
    {
        HttpUtils.getTestData(url,hashMap, new HttpUtils.CallbackVideoData<T>() {
            @Override
            public void callback(T t) {
                if(getMvpView()!=null)
                {
                    getMvpView().callBack(t);
                }else{
                    Log.e("HomePresenter","请调用 attachView");
                }
            }
        },t);
    }

    public void getImageFromServer(ImageView image,String url) {
        x.image().bind(image, url);
    }
}
