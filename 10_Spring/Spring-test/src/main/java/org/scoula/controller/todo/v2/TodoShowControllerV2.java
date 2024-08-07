package org.scoula.controller.todo.v2;

import lombok.extern.slf4j.Slf4j;
import org.scoula.dto.todo.TodoDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j

public class TodoShowControllerV2 {
    private TodoDtoListV2 todoDtoList;

   @Autowired
   public TodoShowControllerV2(TodoDtoListV2 todoDtoList) {
       this.todoDtoList = todoDtoList;
   }
    @GetMapping("/todo/v2/show")
    public String process(Model model){
        log.info("========> 1000 리스트 보기 페이지 호출, /todo/v2/show");

        model.addAttribute("todoDtoList", todoDtoList.getList());

        return "todo-show2";
    }

}
