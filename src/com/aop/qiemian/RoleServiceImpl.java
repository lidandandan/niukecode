package com.aop.qiemian;

/**
 * Created by yixinf-q on 2018/9/24.
 */
public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role) {
        System.out.println("{id="+role.getId()+",roleName="+role.getRoleName()+",note="+role.getNote());
    }
}
