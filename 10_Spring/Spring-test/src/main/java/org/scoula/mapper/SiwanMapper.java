package org.scoula.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.scoula.dto.siwan.SiwanDto;

import java.util.List;

@Mapper
public interface SiwanMapper {
    public List<SiwanDto> findAll();
}
