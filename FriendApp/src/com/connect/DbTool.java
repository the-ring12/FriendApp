package com.connect;

import java.sql.*;

public class DbTool {
    private static String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static String DB_URL = "jdbc:mysql://localhost:3306/frienddb?serverTimezone=GMT";
    private static String DB_USER = "root";
    private static String DB_PASSWORD = "tanqi20011107";
    //获取连接对象
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    //关闭结果集对象
    public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //关闭预编译对象
    public static void close(PreparedStatement prst) {
        if (prst != null) {
            try {
                prst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //关闭链接对象
    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //针对更新操纵，关闭资源
    public static void close(PreparedStatement prst, Connection conn) {
        close(prst);
        close(conn);
    }
    //针对查询操作，关闭资源
    public static void close(ResultSet rs, PreparedStatement prst, Connection conn) {
        close(rs);
        close(prst);
        close(conn);
    }
}
