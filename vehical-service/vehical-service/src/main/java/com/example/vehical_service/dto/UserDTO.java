package com.example.vehical_service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements SuperDTO{
    private String userId;
    private String userMail;
    private String userName;
    private String password;
}
