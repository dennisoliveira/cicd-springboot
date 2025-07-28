package com.example.cicd_springboot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String hello() {
        return """
               <!DOCTYPE html>
               <html>
                 <head>
                   <title>GitHub Actions - CI/CD</title>
                   <style>
                     body {
                       background: #161b22;
                       color: #fff;
                   </style>
                 </head>
                 <body>
                   <h1>Olá mundo!</h1>
                 </body>
               </html>
               """;
    }
}
