package com.syyb.web.controller.user;

import com.syyb.common.util.MyResult;
import com.syyb.user.dto.JQueryPager;
import com.syyb.user.pojo.TUser;
import com.syyb.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class UserControl {

    @Resource(name = "userService")
    UserService userService;

    @RequestMapping(value = "/userList")
    @ResponseBody
    public MyResult userList(@RequestParam(defaultValue = "10") int rows, @RequestParam(defaultValue = "1") int page ) throws InterruptedException {
        JQueryPager<TUser> pager = userService.selByPage(rows, page, null, null, null);

        return  MyResult.success(200,pager);
    }
}
