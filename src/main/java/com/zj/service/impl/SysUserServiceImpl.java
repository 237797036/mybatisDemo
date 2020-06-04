package com.zj.service.impl;

import com.zj.dao.SysUserDao;
import com.zj.domain.SysUser;
import com.zj.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;

    public int insertEntry(SysUser sysUser) {
        return sysUserDao.insertEntry(sysUser);
    }

    public int deleteById(Long id) {
        return 0;
    }

    public int updateById(SysUser sysUser) {
        return 0;
    }

    public List<SysUser> selectListByIds(Long... id) {
        return null;
    }

    public List<SysUser> selectEntryList(SysUser sysUser) {
        return sysUserDao.selectEntryList(sysUser);
    }
}