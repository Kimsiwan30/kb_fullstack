package org.scoula.frontcontroller_afternoon.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("imgSrc", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPjMdm7-QrWBDJ5eR_UIoSit6ZT4Z-T3UVIJlVLRctMBHUFpEVMU9csdEoyVcwYzEwYI4&usqp=CAU");
        request.setAttribute("title", "Home");
        return "index";
    }
}
