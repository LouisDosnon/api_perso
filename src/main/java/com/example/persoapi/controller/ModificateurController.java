package com.example.persoapi.controller;

import com.example.persoapi.entity.Modificateur;
import com.example.persoapi.service.ModificateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persos/{id}/modificateur")
@CrossOrigin(origins = "http://localhost:5173")
public class ModificateurController {

    private ModificateurService modificateurService;

    public ModificateurController(ModificateurService modificateurService) {this.modificateurService = modificateurService;}

    @GetMapping()
    public List<Modificateur> getModifById(@PathVariable String id) {
        return this.modificateurService.getPersoModifById(id);
    }

    @PutMapping()
    public boolean addtModifById(@PathVariable String id, @RequestBody Modificateur modif) {
        return this.modificateurService.addModifInModificateur(id, modif);
    }

    @DeleteMapping("{idModif}")
    public boolean deleteModifById(@PathVariable String id, @PathVariable int idModif) {
        return this.modificateurService.deleteModifFromModificateur(id, idModif);
    }
}
