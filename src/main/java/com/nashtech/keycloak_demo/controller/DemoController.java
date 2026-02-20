package com.nashtech.keycloak_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/user/hello")
    public String user() {
        return "Hello User";
    }

    @GetMapping("/admin/hello")
    public String admin() {
        return "Hello Admin";
    }
}

