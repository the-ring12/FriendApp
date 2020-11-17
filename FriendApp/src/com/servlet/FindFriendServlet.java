package com.servlet;

import com.module.Friend;
import com.service.FriendService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/FindFriendServlet")
public class FindFriendServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String condition = request.getParameter("condition");
            String type = request.getParameter("type");
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("username");
            FriendService fs = new FriendService();
            List<Friend> list = fs.showFriends(condition, type, username);
            request.setAttribute("flist", list);
            request.getRequestDispatcher("showFriends.jsp").forward(request, response);
        } finally {
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
