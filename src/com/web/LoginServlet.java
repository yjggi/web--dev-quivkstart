package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.StandardSocketOptions;
@WebServlet(urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过req请求参数获取前台表单的用户名参数
        //处理请求乱码
        req.setCharacterEncoding("UTF-8");
        String username =req.getParameter("username");
        String password =req.getParameter("password");

        req.setAttribute("username",username);
        req.setAttribute("password",password);
       //req.getRequestDispatcher("/index.jsp").forward(req,resp);
        HttpSession session = req.getSession();
        session.setAttribute("username",username);
      resp.sendRedirect("/index.jsp");
//        System.out.println(username);

    }


}
