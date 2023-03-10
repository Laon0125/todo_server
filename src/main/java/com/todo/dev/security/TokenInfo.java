package com.todo.dev.security;

import io.jsonwebtoken.Claims;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TokenInfo {
    private Integer id;
    private String name;
    private String phoneNumber;

    public TokenInfo parseToken(Claims claims) {
        Integer id = (Integer) claims.get("id");
        String name = (String) claims.get("name");
        String phone_number = (String) claims.get("phoneNumber");

        System.out.println(phone_number);

        return new TokenInfo(id,name,phone_number);
    }

}
