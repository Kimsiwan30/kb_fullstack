package org.scoula.repository.student.mybatis;

import lombok.RequiredArgsConstructor;
import org.scoula.domain.StudentMybatis;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepository {
    private final StudentMapper studentMapper;

    public List<StudentMybatis> findAll() {
        return studentMapper.findAll();
    }

    public StudentMybatis findByNumber(Long number){
        return studentMapper.findByNumber(number);
    }
    public String saveStudent(StudentMybatis student){
        return studentMapper.saveStudent(student);
    }
}
