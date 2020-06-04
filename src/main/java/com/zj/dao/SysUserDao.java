package com.zj.dao;

import com.zj.domain.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserDao {

    int insertEntry(SysUser sysUser);

    int deleteById(Long id);

    int updateById(SysUser sysUser);

    List<SysUser> selectListByIds(Long... id);

    List<SysUser> selectEntryList(SysUser sysUser);

}