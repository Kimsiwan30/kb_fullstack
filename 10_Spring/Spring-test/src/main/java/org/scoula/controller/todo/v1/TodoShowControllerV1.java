package org.scoula.controller.todo.v1;

import lombok.extern.slf4j.Slf4j;
import org.scoula.dto.todo.TodoDtoListV1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class TodoShowControllerV1 {
    private TodoDtoListV1 todoDtoListV1 = TodoDtoListV1.getInstance();

    @GetMapping("/todo/show")
    public String process(HttpServletRequest request){
        log.info("========> 1000 리스트 보기 페이지 호출, /todo/show");

        request.setAttribute("todoDtoList", todoDtoListV1.getList() );

        return "todo-show";
    }

}
