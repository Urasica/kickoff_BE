package com.demo.mobile.board.service;

import com.demo.mobile.board.dao.Board;
import com.demo.mobile.board.dao.Comment;
import com.demo.mobile.board.repository.CommentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final BoardService boardService;

    public CommentService(CommentRepository commentRepository, BoardService boardService) {
        this.commentRepository = commentRepository;
        this.boardService = boardService;
    }

    @Transactional
    public Comment addComment(Long boardId, String content, String authorId) {
        Board board = boardService.getBoardById(boardId);
        Comment comment = new Comment();
        comment.setContent(content);
        comment.setAuthorId(authorId);
        comment.setCreatedAt(LocalDateTime.now());
        comment.setBoard(board);
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByBoardId(Long boardId) {
        return commentRepository.findByBoardId(boardId);
    }

    @Transactional
    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }
}
