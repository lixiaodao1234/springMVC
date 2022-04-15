package com.atguigu.mvc.bean;

import java.util.Arrays;

/**
 * @author lixiaodao
 * @create 2022-04-10 - 17:47
 */
public class User {
    private String username;
    private String password;
    private String[] hobby;

    public User() {
    }

    public User(String username, String password, String[] hobby) {
        this.username = username;
        this.password = password;
        this.hobby = hobby;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
}
