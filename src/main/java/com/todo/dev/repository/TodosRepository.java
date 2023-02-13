package com.todo.dev.repository;

import com.todo.dev.domain.dto.Todos;
import com.todo.dev.domain.dto.TodosPost;
import com.todo.dev.domain.request.TodosPostRequest;
import com.todo.dev.domain.response.HomeTodosResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodosRepository {
    Integer insert (Todos todos);

    Integer check(Integer id, Integer memberId);

    List<Todos> allTodos (Integer memberId);

    List<Todos> myTodos (Integer memberId);
}
