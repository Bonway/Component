package com.xiaojinzi.component.interceptor;

import android.support.annotation.NonNull;

import com.xiaojinzi.component.impl.RouterInterceptor;

import java.util.List;

/**
 * 拦截器管理中心的接口
 * time   : 2018/12/26
 *
 * @author : xiaojinzi 30212
 */
public interface IComponentCenterInterceptor extends IComponentInterceptor {

    /**
     * 获取全局拦截器列表
     *
     * @return
     */
    List<RouterInterceptor> getGlobalInterceptorList();

    /**
     * 注册每一个模块的拦截器
     *
     * @param interceptor
     */
    void register(@NonNull IComponentHostInterceptor interceptor);

    /**
     * 通过host注册
     *
     * @param host
     */
    void register(@NonNull String host);

    /**
     * 反注册模块的拦截器
     *
     * @param interceptor
     */
    void unregister(@NonNull IComponentHostInterceptor interceptor);

    /**
     * 通过 host 反注册
     *
     * @param host
     */
    void unregister(@NonNull String host);

}
