package com.zj.dao;

import com.zj.domain.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRoleDao {

    int insertEntry(SysRole sysRole);

    int deleteById(Long id);

    int updateById(SysRole sysRole);

    List<SysRole> selectListByIds(Long... id);

    List<SysRole> selectEntryList(SysRole sysRole);
}