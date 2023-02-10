package com.todo.dev.repository;


import com.todo.dev.domain.dto.Members;
import com.todo.dev.domain.request.LoginRequest;
import com.todo.dev.domain.request.SignUpRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembersRepository {
    Members login (LoginRequest request) ;

    Integer signUp (SignUpRequest request);

}
