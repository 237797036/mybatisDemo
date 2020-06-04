package com.zj.domain;

import java.util.Date;

public class SysUser {
    private Long id;// 编号
    private String userName;
    private String password;
    private String mobile;
    private String account;
    private Integer userStatus;
    private Date lastLogin;
    private Date gmtCreate;
    private Date gmtModify;

    public SysUser() {
        //默认无参构造方法
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 userName
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 userName
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取 password
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置 password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取 mobile
     *
     * @return
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置 mobile
     *
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取 account
     *
     * @return
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置 account
     *
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取 userStatus
     *
     * @return
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * 设置 userStatus
     *
     * @param userStatus
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 获取 lastLogin
     *
     * @return
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * 设置 lastLogin
     *
     * @param lastLogin
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
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
        return "SysUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", account='" + account + '\'' +
                ", userStatus=" + userStatus +
                ", lastLogin=" + lastLogin +
                ", gmtCreate=" + gmtCreate +
                ", gmtModify=" + gmtModify +
                '}';
    }
}