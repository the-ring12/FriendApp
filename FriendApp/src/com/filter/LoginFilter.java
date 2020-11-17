package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String path = request.getServletPath();
        HttpSession session = ((HttpServletRequest) req).getSession();
        String username = (String) session.getAttribute("username");
        boolean b1 = path.endsWith("login.jsp");
        boolean b2 = path.endsWith("error.jsp");
        boolean b3 = path.endsWith("LoginServlet");
        boolean b4 = path.endsWith("reg.jsp");
        boolean b5 = path.endsWith("RegServlet");
        boolean b6 = (username != null);
        if (b1 || b2 || b3 || b4 || b5 || b6) {
            chain.doFilter(req, resp);
        } else {
            response.sendRedirect("error.jsp");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
