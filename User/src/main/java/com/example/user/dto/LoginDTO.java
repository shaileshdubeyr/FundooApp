package com.example.user.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author shailesh dubey
 * @Version 16.0.2
 * @Since 24-03-2022
 */
public class LoginDTO {
    //properties of user login
    public String token;
    @NotBlank(message = "Email not blank")
    public String email;
    @NotBlank(message = "password not balank")
    @Size(min = 6, max = 15, message = "min six charater and max 15 charater")
    public String password;
}
