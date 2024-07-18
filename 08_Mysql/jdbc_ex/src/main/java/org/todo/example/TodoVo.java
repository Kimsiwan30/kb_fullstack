package org.todo.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class TodoVo {
    private String id;
    private String user_id;
    private String todo;
    private Boolean is_completed;
    private Timestamp created_at;

}
