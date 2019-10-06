package com.syyb.user.pojo;

public class TTeacher {
    private Integer id;

    private String username;

    private String password;

    private String collegename;

    private Integer collegenameId;

    private String classname;

    private Integer classnameId;

    private Integer ybId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename == null ? null : collegename.trim();
    }

    public Integer getCollegenameId() {
        return collegenameId;
    }

    public void setCollegenameId(Integer collegenameId) {
        this.collegenameId = collegenameId;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getClassnameId() {
        return classnameId;
    }

    public void setClassnameId(Integer classnameId) {
        this.classnameId = classnameId;
    }

    public Integer getYbId() {
        return ybId;
    }

    public void setYbId(Integer ybId) {
        this.ybId = ybId;
    }
}