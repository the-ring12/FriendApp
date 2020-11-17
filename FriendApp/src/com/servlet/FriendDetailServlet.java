package com.servlet;

import com.module.Friend;
import com.module.FriendDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FriendDetailServlet")
public class FriendDetailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String fid = request.getParameter("fid");
            String opcode = request.getParameter("opcode");
            FriendDaoImpl fdi = new FriendDaoImpl();
            Friend friend = fdi.queryByFid(Integer.parseInt(fid));
            request.setAttribute("friend", friend);
            if ("u".equals(opcode)) {
                request.getRequestDispatcher("updateFriend.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("deleteFriend.jsp").forward(request, response);
            }
        } finally {
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
