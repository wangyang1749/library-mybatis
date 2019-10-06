package com.syyb.web.controller;

import cn.yiban.open.AppUtil;
import com.alibaba.fastjson.JSONObject;

import com.syyb.common.util.LibraryResult;
import com.syyb.common.util.MyResult;
import com.syyb.user.dto.UserDto;
import com.syyb.user.exception.UserException;
import com.syyb.user.service.UrlService;
import com.syyb.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController {

    @Resource(name = "userService")
    UserService userService;

    @Resource(name = "urlService")
    UrlService urlService;

    @RequestMapping(value = "/loginInput")
    public String loginInput(HttpSession session){
        if(session.getAttribute("user")!=null){
            return "redirect:admin";
        }
        return "admin/loginInput";
    }

    @RequestMapping(value = "/loginByYb",params = "web")
    public String login(HttpServletRequest request, Model model) {
        if(request.getSession().getAttribute("user")!=null){
            return "redirect:admin";
        }
       /* String code = request.getParameter("code");
        if(code==null||code.isEmpty()){
            String authorizeUrl = AppUtil.authorize("123");
            System.out.println(authorizeUrl);
            return "redirect:"+authorizeUrl;
        }else{*/
        //获取授权凭证
//            String accessToken = AppUtil.getAccessToken(code);
        String accessToken="c0358aa56f729146dc55fd0adaaa9bd38d0a4200";
//        System.out.println(accessToken);
        //获取用户信息

        String basicInfo = AppUtil.basicInfo(accessToken);
        JSONObject basicInfoJson = JSONObject.parseObject(basicInfo).getJSONObject("info");

        //根据授权用户id查找用户
        Integer userId = basicInfoJson.getInteger("yb_userid");
        UserDto userDto = userService.login(userId);
//        判断用户是否存在
        if(userDto==null){
            String userInfo = AppUtil.verifyInfo(accessToken);
            //如果不存在将用户存入数据库
            userDto  = JsonToUser(userInfo);
            userDto.setImg(basicInfoJson.getString("yb_userhead"));
            userService.addUser(userDto);
            userDto.setUrls(urlService.listUrl(userId));
        }
        //将授权凭证存入session
        userDto.setAccessToken(accessToken);
        request.getSession().setAttribute("user",userDto);
        return  "redirect:admin";
//        }
    }

    public UserDto JsonToUser(String userInfo) {
        JSONObject jo = JSONObject.parseObject(userInfo).getJSONObject("info");
        UserDto userDto = new UserDto();
       /* "yb_userid":"12927286",
        "yb_realname":"王阳",
        "yb_schoolid":"10039",
        "yb_schoolname":"商洛学院",
        "yb_collegename":"生物医药与食品工程学院",
        "yb_classname":"生技1702",
        "yb_enteryear":"2017",
        "yb_studentid":"17101218",
        "yb_examid":"",
        "yb_admissionid":"17242030",
        "yb_employid":""*/
        userDto.setId(jo.getInteger("yb_userid"));
        userDto.setNickname(jo.getString("yb_realname"));
        userDto.setCollegename(jo.getString("yb_collegename"));
        userDto.setClassname(jo.getString("yb_classname"));
        return userDto;
    }

    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session){
        session.invalidate();
        return "redirect:loginInput";
    }

    @RequestMapping(value = "/formLogin",method = RequestMethod.POST)
    @ResponseBody
    public String login(String username, String password, HttpSession session, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        try {
            UserDto userDto = userService.login(username, password);
            if(userDto!=null){
                session.setAttribute("user",userDto);
                return "1";
            }
        } catch (UserException e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
        return "0";
    }


    /**
     * 使用手机授权登录
     * @param param
     * @param request
     * @return
     */
    @RequestMapping(value = "loginByYb")
    public String MobelLoginByYb(@RequestParam(required = false) String param, HttpServletRequest request){
        String accessToken="c0358aa56f729146dc55fd0adaaa9bd38d0a4200";

        String basicInfo = AppUtil.basicInfo(accessToken);
        JSONObject basicInfoJson = JSONObject.parseObject(basicInfo).getJSONObject("info");

        //根据授权用户id查找用户
        Integer userId = basicInfoJson.getInteger("yb_userid");
        UserDto userDto = userService.login(userId);
//        判断用户是否存在
        if(userDto==null){
            String userInfo = AppUtil.verifyInfo(accessToken);
            //如果不存在将用户存入数据库
            userDto  = JsonToUser(userInfo);
            userDto.setImg(basicInfoJson.getString("yb_userhead"));
            userService.addUser(userDto);
            userDto.setUrls(urlService.listUrl(userId));
        }
        //将授权凭证存入session
        userDto.setAccessToken(accessToken);
        request.getSession().setAttribute("user",userDto);
        System.out.println("loginByyb"+param);
        if(param!=null){
            return  "redirect:/user/downSeatInput?seatNumber="+param;
        }else{
            return  "redirect:/user/index";
        }

    }


    @RequestMapping("/authorize")
    public String authorize(HttpServletRequest request){
        String code = request.getParameter("code");
        if(code==null||code.isEmpty()){
            String authorizeUrl = AppUtil.authorize("123");
            System.out.println(authorizeUrl);
            return "redirect:"+authorizeUrl;
        }else{
            String accessToken = AppUtil.getAccessToken(code);
            System.out.println(accessToken);
            JSONObject basicInfoJson = JSONObject.parseObject(accessToken);
        }

        //授权之跳转到相应的页面
        return "redirect:index";

    }


    @RequestMapping(value = "api/login")
    @ResponseBody
    public MyResult Jsonlogin(HttpServletRequest request){

        return MyResult.success("");
    }
    @RequestMapping("/user/index")
    public String index(){
        return "index";
    }
}
