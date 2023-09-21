package com.example.persoapi.controller;

import com.example.persoapi.entity.Equip;
import com.example.persoapi.entity.Equipement;
import com.example.persoapi.service.EquipementService;
import org.springframework.web.bind.annotation.*;

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
    public void ModifTeteExtById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoTeteExtById(id, equip);
    }

    @PutMapping("/tete-int")
    public void ModifTeteIntById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoTeteIntById(id, equip);
    }

    @PutMapping("/torse-ext")
    public void ModifTorseExtById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoTorseExtById(id, equip);
    }

    @PutMapping("/torse-int")
    public void ModifTorseIntById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoTorseIntById(id, equip);
    }

    @PutMapping("/jambe-ext")
    public void ModifJambeExtById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoJambeExtById(id, equip);
    }

    @PutMapping("/jambe-int")
    public void ModifJambeIntById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoJambeIntById(id, equip);
    }

    @PutMapping("/pied-ext")
    public void ModifPiedExtById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoPiedExtById(id, equip);
    }

    @PutMapping("/pied-int")
    public void ModifPiedIntById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoPiedIntById(id, equip);
    }

    @PutMapping("/arme")
    public void ModifArmeById(@PathVariable String id, @RequestBody Equip equip) {
        this.equipementService.setPersoArmeById(id, equip);
    }

    @PutMapping("/autre")
    public boolean addtModifById(@PathVariable String id, @RequestBody Equip equip) {
        return this.equipementService.addEquipInAutre(id, equip);
    }

    @DeleteMapping("/autre/{idObjectInv}")
    public boolean deleteModifById(@PathVariable String id, @PathVariable int idEquip) {
        return this.equipementService.deleteEquipFromAutre(id, idEquip);
    }
}
