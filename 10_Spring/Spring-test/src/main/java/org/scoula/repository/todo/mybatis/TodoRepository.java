package org.scoula.repository.todo.mybatis;

import lombok.RequiredArgsConstructor;
import org.scoula.domain.TodoMybatis;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TodoRepository {
    private final TodoMapper todoMapper;

    public List<TodoMybatis> findAll(){
        return todoMapper.findAll();
    }
    public TodoMybatis findById(Long id){
        return todoMapper.findById(id);
    }
    public int save(TodoMybatis todoMybatis){return todoMapper.save(todoMybatis);}
    public int delete(Long id){return todoMapper.delete(id);}
}
