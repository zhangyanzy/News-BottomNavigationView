package com.zhangyan.news.model;

import com.zhangyan.news.bean.LoginReq;
import com.zhangyan.news.bean.LoginResponse;

/**
 * Created by Administrator on 2018/1/12.
 * 登录模块任务
 */

public interface LoginTaskDataSource {
    /**
     * 数据保存到本地
     */
    void saveLoginResponse(LoginResponse loginResponse);

    /**
     * 登录请求
     */
    void login(LoginReq loginReq);

    /**
     * 网络请求回调
     */
    interface NetTasksCallBack {
        void onSuccess(LoginResponse loginResponse);

        void onFailure(String errorMsg);
    }

}
