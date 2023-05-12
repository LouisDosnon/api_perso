package com.example.persoapi.controller;

import com.example.persoapi.dto.PersoDto;
import com.example.persoapi.entity.*;
import com.example.persoapi.service.PersoService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}/caracteristique")
    public Caracteristique getCaracById(@PathVariable String id) {
        return this.persoService.getPersoCaracById(id);
    }

    @GetMapping("/{id}/coup-speciaux")
    public List<CoupS> getCoupSById(@PathVariable String id) {
        return this.persoService.getPersoCoupSById(id);
    }

    @GetMapping("/{id}/equipement")
    public Equipement getEquipById(@PathVariable String id) {
        return this.persoService.getPersoEquipById(id);
    }

    @GetMapping("/{id}/modificateur")
    public List<Modificateur> getModifById(@PathVariable String id) {
        return this.persoService.getPersoModifById(id);
    }

    @GetMapping("/{id}/monaie")
    public Monaie getMonaieById(@PathVariable String id) {
        return this.persoService.getPersoMonaieById(id);
    }

    @GetMapping("/{id}/inventaire")
    public List<ObjectInv> getInvById(@PathVariable String id) {
        return this.persoService.getPersoInvById(id);
    }
}
