package com.example.outh.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;

@RestController
public class CloudSiteController {

    @Autowired
    private RestOperations restOperations;

    @GetMapping("/")
    @ResponseBody
    public String helloFromBaeldung() {
        return "Hello From Baeldung!";
    }

    @GetMapping("/status")
    @ResponseBody
    public String status() {
        return "welcome";
    }

    @GetMapping("/personInfo")
    public String person() {
        return restOperations.getForObject("http://localhost:9000/person", String.class);
    }
}