package org.scoula.repository.student.mybatis;


import org.apache.ibatis.annotations.Mapper;
import org.scoula.domain.StudentMybatis;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<StudentMybatis> findAll();
    public StudentMybatis findByNumber(Long number);
    public String saveStudent(StudentMybatis student);
}
