package com.example.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * @Author shailesh dubey
 * @Version 16.0.2
 * @Since 23-03-2022
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

    // data of the user
    @NotBlank(message = "name is madnetary")
    @Size(min = 2, max = 30, message = "must be grater then 2 charater")
    public String FirstName;
    @NotBlank(message = "name is madnetory")
    @Size(min = 2, max = 20, message = "must be grater then 2 charater")
    public String lastName;
    @NotBlank(message = "Email is madnetary")
    @NotBlank(message = "not blank email")
    public String eMail;
    @NotBlank(message = "password is madnetary")
    @Size(min = 6, max = 15, message = "password must be 8 charater")
    public String password;
    public String address;
    public Date date = new Date(System.currentTimeMillis());

}
