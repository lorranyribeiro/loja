package com.pitagoras.loja.controller;

import com.pitagoras.loja.dto.ExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class BaseController {



    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public ExceptionDTO handleException(Exception e){
        return new ExceptionDTO(e.getMessage());
    }
}
