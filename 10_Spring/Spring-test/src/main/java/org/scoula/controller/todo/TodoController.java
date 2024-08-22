package org.scoula.controller.todo;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.domain.TodoMybatis;
import org.scoula.repository.todo.mybatis.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/todo/mybatis")
public class TodoController {
    private final TodoRepository todoRepository;

    @GetMapping("/show")
    public ResponseEntity<List<TodoMybatis>> findAll() {
        List<TodoMybatis> todoMybatis = todoRepository.findAll();
        return ResponseEntity.ok(todoMybatis);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<TodoMybatis> findById(@PathVariable Long id) {
        TodoMybatis findTest = todoRepository.findById(id);

        if(findTest == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(findTest);
    }

    @PostMapping("/save")
    public ResponseEntity<TodoMybatis> save(
            @RequestParam("todo")String todo,
            @RequestParam("done")String done
    ){
        TodoMybatis todoMybatis = new TodoMybatis(null, todo, done);
        int affectedRows =todoRepository.save(todoMybatis);
        if(affectedRows == 0){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }else {
            return ResponseEntity.status(HttpStatus.CREATED).body(todoMybatis);
        }
    }


}
