package org.scoula.repository.todo.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.scoula.domain.TodoMybatis;

import java.util.List;

@Mapper
public interface TodoMapper {
    public List<TodoMybatis> findAll();
    public TodoMybatis findById(@Param("id")Long id);
    public int save(TodoMybatis todoMybatis);
    public int delete(Long id);
}
