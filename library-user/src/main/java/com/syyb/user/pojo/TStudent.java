package com.syyb.user.pojo;

public class TStudent {
    private Integer id;

    private String username;

    private String password;

    private String collegename;

    private String classname;

    private Integer studentid;

    private String email;

    private String status;

    private Integer collegenameId;

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

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getCollegenameId() {
        return collegenameId;
    }

    public void setCollegenameId(Integer collegenameId) {
        this.collegenameId = collegenameId;
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