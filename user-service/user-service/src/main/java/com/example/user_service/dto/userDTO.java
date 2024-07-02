package com.example.user_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class userDTO implements SuperDTO{
    private String userId;
    private String userMail;
    private String userName;
    private String password;
}
