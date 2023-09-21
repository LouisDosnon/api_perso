package com.example.persoapi.controller;

import com.example.persoapi.entity.Caracteristique;
import com.example.persoapi.entity.Competence;
import com.example.persoapi.service.CaracteristiqueService;
import com.example.persoapi.service.CompetencesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persos/{id}/caracteristique")
@CrossOrigin(origins = "http://localhost:5173")
public class CaracteristiqueController {

    private CaracteristiqueService caracteristiqueService;

    public CaracteristiqueController(CaracteristiqueService caracteristiqueService) {this.caracteristiqueService = caracteristiqueService;}

    @GetMapping()
    public Caracteristique getCaracById(@PathVariable String id) {
        return this.caracteristiqueService.getPersoCaracteristiqueById(id);
    }

    @PutMapping("/charisme")
    public void ModifCharismeById(@PathVariable String id, @RequestBody int charisme) {
        this.caracteristiqueService.setPersoCharismeById(id, charisme);
    }

    @PutMapping("/courage")
    public void ModifCourageById(@PathVariable String id, @RequestBody int courage) {
        this.caracteristiqueService.setPersoCourageById(id, courage);
    }

    @PutMapping("/adresse")
    public void ModifAdresseById(@PathVariable String id, @RequestBody int adresse) {
        this.caracteristiqueService.setPersoAdresseById(id, adresse);
    }

    @PutMapping("/intelligence")
    public void ModifIntelligenceById(@PathVariable String id, @RequestBody int intelligence) {
        this.caracteristiqueService.setPersoIntelligenceById(id, intelligence);
    }

    @PutMapping("/force")
    public void ModifForceById(@PathVariable String id, @RequestBody int force) {
        this.caracteristiqueService.setPersoForceById(id, force);
    }

    @PutMapping("/attaque")
    public void ModifAttaqueById(@PathVariable String id, @RequestBody int attaque) {
        this.caracteristiqueService.setPersoAttaqueById(id, attaque);
    }

    @PutMapping("/parade")
    public void ModifParadeById(@PathVariable String id, @RequestBody int parade) {
        this.caracteristiqueService.setPersoParadeById(id, parade);
    }

    @PutMapping("/destin")
    public void ModifDestinById(@PathVariable String id, @RequestBody int destin) {
        this.caracteristiqueService.setPersoDestinById(id, destin);
    }

    @PutMapping("/energie_astrale")
    public void ModifEnergieAstraleById(@PathVariable String id, @RequestBody int energieAstrale) {
        this.caracteristiqueService.setPersoEnergieAstraleById(id, energieAstrale);
    }

    @PutMapping("/energie_astrale_max")
    public void ModifEnergieAstraleMaxById(@PathVariable String id, @RequestBody int energieAstraleMax) {
        this.caracteristiqueService.setPersoEnergieAstraleMaxById(id, energieAstraleMax);
    }
}
