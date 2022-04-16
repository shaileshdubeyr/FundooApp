package com.example.user.dto;

import lombok.Data;

/**
 * @author shailesh dubey
 * @Version 16.0.2
 * @Since 24-03-2022
 */
public @Data class ResponseDTO {
    private String message;
    private Object object;
    private String token;

    /**
     *
     * @param message provide information
     * @param object which inserted into database
     * @param token JWT token which verified
     */
    public ResponseDTO(String message, Object object, String token){
        this.message = message;
        this.object = object;
        this.token = token;
    }
}
