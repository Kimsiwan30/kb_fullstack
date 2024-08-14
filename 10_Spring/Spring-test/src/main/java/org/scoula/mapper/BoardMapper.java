package org.scoula.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.scoula.dto.board.BoardDto;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<BoardDto> getList();
    public BoardDto get(long no);
    public int create(BoardDto board);
    public int update(BoardDto board);
    public int delete(Long no);

}
