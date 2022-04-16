package com.example.user.service;

import com.example.user.dto.LoginDTO;
import com.example.user.dto.ResponseDTO;
import com.example.user.dto.UserDTO;
import com.example.user.entity.UserData;
import org.springframework.http.ResponseEntity;

public interface IUserService {
    public ResponseEntity<ResponseDTO> saveUser(UserDTO userDTO);
    public ResponseEntity<ResponseDTO> getUserById(String token);
    public ResponseEntity<ResponseDTO> UpdateData(String token, UserDTO userDTO);
    public ResponseEntity<ResponseDTO> getAllUsersById(String token);
    public ResponseEntity<ResponseDTO> login(String email, String password, String token) throws NoSuchFieldException;
    ResponseEntity<ResponseDTO> verify(String token);
    ResponseEntity<ResponseDTO> forgetPassword(LoginDTO forgetDTO, String token);
    ResponseEntity<ResponseDTO> resetPassword(LoginDTO resetPasswordDTO);
    ResponseEntity<ResponseDTO> deleteUser(int id);
}
