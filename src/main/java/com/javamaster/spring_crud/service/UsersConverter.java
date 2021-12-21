package com.javamaster.spring_crud.service;

import com.javamaster.spring_crud.dto.UsersDto;
import com.javamaster.spring_crud.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {

    public Users fromUserDtoToUser(UsersDto usersDto){
        return Users.builder()
                .id(usersDto.getId())
                .email(usersDto.getEmail())
                .login(usersDto.getLogin())
                .name(usersDto.getName())
                .build();
    }

    public UsersDto fromUserToUserDto(Users users){
        return UsersDto.builder()
                .id(users.getId())
                .email(users.getEmail())
                .login(users.getLogin())
                .name(users.getName())
                .build();
    }

}
