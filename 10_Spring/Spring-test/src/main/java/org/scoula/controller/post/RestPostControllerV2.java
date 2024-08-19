package org.scoula.controller.post;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.dto.post.PostDto;
import org.scoula.dto.post.PostRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/post/v2/rest")
public class RestPostControllerV2 {
    private final PostRepo postRepo;
    private String context = "/post";

    // 게시글 목록 보기
    @GetMapping("/show")
    public ResponseEntity<List<PostDto>> postList(HttpServletRequest request) {
        log.info("=========> 게시글 목록 페이지 호출, " + request.getRequestURI());

        List<PostDto> list = postRepo.findAll();

        // ok = 200번대
        return ResponseEntity.ok(list);

    }

    @GetMapping(value = "/test", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> test(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("요청을 처리할 수 없습니다");
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

    // 삭제 기능 컨트롤러
    @DeleteMapping(value = "/delete", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> postDelete(@RequestParam("id") Long id, HttpServletRequest request){
        log.info("=====================> 게시글 삭제 기능 호출, " + request.getRequestURI());
        int affectedRows = postRepo.delete(id);

        if(affectedRows > 0){
            return ResponseEntity.ok("삭제 성공");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("삭제 실패");
        }
    }
}
