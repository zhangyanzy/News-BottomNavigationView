package com.zhangyan.news.presenter;

/**
 * Created by Administrator on 2018/1/12.
 */

public interface Presenter<V> {
    void attachView(V view);

    void detachView(V view);

    String getName();
}
