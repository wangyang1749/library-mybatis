package com.syyb.web.controller;

import com.syyb.user.dto.JQueryPager;
import com.syyb.user.dto.Pager;
import com.syyb.user.dto.UserDto;
import com.syyb.user.exception.UserException;
import com.syyb.user.pojo.TUser;
import com.syyb.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @Resource(name = "userService")
    UserService userService;

    @RequestMapping("/admin")
    public String index(){
        return "admin/admin";
    }

    @RequestMapping(value = "/userList/{page}",produces = "application/json; charset=utf-8")
    public String userList(HttpServletResponse response,Model model, @PathVariable("page")int page){
        Pager<TUser> pData = userService.findByPage(5, page, null, null, null);
        model.addAttribute("pdata",pData);
        return "admin/user/userList";
    }

    @RequestMapping(value = "/userList",params = "json")
    @ResponseBody
    @CrossOrigin
    public JQueryPager<TUser> userList(@RequestParam(defaultValue = "10") int rows, @RequestParam(defaultValue = "1") int page ){
        JQueryPager<TUser> pager = userService.selByPage(rows, page, null, null, null);
        return  pager;
    }

    @RequestMapping(value = "/userList")
    public String userList(){
        return "admin/user/userList";
    }

    @RequestMapping("/delUser")
    public void delUser(@RequestParam() int id){
        userService.delUser(id);
    }

    @RequestMapping(value = "addUser",method = RequestMethod.GET)
    public String addUser(){
        return "admin/user/addUser";
    }

    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public String addUser(@RequestParam(required = false) UserDto user){

        return "redirect:userList";
    }

    @RequestMapping(value = "/{uid}/update",method = RequestMethod.GET)
    public String updateUserById(@PathVariable("uid")int uid,Model model){
        System.out.println(uid);
        TUser user = userService.loadUser(uid);
        model.addAttribute("updateUser",user);
        return "admin/user/updateUser";
    }

    @RequestMapping(value = "/{uid}/update",method = RequestMethod.POST)
    @ResponseBody
    public String update(TUser user){
        userService.updateUser(user);
        return "1";
    }

    @ExceptionHandler(value = UserException.class)
    public String userException(UserException e,HttpServletRequest req){
        req.setAttribute("e",e.getMessage());
        return "admin/error";
    }
    @RequestMapping("/jobManager")
    public String jobMananger(){
        return "admin/quartz/JobManager";
    }


}


