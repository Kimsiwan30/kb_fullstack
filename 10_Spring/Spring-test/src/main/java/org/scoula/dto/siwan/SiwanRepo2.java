package org.scoula.dto.siwan;


import lombok.RequiredArgsConstructor;
import org.scoula.mapper.SiwanMapper;
import org.scoula.mapper.SiwanMapper2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SiwanRepo2 {
    private final SiwanMapper2 siwanMapper2;

    public List<SiwanDto2> findAll(){
        return siwanMapper2.findAll();
    }
}
