package com.example.user.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
/**
 * @author shailesh dubey
 * @Version 16.0.2
 * @Since 24-03-2022
 */
public class UserException extends  RuntimeException {
        public UserException(String message){
            super(message);
        }
}
