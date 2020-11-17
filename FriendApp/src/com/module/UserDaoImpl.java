package com.module;

import com.connect.DbTool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    @Override
    public User queryByUsername(String username) {
        User user = null;
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        String sqlq = "select * from userinfo where username=?";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sqlq);
            prst.setString(1, username);
            rs = prst.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setUsername(rs.getString("username"));
                user.setUserpass(rs.getNString("userpass"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbTool.close(rs, prst, conn);
        }
        return user;
    }

    @Override
    public boolean queryByUsernameUserpass(String username, String userpass) {
       boolean b =false;
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        String sqlq = "select * from userinfo where username=? and userpass=?";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sqlq);
            prst.setString(1, username);
            prst.setString(2, userpass);
            rs = prst.executeQuery();
            if (rs.next()) {
                b = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbTool.close(rs, prst, conn);
        }
        return b;
    }

    @Override
    public void insertUser(User user) {
        Connection conn = null;
        PreparedStatement prst = null;
        String sqli = "insert into userinfo values (?,?)";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sqli);
            prst.setString(1, user.getUsername());
            prst.setString(2, user.getUserpass());
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbTool.close(prst, conn);
        }
    }
}
