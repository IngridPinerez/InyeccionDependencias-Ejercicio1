package com.example.ejercicioDependencias1.Exception;

import com.example.ejercicioDependencias1.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.NoSuchElementException;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = { NoSuchElementException.class })
    public ResponseEntity<Message> handleNoSuchElement(NoSuchElementException e){
        ErrorResponse error = new ErrorResponse("Error inesperado: " + e.getMessage(), 500, ZonedDateTime.now(ZoneId.of("Z")));

        return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
