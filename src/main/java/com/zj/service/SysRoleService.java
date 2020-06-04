package com.zj.service;

import com.zj.domain.SysRole;

import java.util.List;

public interface SysRoleService {

    int insertEntry(SysRole sysRole);

    int deleteById(Long id);

    int updateById(SysRole sysRole);

    List<SysRole> selectListByIds(Long... id);

    List<SysRole> selectEntryList(SysRole sysRole);
}