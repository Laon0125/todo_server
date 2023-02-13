package com.todo.dev.domain.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class FriendTodos {
    private final Integer id;
    private final LocalDateTime crateDate;
    private final String content;
    private final String name;
}
