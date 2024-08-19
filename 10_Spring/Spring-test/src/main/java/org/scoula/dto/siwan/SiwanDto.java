package org.scoula.dto.siwan;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SiwanDto {
    private int id;
    private String title;
    private String content;
}
