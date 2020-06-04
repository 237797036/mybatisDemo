package com.zj.domain;

import java.util.Date;

public class SysRole {
    private Long id;// 编号
    private String roleName;
    private String roleCode;
    private Date gmtCreate;
    private Date gmtModify;

    public SysRole() {
        //默认无参构造方法
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 roleName
     *
     * @return
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置 roleName
     *
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取 roleCode
     *
     * @return
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * 设置 roleCode
     *
     * @param roleCode
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    /**
     * 获取 gmtCreate
     *
     * @return
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置 gmtCreate
     *
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取 gmtModify
     *
     * @return
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * 设置 gmtModify
     *
     * @param gmtModify
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleCode='" + roleCode + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModify=" + gmtModify +
                '}';
    }
}