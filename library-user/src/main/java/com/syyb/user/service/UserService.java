package com.syyb.user.service;

import com.syyb.user.dto.JQueryPager;
import com.syyb.user.dto.Pager;
import com.syyb.user.dto.UserDto;
import com.syyb.user.pojo.TUser;

/**
 * 用户服务接口
 */
public interface UserService {

    /**
     * 使用易班Id登录用户
     * @param ybId
     * @return
     */
    UserDto login(int ybId);
    /**
     * 根据用户名密码登录
     * @param username
     * @param password
     * @return
     */
    UserDto login(String username,String password);
    /**
     * 根据用户名和密码登录用户
     * @param username
     * @param password
     * @return
     */
    TUser loginUser(String username,String password);
    /**
     * 使用Dto添加用户
     * @param userDto
     */
    void addUser(UserDto userDto);
    /**
     * 采用EasyUi进行分页
     * @param rows
     * @param page
     * @param field
     * @param condition
     * @param order
     * @return
     */
    JQueryPager<TUser> selByPage(int rows,int page,String field,String condition,String order);
    /**
     * 根据id删除用户
     * @param id
     */
    void delUser(int id);

    /**
     * 跟新用户信息
     * @param user
     */
    void updateUser(TUser user);

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    TUser loadUser(int id);


//    ------------------------------------------------------------------
    /**
     * 用户列表分页显示
     * @return
     */
    Pager<TUser> findByPage(int pageSize,int currentPage,String field,String condition,String order);


    /**
     * 根据易班id查找用户
     * @param ybId
     * @return
     */
    UserDto load(int ybId);

    UserDto login(UserDto userDto);
    /**
     * 添加用户
     * @param user
     */
    void addUser(TUser user);
}
