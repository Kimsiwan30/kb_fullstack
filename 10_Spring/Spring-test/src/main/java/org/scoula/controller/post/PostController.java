package org.scoula.controller.post;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.dto.post.PostDto;
import org.scoula.dto.post.PostRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/post/v1")
public class PostController {
    private final PostRepo postRepo;
    private String context = "/post";

    // 게시글 목록 보기
    @GetMapping("/show")
    public String postList(HttpServletRequest request, Model model) {
        log.info("=========> 게시글 목록 페이지 호출, " + request.getRequestURI());

        List<PostDto> list = postRepo.findAll();
        model.addAttribute("postList", list);

        //  /post/post-show.jsp
        return context + "/post-show";
    }

    @GetMapping("/search")
    public String postSearch(
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            HttpServletRequest request,
            Model model
    ){
        log.info("==============> 게시글 검색 기능 호출, " + request.getRequestURI());

        List<PostDto> serachedList = postRepo.findByCondition(title, content);
        model.addAttribute("postList", serachedList);
        return context + "/post-show";
    }

}