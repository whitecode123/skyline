package com.example.skyline.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebRouteController implements ErrorController {

    @GetMapping("/error")
    public String redirectSpa() {
        return "forward:/index.html";
    }
}

