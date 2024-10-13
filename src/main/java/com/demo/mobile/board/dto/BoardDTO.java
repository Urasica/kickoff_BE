package com.demo.mobile.board.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class BoardDTO {
    @NotNull
    private Long id;
    @NotEmpty
    private String title;
    @NotEmpty
    private String content;
    @NotEmpty
    private String authorId;
    @NotEmpty
    private LocalDateTime createdAt;
    @NotEmpty
    private LocalDateTime updatedAt;
    @NotNull
    private int upVote;
    @NotEmpty
    private String type;
    @NotNull
    private int commentCount;
}
