package org.scoula.controller.todo;

import lombok.extern.slf4j.Slf4j;
import org.scoula.dto.todo.TodoDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
@RequestMapping("/todo/v3")
public class TodoControllerV3 {
    private TodoDtoListV2 todoDtoList;

    @Autowired
    public TodoControllerV3(TodoDtoListV2 todoDtoList) {
        this.todoDtoList = todoDtoList;
    }

    @GetMapping("/show")
    public String todoList(Model model) {
        log.info("========> 1000 리스트 보기 페이지 호출, /todo/v2/show");

        model.addAttribute("todoDtoList", todoDtoList.getList());

        return "todo-show3";
    }

    @GetMapping("/form")
    public String todoForm(Model model) {
        log.info("===========> Todo 추가 페이지 호출, /todo/v3/form");

        return "todo-form3";
    }

    @PostMapping("/form/save")
    public String todoSave(
            @RequestParam("todo") String todo,
            Model model
    ) {
        log.info("========> 회원 추가 Request, /todo/v3/form/save");


        todoDtoList.addList(todo);
        model.addAttribute("todoDtoList", todoDtoList.getList());
        return "todo-show3";
    }
}
