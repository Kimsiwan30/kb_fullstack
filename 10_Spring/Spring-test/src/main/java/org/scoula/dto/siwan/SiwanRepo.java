package org.scoula.dto.siwan;


import lombok.RequiredArgsConstructor;
import org.scoula.dto.post.PostDto;
import org.scoula.mapper.SiwanMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SiwanRepo {
    private final SiwanMapper siwanMapper;

    public List<SiwanDto> findAll(){
        return siwanMapper.findAll();
    }
}
