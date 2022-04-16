package com.example.user.exception;

import com.example.user.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author shailesh dubey
 * @Version 16.0.2
 * @Since 24-03-2022
 */
@ControllerAdvice
public class UserExceptionHandler {
    //method to throw exception user not found
    @ExceptionHandler(UserException.class)
    public ResponseEntity<ResponseDTO> userNotFound(UserException message){
        ResponseDTO responseDTO = new ResponseDTO("exception whilw processing rest request", message.getMessage(),"token not verified");
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
    }
}
