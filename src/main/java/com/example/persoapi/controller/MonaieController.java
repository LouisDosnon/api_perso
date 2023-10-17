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

    @GetMapping()
    public Monaie getMonaieById(@PathVariable String id) {
        return this.monaieService.getPersoMonaieById(id);
    }

    @PutMapping()

    public Response setMonaieById(@PathVariable String id, @RequestBody Monaie monaie) {
        this.monaieService.setPersoMonaieById(id, monaie);
        return Response.ok().build();
    }
}
