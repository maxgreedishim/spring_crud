package com.javamaster.spring_crud.service;


import com.javamaster.spring_crud.dto.UsersDto;
import com.javamaster.spring_crud.entity.Users;
import com.javamaster.spring_crud.exception.ValidationException;
import com.javamaster.spring_crud.repository.UsersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;

class DefaultUsersServiceTest {
   private UserService userService;
   private UsersRepository usersRepository;
   private UsersConverter usersConverter;
   private Users users;

   @BeforeEach
    void setUp(){
       usersRepository = mock(UsersRepository.class);
       usersConverter = new UsersConverter();
       users = Users.builder().name("testName").login("testLogin").id(1).build();
       userService = new DefaultUsersService(usersRepository, usersConverter);
   }

   @Test
    void saveUserReturnUserDto() throws ValidationException {
       UsersDto usersDto = UsersDto.builder().login("testLogin").build();
       UsersDto savedUsersDto = userService.saveUser(usersDto);
       assertThat(savedUsersDto).isNotNull();
       assertThat(savedUsersDto.getLogin()).isEqualTo("testLogin");
   }
}