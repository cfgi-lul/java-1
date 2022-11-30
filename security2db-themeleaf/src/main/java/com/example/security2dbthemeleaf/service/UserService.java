package com.example.security2dbthemeleaf.service;

import com.example.security2dbthemeleaf.dto.UserDTO;
import com.example.security2dbthemeleaf.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);

    User findUserByEmail(String email);

    List<UserDTO> findAllUsers();
}
