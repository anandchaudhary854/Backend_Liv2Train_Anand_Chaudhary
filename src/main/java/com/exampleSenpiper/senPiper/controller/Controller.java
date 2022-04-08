package com.exampleSenpiper.senPiper.controller;

import com.exampleSenpiper.senPiper.model.Center;
import com.exampleSenpiper.senPiper.service.CenterService;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolationException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class Controller {


    @Autowired
    CenterService centerService;


    //Upload a center
    @PostMapping("/uploadCenter")
    public Center uploadCenter(@RequestBody Center center) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String createdOn = now.format(dtf);
        center.setCreatedOn(createdOn);
        if (center.getEmail() == ""){
            center.setEmail(null);
        }
//        this.centerService.save(center);
        try{
            this.centerService.save(center);
        }catch (ConstraintViolationException constraintViolationException){
            throw new com.exampleSenpiper.senPiper.exception.ConstraintViolationException("Please enter appropriate information in all the mandatory fields");
        }

        return center;
    }


    // get all saved centers
    @GetMapping("/getAllCenters")
    public List<Center> getAllCenters(){
        return centerService.findAll();
    }






}
