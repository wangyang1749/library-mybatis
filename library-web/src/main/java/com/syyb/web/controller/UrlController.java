package com.syyb.web.controller;

import com.syyb.user.dto.JQueryPager;
import com.syyb.user.pojo.TUrl;
import com.syyb.user.service.UrlService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UrlController {

    @Resource(name = "urlService")
    UrlService urlService;

    @RequestMapping(value = "/urlList",params = "json")
    @ResponseBody
    public JQueryPager<TUrl> userList(@RequestParam(defaultValue = "10") int rows, @RequestParam(defaultValue = "1") int page ){
        JQueryPager<TUrl> pager = urlService.selByPage(rows, page);
        return  pager;
    }

    @RequestMapping(value = "/urlList")
    public String userList(){
        return "admin/user/urlList";
    }
}
