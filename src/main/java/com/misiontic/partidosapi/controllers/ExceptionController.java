package com.misiontic.partidosapi.controllers;

import com.misiontic.partidosapi.exceptions.CustomException;
import com.misiontic.partidosapi.exceptions.Mensaje;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
    
@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(CustomException.class)
    public Mensaje ErrorException(CustomException exception){
        return new Mensaje("CustomException",exception.getMessage());
    }
}
