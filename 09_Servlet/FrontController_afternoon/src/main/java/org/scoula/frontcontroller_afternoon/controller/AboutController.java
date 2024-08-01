package org.scoula.frontcontroller_afternoon.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutController implements Controller {
    @Override
    public String getView(HttpServletRequest request , HttpServletResponse response) {
        request.setAttribute("msg", "컨트롤러가 전달한 메세지 입니다");
        request.setAttribute("imgSrc", "https://img0.yna.co.kr/etc/inner/KR/2017/01/18/AKR20170118080100038_01_i_P4.jpg");
        return "about";
    }


}
