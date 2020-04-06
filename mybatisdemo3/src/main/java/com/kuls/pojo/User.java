package com.kuls.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @author kuls
 * @Desc 公众号：JAVAandPython君
 * @date 2020/3/17 11:59 上午
 */

public class User {
    private int id;
    private String name;
    private String pwd;
    private Address address;

    public User() {
    }

    public User(int id, String name, String pwd, Address address) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", address=" + address +
                '}';
    }
}