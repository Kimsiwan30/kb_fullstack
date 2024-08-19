package org.scoula.dto.siwan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SiwanDto2 {
    private int no;
    private String title;
    private String content;
    private String writer;
    private String reg_date;
    private String update_date;
}
