package com.todo.dev.domain.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class TodosPostRequest {

    private String content;


}
