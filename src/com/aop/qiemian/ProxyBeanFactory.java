package com.aop.qiemian;

/**
 * Created by yixinf-q on 2018/9/24.
 */
public class ProxyBeanFactory {
    public static <T> T getBean(T obj,Interceptor interceptor)
    {
        return (T)ProxyBeanUtil.getBean(obj,interceptor);
    }

}
