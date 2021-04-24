package com.uplus.scuserservice.service;


import com.uplus.scuserservice.dto.UserDto;
import com.uplus.scuserservice.jpa.UserEntity;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();

}
