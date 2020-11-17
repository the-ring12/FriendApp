package com.module;

import com.mysql.cj.protocol.FullReadInputStream;

import java.util.List;

public interface FriendDao {
    public int insertFriend(Friend friend);
    public List<Friend> queryByFname(String fname, String username);
    public List<Friend> queryByFnameLike(String fname, String username);
    public List<Friend> queryAll(String username);
    public Friend queryByFid(Integer fid);
    public int updateFriend(Friend friend);
    public int deleteEriend(Integer fid);
}
