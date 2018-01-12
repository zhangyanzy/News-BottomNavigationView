package com.zhangyan.news.view;

/**
 * Created by Administrator on 2018/1/12.
 * 登录功能描述
 */

public interface IMvpView {

    void onError(String errorMsg,String code);

    void onSuccess();

    void showLoading();

    void hideLoading();
}
