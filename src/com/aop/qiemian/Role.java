package com.aop.qiemian;

/**
 * Created by yixinf-q on 2018/9/24.
 */
public class Role {

    String id;
    String roleName;
    String note;
    public Role(String id,String roleName,String note)
    {
        this.id=id;
        this.roleName=roleName;
        this.note=note;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


}
