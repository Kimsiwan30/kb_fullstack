package org.scoula.boardservlet2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/jstl")
public class JstlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> list = new ArrayList<String>();
        list.add("아이템 1");
        list.add("아이템 2");
        list.add("아이템 3");

        request.setAttribute("list", list);
        request.setAttribute("condition", true);

        boolean isJSTL = "true".equals(request.getParameter("isJSTL")) ? true : false;

        if (isJSTL) {
            request.getRequestDispatcher("jstl.jsp").forward(request, response);
        } else{
            request.getRequestDispatcher("scriptlet.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}