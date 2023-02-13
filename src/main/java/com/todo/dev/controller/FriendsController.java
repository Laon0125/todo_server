package com.todo.dev.controller;

import com.todo.dev.domain.dto.TodosPost;
import com.todo.dev.domain.request.LoginRequest;
import com.todo.dev.domain.request.TodosPostRequest;
import com.todo.dev.domain.response.MemberResponse;
import com.todo.dev.security.SecurityService;
import com.todo.dev.service.FriendsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/friend")
public class FriendsController {
    private final SecurityService securityService;
    private final FriendsService friendsService;

    @PostMapping("/{targetId}")
    public Integer insertFriends(@PathVariable("targetId") Integer targetId ) {

        Integer myId = securityService.parseToken(securityService.getToken()).getId();
        return friendsService.insertFriend(myId, targetId);



    }
}
