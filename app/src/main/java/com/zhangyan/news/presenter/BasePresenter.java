package com.zhangyan.news.presenter;

import com.zhangyan.news.view.IMvpView;

/**
 * Created by Administrator on 2018/1/12.
 * <p>
 * 基础业务类
 */

public abstract class BasePresenter<V extends IMvpView> implements Presenter<V> {


    protected V mvpView;

    public void attachView(V view) {

    }

    @Override
    public void detachView(V view) {
        mvpView = null;
    }

    @Override
    public String getName() {
        return mvpView.getClass().getSimpleName();
    }
}
