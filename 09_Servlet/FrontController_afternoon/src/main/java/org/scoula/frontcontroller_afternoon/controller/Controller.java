package org.scoula.frontcontroller_afternoon.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
    String getView(HttpServletRequest request, HttpServletResponse response);
}
