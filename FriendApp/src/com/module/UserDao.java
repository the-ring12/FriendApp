package com.module;

public interface UserDao {
    //按用户名查询
    public User queryByUsername(String username);
    //按用户名密码查询
    public boolean queryByUsernameUserpass(String username, String userpass);
    //插入用户信息
    public void insertUser(User user);
}
