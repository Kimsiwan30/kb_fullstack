package org.scoula.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.scoula.dto.post.PostDto;
import org.scoula.dto.siwan.SiwanDto;

import java.util.List;

@Mapper
public interface SiwanMapper {
    List<SiwanDto> findAll();

    List<SiwanDto> findByCondition(
            @Param("title") String title,
            @Param("content") String content
    );
    // 게시글을 id 로 조회 -> 게시글 수정에서 사용
    public SiwanDto findById(@Param("id") Long id);
}
