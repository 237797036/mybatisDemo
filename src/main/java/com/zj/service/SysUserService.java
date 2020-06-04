/*
 * Copyright (c) 2017 antif.angel All rights reserved.
 */
package com.zj.service;

import com.zj.domain.SysUser;

import java.util.List;

public interface SysUserService {

    int insertEntry(SysUser sysUser);

    int deleteById(Long id);

    int updateById(SysUser sysUser);

    List<SysUser> selectListByIds(Long... id);

    List<SysUser> selectEntryList(SysUser sysUser);
}