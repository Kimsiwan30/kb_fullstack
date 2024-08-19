package org.scoula.controller.siwan;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.dto.siwan.SiwanDto;
import org.scoula.dto.siwan.SiwanDto2;
import org.scoula.dto.siwan.SiwanRepo;
import org.scoula.dto.siwan.SiwanRepo2;
import org.scoula.mapper.SiwanMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/siwan/v1")
public class SiwanController {
    private final SiwanRepo siwanRepo;
    private final SiwanRepo2 siwanRepo2;


    @GetMapping("/show")
    public String process(){
        return "siwan";
    }
    @GetMapping("/show2")
    public String process2(){
        return "/siwan/siwan2";
    }
    @GetMapping("/data")
    public String process3(){
        List<SiwanDto> lists = siwanRepo.findAll();
        for (SiwanDto list : lists) {
            System.out.println("#############" + list.toString());
        }

        return "siwan";
    }
    @GetMapping("/data2")
    public String process4(){
        List<SiwanDto2> lists = siwanRepo2.findAll();
        for (SiwanDto2 list : lists) {
            System.out.println("#############" + list.toString());
        }

        return "siwan";
    }
}
