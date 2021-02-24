package com.dilshan.exceptionhandelling.exception;

import com.dilshan.exceptionhandelling.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionResponseProvider {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Response> getAnimalDetails(){
        Response result = new Response();
        result.setData("Internal Server error");
        result.setResponseCode(500);
        result.setStatus("Error");
        return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
