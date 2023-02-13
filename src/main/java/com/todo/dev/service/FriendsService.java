package com.todo.dev.service;

import com.todo.dev.repository.FriendsRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FriendsService {
    private final FriendsRepository friendsRepository;
    public Integer insertFriend( Integer myId, Integer targetId) {
        return friendsRepository.insertFriend(myId, targetId);
    }
}
