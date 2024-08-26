package org.scoula.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    public Student() {

    }

    public Student(Long number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

}
