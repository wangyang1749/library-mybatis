package com.syyb;

import com.syyb.user.dto.Pager;
import com.syyb.user.dto.UserDto;
import com.syyb.user.mapper.TUserMapper;
import com.syyb.user.pojo.TUser;
import com.syyb.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TesUser {

    @Resource(name = "userService")
    UserService userService;


    @Autowired
    TUserMapper userMapper;

    @Test
    public void loadUser(){
        System.out.println(userService.loadUser(12927286).getUsername());
    }
    @Test
    public void updateUser(){
        TUser user = new TUser();
        user.setId(12927286);
        user.setPassword("1749");
        userService.updateUser(user);
    }
    @Test
    public void loginUser(){
        UserDto userDto = userService.login(12927286);
        System.out.println(userDto.getUrls());
    }
    @Test
    public void loginUsername(){
        UserDto login = userService.login("1749748955", "123456");
        System.out.println(login.getUrls());

    }

    @Test
    public void delUser(){
        userService.delUser(2);
    }
    @Test
    public void pagerUser(){

        Pager<TUser> page = userService.findByPage(2, 1, null, null, null);
        System.out.println(page.getList().get(0).getUsername());
    }

    @Test
    public void loadUserDto(){
        UserDto userDto = userService.load(1);
        System.out.println(userDto);

    }
    @Test
    public void addUserDto(){
        userService.addUser(new UserDto("张三","生物园","生物能技术",1,"123563",1));
    }

    @Test
    public void addUser(){
        TUser user = new TUser();
        user.setId(123456);
        user.setUsername("张三");
        userService.addUser(user);
    }

    @Test
    public void find(){
//        TUserExample example = new TUserExample();
//        List<com.syyb.user.pojo.TUser> users = userMapper.selectByExample(example);
//        for(com.syyb.user.pojo.TUser user:users){
//            System.out.println(user.getUsername());
//        }
    }
    @Test
    public void findBypage(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("currPage",1);
        map.put("pageSize",1);
        map.put("name","张");
        List<TUser> users = userMapper.findByPage(map);
        for(TUser user:users){
            System.out.println(user.getUsername());
        }
        System.out.println(map.get("count"));
    }


}
