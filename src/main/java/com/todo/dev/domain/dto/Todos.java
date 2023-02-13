package com.todo.dev.domain.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todos {
    private Integer id;
    private Integer memberId;
    private LocalDateTime createDate;
    private String content;
    private Boolean checked;
}
