package com.dilshan.exceptionhandelling.controller;

import com.dilshan.exceptionhandelling.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @GetMapping(path = "/animal",produces = "application/json")
    public ResponseEntity<Response> getAnimalDetails(){
        Response result = new Response();
        result.setData("Lion");
        result.setResponseCode(200);
        result.setStatus("Success");
        int x = 10;
        if (x==10)
            throw new RuntimeException();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
