package com.example.persoapi.controller;

import com.example.persoapi.entity.Competence;
import com.example.persoapi.service.CompetencesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persos/{id}/competences")
@CrossOrigin(origins = "http://localhost:5173")
public class CompetencesController {

    private CompetencesService competencesService;

    public CompetencesController(CompetencesService competencesService) {this.competencesService = competencesService;}

    @GetMapping()
    public List<Competence> getCompById(@PathVariable String id) {
        return this.competencesService.getPersoCompetencesById(id);
    }

    @PutMapping

    public boolean addCompById(@PathVariable String id, @RequestBody Competence comp) {
        return this.competencesService.addCompetencesInCompetences(id, comp);
    }

    @DeleteMapping("{idComp}")

    public boolean deleteCompById(@PathVariable String id, @PathVariable int idComp) {
        return this.competencesService.deleteCompetenceFromCompetences(id, idComp);
    }
}
