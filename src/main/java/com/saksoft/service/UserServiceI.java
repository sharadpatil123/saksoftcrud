package com.saksoft.service;

import java.util.List;

import com.saksoft.dto.UserDto;

public interface UserServiceI {

	UserDto saveUser(UserDto userDto);

	List<UserDto> getAllUser();

	UserDto updateUser(UserDto userDto, Long id);

	void deleteUser(Long id);

}
