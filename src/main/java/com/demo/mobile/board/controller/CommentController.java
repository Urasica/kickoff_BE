package com.demo.mobile.board.controller;

import com.demo.mobile.board.dao.Comment;
import com.demo.mobile.board.dto.CommentDTO;
import com.demo.mobile.board.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentService commentService;

    @Autowired

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/create")
    public Comment createComment(@RequestParam Long boardId, @RequestBody CommentDTO dto) {
        return commentService.addComment(boardId, dto.getContent(), dto.getAuthorId());
    }

    @GetMapping("/board/{boardId}")
    public List<Comment> getCommentsByBoardId(@PathVariable Long boardId) {
        return commentService.getCommentsByBoardId(boardId);
    }

    @PostMapping("/delete/{commentId}")
    public void deleteComment(@PathVariable Long commentId) {
        commentService.deleteComment(commentId);
    }
}
