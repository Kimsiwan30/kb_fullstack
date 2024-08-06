package org.scoula.dto.todo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class TodoDtoListV2 {
    private List<TodoDto> todoDtoList;

    private TodoDtoListV2() {
        this.todoDtoList = new ArrayList<>();
        this.addList("spring 외우기");
        this.addList("spring 존나외우기");
    }

    public void addList(String todo){
        todoDtoList.add(new TodoDto(todo));
    }

    public List<TodoDto> getList() {
        return todoDtoList;
    }
}
