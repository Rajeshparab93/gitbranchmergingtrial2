package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String sayHello(){
        return "WELCOME TO FINTECH CSI PUNE";
    }

    @GetMapping("/services")
    public ResponseEntity<String> sayServices(){
        return ResponseEntity.ok("SOFTWARE DEVELOPMENT | MOBILE APP DEVELOPMENT");


    }

    @GetMapping
    public String Hello(){
        return "WELCOME TO FINTECH CSI PUNE";
    }

    @GetMapping
    public String tata(){
        return "WELCOME TO FINTECH CSI PUNE";
    }


}
