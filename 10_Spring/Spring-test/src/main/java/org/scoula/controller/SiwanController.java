package org.scoula.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/siwan/v1")
public class SiwanController {

    @GetMapping("/show")
    public String process(){
        return "siwan";
    }
    @GetMapping("/show2")
    public String process2(){
        return "/siwan/siwan2";
    }
}
