package org.scoula.controller.board;



import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.scoula.dto.board.BoardDto;
import org.scoula.mapper.BoardMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {
    private final BoardMapper boardMapper;

//    @GetMapping("")
//    public List<BoardDto> getList(){
//        return boardMapper.getList();
//    }

    @GetMapping("")
    public ResponseEntity<List<BoardDto>> getList(){
        return ResponseEntity.ok(boardMapper.getList());
    }

    @GetMapping("/{no}")
    public ResponseEntity<BoardDto> getByNo(@PathVariable("no")Long no){
        return ResponseEntity.ok(boardMapper.get(no));
    }

    @PostMapping("")
    public ResponseEntity<BoardDto> create(@RequestBody BoardDto newBoard){
        boardMapper.create(newBoard);
        return ResponseEntity.ok(newBoard);

    }

    @PutMapping("/{no}")
    public ResponseEntity<BoardDto> update(
            @PathVariable("no")Long no,
            @RequestBody BoardDto updateBoard
    ){
        updateBoard.setNo(no);
        boardMapper.update(updateBoard);
        return ResponseEntity.ok(boardMapper.get(no));

    }

    @DeleteMapping("/{no}")
    public ResponseEntity<Void> delete(@PathVariable("no") Long no){
        int affectedRows = boardMapper.delete(no);

        if(affectedRows > 0)return ResponseEntity.ok().build();
        return ResponseEntity.noContent().build();
    }

}
