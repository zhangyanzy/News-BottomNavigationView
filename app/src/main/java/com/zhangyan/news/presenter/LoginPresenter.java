package com.zhangyan.news.presenter;

import com.zhangyan.news.bean.LoginReq;
import com.zhangyan.news.bean.LoginResponse;
import com.zhangyan.news.model.LoginTaskDataSource;
import com.zhangyan.news.view.IUserLoginView;

/**
 * Created by Administrator on 2018/1/12.
 */

public class LoginPresenter extends BasePresenter<IUserLoginView> {

    private LoginTaskDataSource mLoginTaskDataSource;

    public LoginPresenter(LoginTaskDataSource mLoginTaskDataSource) {
        this.mLoginTaskDataSource = mLoginTaskDataSource;
    }

    public void login(LoginReq loginReq) {
//        mLoginTaskDataSource.login(loginReq, new LoginTaskDataSource.NetTasksCallBack() {
//            @Override
//            public void onSuccess(LoginResponse loginResponse) {
//
//            }
//
//            @Override
//            public void onFailure(String errorMsg) {
//
//            }
//        });

    }
}
