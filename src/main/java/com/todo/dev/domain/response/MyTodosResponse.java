package com.todo.dev.domain.response;

import com.todo.dev.domain.dto.Todos;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;



@Getter
@RequiredArgsConstructor
public class MyTodosResponse {

    private final Integer id;
    private final LocalDateTime create_date;
    private final String content;
    private final Boolean checked;

    public MyTodosResponse(Todos todos) {
        this.id = todos.getId();
        this.create_date = todos.getCreateDate();
        this.content = todos.getContent();
        this.checked = todos.getChecked();
    }
}
