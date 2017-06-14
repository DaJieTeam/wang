package wangyadi.baway.com.mvptext_demo1.presenter;

import wangyadi.baway.com.mvptext_demo1.view.iview.IMvpView;
import wangyadi.baway.com.mvptext_demo1.view.iview.iHomeView;

/**
 * 类的作用：
 * 类的思路：
 * 时间：2017/5/9
 * 作者：王亚迪
 */
public class BasePresenter <T extends  IMvpView>{

    public T t1;

    public void attachView(T t)
    {
        this.t1=t;
    }

    public T getMvpView()
    {
        return t1;
    }

}
