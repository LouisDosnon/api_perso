package com.example.persoapi.controller;

import com.example.persoapi.entity.Equip;
import com.example.persoapi.entity.Equipement;
import com.example.persoapi.service.EquipementService;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;

@RestController
@RequestMapping("/persos/{id}/equipement")
@CrossOrigin(origins = "http://localhost:5173")
public class EquipementController {

    private EquipementService equipementService;

    public EquipementController(EquipementService equipementService) {this.equipementService = equipementService;}

    @GetMapping()
    public Equipement getCaracById(@PathVariable String id) {
        return this.equipementService.getPersoEquipementById(id);
    }

    @PutMapping("/tete-ext")

    public Response ModifTeteExtById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoTeteExtById(id, equip);
        return Response.ok().build();
    }

    @PutMapping("/tete-int")

    public Response ModifTeteIntById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoTeteIntById(id, equip);
        return Response.ok().build();
    }

    @PutMapping("/torse-ext")

    public Response ModifTorseExtById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoTorseExtById(id, equip);
        return Response.ok().build();
    }

    @PutMapping("/torse-int")
    public Response ModifTorseIntById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoTorseIntById(id, equip);
        return Response.ok().build();
    }

    @PutMapping("/jambe-ext")

    public Response ModifJambeExtById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoJambeExtById(id, equip);
        return Response.ok().build();
    }

    @PutMapping("/jambe-int")

    public Response ModifJambeIntById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoJambeIntById(id, equip);
        return Response.ok().build();
    }

    @PutMapping("/pied-ext")

    public Response ModifPiedExtById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoPiedExtById(id, equip);
        return Response.ok().build();
    }

    @PutMapping("/pied-int")

    public Response ModifPiedIntById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoPiedIntById(id, equip);
        return Response.ok().build();
    }

    @PutMapping("/arme")

    public Response ModifArmeById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoArmeById(id, equip);
        return Response.ok().build();
    }

    @PutMapping("/autre")

    public boolean addtModifById(@PathVariable String id, @RequestBody Equip equip) {
        return this.equipementService.addEquipInAutre(id, equip);
    }

    @DeleteMapping("/autre/{idEquip}")

    public boolean deleteModifById(@PathVariable String id, @PathVariable int idEquip) {
        return this.equipementService.deleteEquipFromAutre(id, idEquip);
    }
}
