package com.todo.dev.domain.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todos {
    private Integer id;
    private Integer member_id;
    private LocalDateTime create_date;
    private String content;
    private Boolean checked;
}
