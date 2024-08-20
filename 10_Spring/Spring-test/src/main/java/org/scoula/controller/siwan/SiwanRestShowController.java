package org.scoula.controller.siwan;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.dto.post.PostDto;
import org.scoula.dto.siwan.SiwanDto;
import org.scoula.dto.siwan.SiwanRepo;
import org.scoula.mapper.SiwanMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/siwan/v2")
public class SiwanRestShowController {
    private final SiwanRepo siwanRepo;
    private final SiwanMapper siwanMapper;

    // 게시글 목록 보기
    @GetMapping("/show")
    public ResponseEntity<List<SiwanDto>> postList(HttpServletRequest request) {
        log.info("=========> 게시글 목록 페이지 호출, " + request.getRequestURI());

        List<SiwanDto> list = siwanRepo.findAll();


        // ok = 200번대
        return ResponseEntity.ok(list);

    }

    @GetMapping("/search")
    public SiwanDto postSearch(
            @RequestParam("id") Long id,
            HttpServletRequest request
    ){
        log.info("==============> 게시글 검색 기능 호출, " + request.getRequestURI());


        SiwanDto serachedList = siwanRepo.findById(id);
        return serachedList;
    }
}
