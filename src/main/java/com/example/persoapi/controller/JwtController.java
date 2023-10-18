package com.example.persoapi.controller;

import com.example.persoapi.filter.impl.JwtTokenGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jwtGenerator")
@CrossOrigin(origins = "http://localhost:5173")
public class JwtController {

    @GetMapping("/{login}&{password}")
    public String getJwtToken(@PathVariable String login, @PathVariable String password) {
        return JwtTokenGenerator.generate(login, password);
    }
}
