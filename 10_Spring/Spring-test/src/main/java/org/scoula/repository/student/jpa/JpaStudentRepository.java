package org.scoula.repository.student.jpa;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.domain.Student;
import org.scoula.repository.student.mybatis.StudentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Repository
public class JpaStudentRepository {
    private final EntityManager em;

    public List<Student> findAll() {
        String jpql = "select s from Student s";
        List<Student> studentList = em.createQuery(jpql, Student.class).getResultList();
        return studentList;
    }
}
