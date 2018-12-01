package com.aop.qiemian;

/**
 * Created by yixinf-q on 2018/9/24.
 */
public class RoleIntererceptor implements Interceptor {
    @Override
    public void before(Object obj) {
        System.out.println("准备打印角色信息");
    }

    @Override
    public void after(Object obj) {
        System.out.println("已经完成打印角色信息");
    }

    @Override
    public void afterReturning(Object obj) {
        System.out.println("刚刚完成打印功能，一切正常");
    }

    @Override
    public void afterThrowing(Object obj) {
        System.out.println("执行打印功能异常了，查看一下角色对象为空了吗");
    }
}
