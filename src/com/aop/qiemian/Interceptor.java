package com.aop.qiemian;

/**
 * Created by yixinf-q on 2018/9/24.
 */
public interface Interceptor {
    public void before(Object obj);
    public void after(Object obj);
    public void afterReturning(Object obj);
    public void afterThrowing(Object obj);
}
