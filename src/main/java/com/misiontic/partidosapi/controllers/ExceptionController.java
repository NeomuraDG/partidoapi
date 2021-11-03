package com.misiontic.partidosapi.controllers;

import com.misiontic.partidosapi.exceptions.CustomException;
import com.misiontic.partidosapi.exceptions.Mensaje;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

  /*  
  Aqui descubri que el compilador no reconocio correctamente la clase 
  CustomExeption,lo que hice fue que reescribi la clase 
  y reinicie el servidor
  @ExceptionHandler(CustomExeption.class)
    public Mensaje ErrorException(CustomExeption exception){
        return new Mensaje("CustomExeption",exeption.getMessage());
    }
    */
    @ExceptionHandler(CustomException.class)
    public Mensaje ErrorException(CustomException exception){
        return new Mensaje("CustomExeption",exception.getMessage());
    }
}
