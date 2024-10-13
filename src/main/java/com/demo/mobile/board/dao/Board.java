package com.demo.mobile.board.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private String authorId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int upVote;
    private String type;
}
