package com.todo.dev.service;

import com.todo.dev.domain.dto.Todos;
import com.todo.dev.domain.dto.TodosPost;
import com.todo.dev.domain.request.TodosPostRequest;
import com.todo.dev.domain.response.HomeTodosResponse;
import com.todo.dev.domain.response.MyTodosResponse;
import com.todo.dev.repository.TodosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodosService {
    private final TodosRepository todosRepository;
    public Integer insertTodoService(TodosPost todosPost ) {
        Todos dto = todosPost.toDTO();
        Integer insertedRows = todosRepository.insert(dto);
        if (insertedRows!=0) {
            return dto.getId();
        }
        return 0;
    }

    public Integer checkTodo ( Integer id, Integer memberId) {
        if (todosRepository.check(id, memberId) == 1) {
            return id;
        }
        return 0;
    }
    public List<HomeTodosResponse> homeTodos(Integer memberId) {
        List<Todos> todos = todosRepository.allTodos(memberId);
        return todos.stream()
                .map(HomeTodosResponse::new)
                .collect((Collectors.toList()));
    }

    public List<MyTodosResponse> myTodos(Integer memberId) {
        List<Todos> todos = todosRepository.myTodos(memberId);
        return todos.stream()
                .map(MyTodosResponse::new)
                .collect((Collectors.toList()));

    }

}
