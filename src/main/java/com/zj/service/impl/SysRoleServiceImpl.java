package com.zj.service.impl;

import com.zj.dao.SysRoleDao;
import com.zj.domain.SysRole;
import com.zj.service.SysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {

    @Resource
    private SysRoleDao sysRoleDao;

    public int insertEntry(SysRole sysRole) {
        return 0;
    }

    public int deleteById(Long id) {
        return 0;
    }

    public int updateById(SysRole sysRole) {
        return 0;
    }

    public List<SysRole> selectListByIds(Long... id) {
        return null;
    }

    public List<SysRole> selectEntryList(SysRole sysRole) {
        return null;
    }
}