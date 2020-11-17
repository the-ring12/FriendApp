package com.servlet;

import com.connect.DbTool;
import com.module.User;
import com.module.UserDaoImpl;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            request.getRequestDispatcher("user.jsp").include(request, response);
            User user = (User) request.getAttribute("user");
            UserService us = new UserService();
            if (us.validateUser(user)) {
                if (us.login(user)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("username", user.getUsername());
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                } else {
                    request.setAttribute("msg", "登录失败，密码错误！");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            } else {
                request.setAttribute("msg", "登陆失败，该用户不存在！");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } finally {
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
