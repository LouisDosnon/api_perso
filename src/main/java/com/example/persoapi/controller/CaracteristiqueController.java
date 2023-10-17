package com.example.persoapi.controller;

import com.example.persoapi.entity.Caracteristique;
import com.example.persoapi.service.CaracteristiqueService;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;

@RestController
@RequestMapping("/persos/{id}/caracteristique")
@CrossOrigin(origins = "http://localhost:5173")
public class CaracteristiqueController {

    private CaracteristiqueService caracteristiqueService;


    public CaracteristiqueController(CaracteristiqueService caracteristiqueService) {
        this.caracteristiqueService = caracteristiqueService;
    }

    @GetMapping()
    public Caracteristique getCaracById(@PathVariable String id) {
        return this.caracteristiqueService.getPersoCaracteristiqueById(id);
    }

    @PutMapping("/charisme")

    public Response ModifCharismeById(@PathVariable String id, @RequestBody int charisme) {
        this.caracteristiqueService.setPersoCharismeById(id, charisme);
        return Response.ok().build();
    }

    @PutMapping("/courage")

    public Response ModifCourageById(@PathVariable String id, @RequestBody int courage) {
        this.caracteristiqueService.setPersoCourageById(id, courage);
        return Response.ok().build();
    }

    @PutMapping("/adresse")

    public Response ModifAdresseById(@PathVariable String id, @RequestBody int adresse) {
        this.caracteristiqueService.setPersoAdresseById(id, adresse);
        return Response.ok().build();
    }

    @PutMapping("/intelligence")

    public Response ModifIntelligenceById(@PathVariable String id, @RequestBody int intelligence) {
        this.caracteristiqueService.setPersoIntelligenceById(id, intelligence);
        return Response.ok().build();
    }

    @PutMapping("/force")

    public Response ModifForceById(@PathVariable String id, @RequestBody int force) {
        this.caracteristiqueService.setPersoForceById(id, force);
        return Response.ok().build();
    }

    @PutMapping("/attaque")

    public Response ModifAttaqueById(@PathVariable String id, @RequestBody int attaque) {
        this.caracteristiqueService.setPersoAttaqueById(id, attaque);
        return Response.ok().build();
    }

    @PutMapping("/parade")

    public Response ModifParadeById(@PathVariable String id, @RequestBody int parade) {
        this.caracteristiqueService.setPersoParadeById(id, parade);
        return Response.ok().build();
    }

    @PutMapping("/destin")

    public Response ModifDestinById(@PathVariable String id, @RequestBody int destin) {
        this.caracteristiqueService.setPersoDestinById(id, destin);
        return Response.ok().build();
    }

    @PutMapping("/energie_astrale")

    public Response ModifEnergieAstraleById(@PathVariable String id, @RequestBody int energieAstrale) {
        this.caracteristiqueService.setPersoEnergieAstraleById(id, energieAstrale);
        return Response.ok().build();
    }

    @PutMapping("/energie_astrale_max")

    public Response ModifEnergieAstraleMaxById(@PathVariable String id, @RequestBody int energieAstraleMax) {
        this.caracteristiqueService.setPersoEnergieAstraleMaxById(id, energieAstraleMax);
        return Response.ok().build();
    }
}
