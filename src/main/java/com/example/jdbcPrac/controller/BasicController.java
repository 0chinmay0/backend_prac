package com.example.jdbcPrac.controller;

import com.example.jdbcPrac.model.District;
import com.example.jdbcPrac.service.impl.GetInfoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basic")
public class BasicController {
    private GetInfoServiceImpl getInfo;
    public BasicController(GetInfoServiceImpl getInfo) {
        this.getInfo=getInfo;
    }

    @GetMapping("/get")
    public ResponseEntity<List<District>> basic(){
        System.out.println(getInfo.getAllInfo());
        return  new ResponseEntity<>(getInfo.getAllInfo(), HttpStatus.OK);
    }





}
