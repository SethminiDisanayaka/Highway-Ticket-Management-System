package com.example.user_service.controller;

import com.example.user_service.dto.UserDTO;
import com.example.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    UserService userServices;

    @PostMapping
    public void healthChecking() {
        System.out.println("User Worked...");
    }

    @PostMapping
    @RequestMapping("/save")
    public void userSave(@RequestBody UserDTO userDTO){
        userServices.saveUser(userDTO);
    }

    @PutMapping
    @RequestMapping("/update/{updateUserId}")
    public void userUpdate(@PathVariable("updateUserId") String updateUserId ,@RequestBody UserDTO userDTO){
        userServices.updateUser(updateUserId,userDTO);
    }

    @DeleteMapping
    @RequestMapping("/delete/{deleteUserId}")
    public void userDelete(@PathVariable ("deleteUserId") String deleteUserId){
        userServices.deleteUser(deleteUserId);
    }
}
