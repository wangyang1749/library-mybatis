package com.syyb.user.service.impl;

import com.syyb.user.dto.JQueryPager;
import com.syyb.user.dto.Pager;
import com.syyb.user.dto.UserDto;
import com.syyb.user.exception.UserException;
import com.syyb.user.mapper.TUrlMapper;
import com.syyb.user.mapper.TUserMapper;
import com.syyb.user.pojo.TUser;
import com.syyb.user.pojo.TUserExample;
import com.syyb.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    TUserMapper userMapper;
    @Autowired
    TUrlMapper urlMapper;

    @Override
    public UserDto login(int ybId) {
        TUser user = userMapper.selectByPrimaryKey(ybId);
        if(user!=null){
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(user,userDto);
            userDto.setUrls(urlMapper.listUrl(ybId));
            return userDto;
        }else{
            return null;
        }
    }

    @Override
    public UserDto login(String username, String password) {
        TUserExample example = new TUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<TUser> users = userMapper.selectByExample(example);
        if (users.size()<=0) throw new UserException("用户名不存在");
        TUser user = users.get(0);
        if(!user.getPassword().equals(password))
            throw new UserException("用户名或密码不正确！");
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user,userDto);
        userDto.setUrls(urlMapper.listUrl(user.getId()));
        return userDto;
    }

    @Override
    public UserDto login(UserDto userDto) {
        //查询用户是否为空
        TUserExample example = new TUserExample();
        example.createCriteria().andIdEqualTo(userDto.getId());
        List<TUser> users = userMapper.selectByExample(example);
        if(users.size()>0){
            TUser user = users.get(0);
            BeanUtils.copyProperties(user,userDto);
        }else{
            return  null;
        }

        return null;
    }

    @Override
    public void addUser(TUser user) {
        userMapper.insert(user);
    }

    @Override
    public TUser loginUser(String username, String password) {
        return null;
    }

    @Override
    public UserDto load(int ybId) {
        UserDto userDto  = new UserDto();
        TUserExample example = new TUserExample();
        example.createCriteria().andIdEqualTo(ybId);
        List<TUser> users = userMapper.selectByExample(example);
        if(users.size()<=0)return  null;
        TUser user = users.get(0);
        BeanUtils.copyProperties(user,userDto);
        return userDto;
    }

    @Override
    public void addUser(UserDto userDto) {
        TUser user = new TUser();
        BeanUtils.copyProperties(userDto,user);
        userMapper.insert(user);
    }

    @Override
    public Pager<TUser> findByPage(int pageSize,int currentPage,String field,String condition,String order) {
        Pager<TUser> userPager = new Pager<>();
        Map<String,Object> map = new HashMap<>();
        if(currentPage<=0)currentPage=1;
        map.put("currPage",currentPage);
        map.put("pageSize",pageSize);
        map.put("field",field);
        map.put("condition",condition);
        map.put("order",order);

        List<TUser> users = userMapper.findByPage(map);
        userPager.setList(users);
        int count =((int) map.get("count"));
        userPager.setTotalSize(count);
        userPager.setCurrentPage(currentPage);
        userPager.setPageSize(pageSize);
        return userPager;
    }

    @Override
    public JQueryPager<TUser> selByPage(int rows, int page, String field, String condition, String order) {
        JQueryPager<TUser> pager = new JQueryPager<>();
        Map<String,Object> map = new HashMap<>();
        if(page<=0)page=1;
        map.put("currPage",page);
        map.put("pageSize",rows);
        map.put("field",field);
        map.put("condition",condition);
        map.put("order",order);
        List<TUser> users = userMapper.findByPage(map);
        pager.setRows(users);
        int count =((int) map.get("count"));
        pager.setTotal(count);
        return pager;
    }

    @Override
    public void delUser(int id) {
        //TODO
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateUser(TUser user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public TUser loadUser(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
