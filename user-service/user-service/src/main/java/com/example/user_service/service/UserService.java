package com.example.user_service.service;

import com.example.user_service.dto.UserDTO;

public interface UserService {
    void saveUser(UserDTO userDTO);
    void updateUser(String updateUserId , UserDTO userDTO);
    void deleteUser(String deleteUserId);
}
