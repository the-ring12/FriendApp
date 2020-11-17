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
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

        try {
            request.getRequestDispatcher("user.jsp").include(request, response);
            User user = (User) request.getAttribute("user");
            UserService us = new UserService();
            if (us.validateUser(user)) {
                request.setAttribute("msg", "此用户已存在");
                request.getRequestDispatcher("reg.jsp").forward(request, response);
            } else {
                us.reg(user);
                request.setAttribute("msg", "注册成功，请登录！");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } finally {
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }
}
