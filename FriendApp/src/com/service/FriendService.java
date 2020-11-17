package com.service;

import com.module.Friend;
import com.module.FriendDaoImpl;

import java.util.ArrayList;
import java.util.List;

public class FriendService {
    //添加好友信息服务
    public int reg(Friend friend) {
        int i = 0;
        FriendDaoImpl fdi = new FriendDaoImpl();
        i = fdi.insertFriend(friend);
        return i;
    }

    //按条件查询好友信息服务
    public List<Friend> showFriends(String condition, String type, String username) {
        List<Friend> list = new ArrayList<Friend>();
        FriendDaoImpl fdi = new FriendDaoImpl();
        int i = Integer.parseInt(type);
        switch (i) {
            case 1:
                list = fdi.queryAll(username);
                break;
            case 2:
                list = fdi.queryByFname(condition, username);
                break;
            case 3:
                list = fdi.queryByFnameLike(condition, username);
                break;
        }
        return list;
    }

    //更新用户信息服务
    public int update(Friend friend) {
        int i = 0;
        FriendDaoImpl fdi = new FriendDaoImpl();
        i = fdi.updateFriend(friend);
        return i;
    }

    //删除用户信息服务
    public int deleteFriend(Integer fid) {
        int i = 0;
        FriendDaoImpl fdi = new FriendDaoImpl();
        i = fdi.deleteEriend(fid);
        return i;
    }
}
