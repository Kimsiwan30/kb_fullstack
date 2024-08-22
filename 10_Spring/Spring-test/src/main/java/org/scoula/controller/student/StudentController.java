package org.scoula.controller.student;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.domain.StudentMybatis;
import org.scoula.domain.TodoMybatis;
import org.scoula.repository.student.mybatis.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/student/mybatis")
public class StudentController {
    private final StudentRepository studentRepository;

    @GetMapping("/show")
    public ResponseEntity<List<StudentMybatis>> findAll() {
        List<StudentMybatis> students = studentRepository.findAll();
        return ResponseEntity.ok(students);

    }

    @GetMapping("/find/{number}")
    public ResponseEntity<StudentMybatis> findByNumber(@PathVariable Long number) {
        StudentMybatis studentMybatis = studentRepository.findByNumber(number);

        if(studentMybatis == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(studentMybatis);
    }

    
}
