package com.demo.mobile.board.repository;

import com.demo.mobile.board.dao.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBoardId(Long boardId);
    int countByBoardId(Long boardId);
}
