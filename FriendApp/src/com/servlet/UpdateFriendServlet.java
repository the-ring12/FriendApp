package com.servlet;

import com.module.Friend;
import com.service.FriendService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( "/UpdateFriendServlet")
public class UpdateFriendServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            request.getRequestDispatcher("friend.jsp").include(request, response);
            Friend friend = (Friend) request.getAttribute("friend");
            FriendService fs = new FriendService();
            int i = fs.reg(friend);
            request.setAttribute("msg", i + "条记录被更新！");
            request.getRequestDispatcher("afterEdit.jsp").forward(request, response);
        } finally {
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
