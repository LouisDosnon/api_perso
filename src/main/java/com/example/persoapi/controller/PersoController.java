package com.example.persoapi.controller;

import com.example.persoapi.dto.PersoDto;
import com.example.persoapi.service.PersoService;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.List;

@RestController
@RequestMapping("/persos")
@CrossOrigin(origins = "http://localhost:5173")
public class PersoController {
    private PersoService persoService;

    public PersoController(PersoService persoService) {
        this.persoService = persoService;
    }

    @GetMapping
    public List<PersoDto> getAll() {
        return this.persoService.getAllPerso();
    }

    @GetMapping("/{id}")
    public PersoDto getById(@PathVariable String id) {
        return this.persoService.getPersoById(id);
    }

    @PutMapping("/{id}")
    public boolean addPerso(@PathVariable String id) {
        return this.persoService.addPerso(id);
    }

    @DeleteMapping("/{id}")
    public boolean removePerso(@PathVariable String id) {
        return this.persoService.removePerso(id);
    }

    @PostMapping("/{id}/nom")
    public Response setNomById(@PathVariable String id, @RequestBody String nom) {
        this.persoService.setPersoNomById(id, nom);
        return Response.ok().build();
    }

    @PostMapping("/{id}/classe")
    public Response setClasseById(@PathVariable String id, @RequestBody String classe) {
        this.persoService.setPersoClasseById(id, classe);
        return Response.ok().build();
    }

    @PostMapping("/{id}/race")
    public Response setRaceById(@PathVariable String id, @RequestBody String race) {
        this.persoService.setPersoRaceById(id, race);
        return Response.ok().build();
    }

    @PostMapping("/{id}/pv")
    public Response setPvById(@PathVariable String id, @RequestBody int pv) {
        this.persoService.setPersoPvById(id, pv);
        return Response.ok().build();
    }

    @PostMapping("/{id}/pv_max")
    public Response setPvMaxById(@PathVariable String id, @RequestBody int pvMax) {
        this.persoService.setPersoPvMaxById(id, pvMax);
        return Response.ok().build();
    }

    @PostMapping("/{id}/lvl")
    public Response setLvlById(@PathVariable String id, @RequestBody int lvl) {
        this.persoService.setPersoLvlById(id, lvl);
        return Response.ok().build();
    }

    @PostMapping("/{id}/xp")
    public Response setXpById(@PathVariable String id, @RequestBody int xp) {
        this.persoService.setPersoXpById(id, xp);
        return Response.ok().build();
    }

    @PostMapping("/{id}/xp_max")
    public Response setXpMaxById(@PathVariable String id, @RequestBody int xpMax) {
        this.persoService.setPersoXpMaxById(id, xpMax);
        return Response.ok().build();
    }

    @PostMapping("{id}/image")
    public Response setImageById(@PathVariable String id, @RequestBody String url) {
        this.persoService.setPersoImageById(id, url);
        return Response.ok().build();
    }
}
