package com.yunmayi.app.baselibrary.api;

/**
 * Created by ys on 2017/6/5.
 * Fuction: 网络请求监听基类
 */

public interface RequestCallback<T>{

    /**
     * 请求之前调用
     */
    void beforeRequest();

    /**
     * 请求错误调用
     *
     * @param msg 错误信息
     */
    void requestError(String msg);

    /**
     * 请求完成调用
     */
    void requestComplete();

    /**
     * 请求成功调用
     *
     * @param data 数据
     */
    void requestSuccess(T data);


}
