package org.scoula.controller.student;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.domain.Student;
import org.scoula.repository.student.jpa.JpaStudentRepository;
import org.scoula.repository.student.mybatis.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@Transactional
@RequestMapping("/student/jpa")
public class JpaStudentController {
    private final JpaStudentRepository jpaStudentRepository;

    @GetMapping("/show")
    public ResponseEntity<List<Student>> findAll() {
       List<Student> studentList = jpaStudentRepository.findAll();
       return ResponseEntity.ok(studentList);
    }
}
