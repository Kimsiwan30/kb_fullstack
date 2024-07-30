package org.scoula.boardservlet2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/setCookie")
public class CookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        // 쿠키 생성
        Cookie userCookie = new Cookie("username", "tetz");
        userCookie.setMaxAge(60 * 60 * 24);
        response.addCookie(userCookie);


        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>쿠키가 생성 되었습니다!</h1>");
        response.getWriter().println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}