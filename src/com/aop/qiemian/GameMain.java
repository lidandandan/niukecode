package com.aop.qiemian;

/**
 * Created by yixinf-q on 2018/9/24.
 */
public class GameMain {
    public static void main(String[] args) {
        RoleService roleService=new RoleServiceImpl();
        Interceptor interceptor=new RoleIntererceptor();
        RoleService proxy=ProxyBeanFactory.getBean(roleService,interceptor);
        Role role=new Role("11","lidan","宋佳玉");
        System.out.println("测试方法******************");
        role=null;
        proxy.printRole(role);

    }
}
