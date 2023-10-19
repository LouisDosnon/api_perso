package com.example.persoapi.controller;

import com.example.persoapi.entity.Monaie;
import com.example.persoapi.service.MonaieService;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;

@RestController
@RequestMapping("/persos/{id}/monaie")
@CrossOrigin(origins = "http://localhost:5173")
public class MonaieController {

    private MonaieService monaieService;

    public MonaieController(MonaieService monaieService) {
        this.monaieService = monaieService;
    }

    @GetMapping()
    public Monaie getMonaieById(@PathVariable String id) {
        return this.monaieService.getPersoMonaieById(id);
    }

    @PutMapping("/or")
    public Response setOrById(@PathVariable String id, @RequestBody int or) {
        this.monaieService.setPersoOrById(id, or);
        return Response.ok().build();
    }

    @PutMapping("/argent")
    public Response setArgentById(@PathVariable String id, @RequestBody int argent) {
        this.monaieService.setPersoArgentById(id, argent);
        return Response.ok().build();
    }

    @PutMapping("/bronze")
    public Response setBronzeById(@PathVariable String id, @RequestBody int bronze) {
        this.monaieService.setPersoBronzeById(id, bronze);
        return Response.ok().build();
    }
}
