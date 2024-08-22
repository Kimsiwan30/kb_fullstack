package org.scoula.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentMybatis {
    private Long number;
    private String name;
    private int age;
}
