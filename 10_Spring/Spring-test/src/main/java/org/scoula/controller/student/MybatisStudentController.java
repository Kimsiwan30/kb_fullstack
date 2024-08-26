package org.scoula.controller.student;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.domain.StudentMybatis;
import org.scoula.repository.student.mybatis.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/student/mybatis")
public class MybatisStudentController {
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

    @PostMapping("/save")
    public ResponseEntity<StudentMybatis> save(
            @RequestParam("name") String name,
            @RequestParam("age") int age
    ){
        StudentMybatis newStudent = new StudentMybatis();
        newStudent.setName(name);
        newStudent.setAge(age);
        // 생성자로 하면 만들어질떄 값을 넣어서 생성
        // 게터세터로 생성하면 만들어놓고 값을 넣어주는 것

        int affectedRows = studentRepository.saveStudent(newStudent);

        if(affectedRows ==0){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }else {
            return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
        }

    }

    @DeleteMapping(value = "/delete/{number}", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> delete(@PathVariable Long number){
        int affectedRows = studentRepository.deleteStudent(number);
        if(affectedRows == 0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("게시글 삭제 실패");
        }else {
            return ResponseEntity.ok("게시글 삭제 성공");
        }
    }

    
}
