package com.example.persoapi.controller;

import com.example.persoapi.entity.ObjectInv;
import com.example.persoapi.service.InventaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persos/{id}/inventaire")
@CrossOrigin(origins = "http://localhost:5173")
public class InventaireController {

    private InventaireService inventaireService;

    public InventaireController(InventaireService inventaireService) {this.inventaireService = inventaireService;}

    @GetMapping()
    public List<ObjectInv> getModifById(@PathVariable String id) {
        return this.inventaireService.getPersoInvById(id);
    }

    @PutMapping()
    public boolean addModifById(@PathVariable String id, @RequestBody ObjectInv objectInv) {
        return this.inventaireService.addObjectInvInInv(id, objectInv);
    }

    @DeleteMapping("{idObjectInv}")
    public boolean deleteModifById(@PathVariable String id, @PathVariable int idObjectInv) {
        return this.inventaireService.deleteObjectInvFromInv(id, idObjectInv);
    }
}
