package com.syyb.web.controller;

import com.syyb.user.dto.JQueryPager;
import com.syyb.user.pojo.TRole;
import com.syyb.user.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class RoleController {
    @Resource(name = "roleService")
    RoleService roleService;

    @RequestMapping(value = "/roleList")
    public String roleList(){
        return "admin/user/roleList";
    }
    @RequestMapping(value = "/roleList",params = "json")
    @ResponseBody
    public JQueryPager<TRole> roleList(@RequestParam(defaultValue = "10") int rows, @RequestParam(defaultValue = "1") int page ){

        return roleService.selByPage(rows,page);
    }
}
