package com.syyb.user.dto;

import com.syyb.user.pojo.TMenu;

import java.util.List;
import java.util.Set;

public class UserDto {
    private String username;
    private String nickname;
    private String collegename;
    private String classname;
    private Integer id;
    private String accessToken;
    private String img;


    /**
     * 用户身份
     * 0表示管理员，1表示学生，2表示老师
     */
    private  int identity;
    /**
     * 存储当前用户可以访问的url
     */

    private Set<String> urls;

    /**
     * 用户可以访问的菜单资源
     */
    List<TMenu> menus;

    public UserDto(){}

    public UserDto(String username, String collegename, String classname, Integer ybId, String accessToken, int identity) {

        this.username = username;
        this.collegename = collegename;
        this.classname = classname;
        this.id = ybId;
        this.accessToken = accessToken;
        this.identity = identity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer ybId) {
        this.id = ybId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }


    public Set<String> getUrls() {
        return urls;
    }

    public void setUrls(Set<String> urls) {
        this.urls = urls;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
