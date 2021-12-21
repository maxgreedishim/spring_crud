package com.javamaster.spring_crud.service;

import com.javamaster.spring_crud.dto.UsersDto;
import com.javamaster.spring_crud.exception.ValidationException;

public interface UserService {

    UsersDto saveUser(UsersDto usersDto) throws ValidationException;

    void deleteUser (Integer userId);

    UsersDto findByLogin(String login);



}
