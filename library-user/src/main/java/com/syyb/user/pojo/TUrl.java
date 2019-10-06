package com.syyb.user.pojo;

public class TUrl {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "TUrl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}