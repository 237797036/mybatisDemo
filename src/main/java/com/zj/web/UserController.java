package com.zj.web;

import com.zj.domain.SysUser;
import com.zj.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/sysUser")
public class UserController {

    @Resource
    private SysUserService userService;

    @RequestMapping("/save")
    @ResponseBody
    public boolean insertUser(SysUser sysUser) {
        boolean res = false;
        try {
            sysUser.setAccount("zj");
            sysUser.setGmtCreate(new Date());
            sysUser.setUserName("testName");
            userService.insertEntry(sysUser);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<SysUser> getUser() {
        List<SysUser> aa = null;
        try {
            aa = userService.selectEntryList(new SysUser());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aa;
    }

}
