package org.scoula.controller.post;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.dto.post.PostDto;
import org.scoula.dto.post.PostRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/post/v1/rest")
public class RestPostController {
    private final PostRepo postRepo;
    private String context = "/post";

    // 게시글 목록 보기
    @GetMapping("/show")
    public List<PostDto> postList(HttpServletRequest request) {
        log.info("=========> 게시글 목록 페이지 호출, " + request.getRequestURI());

        List<PostDto> list = postRepo.findAll();

        return list;

    }

    @GetMapping("/search")
    public List<PostDto> postSearch(
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            HttpServletRequest request
    ){
        log.info("==============> 게시글 검색 기능 호출, " + request.getRequestURI());

        List<PostDto> serachedList = postRepo.findByCondition(title, content);
        return serachedList;
    }

}
