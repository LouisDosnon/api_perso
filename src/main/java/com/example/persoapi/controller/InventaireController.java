package com.example.persoapi.controller;

import com.example.persoapi.entity.ObjectInv;
import com.example.persoapi.service.InventaireService;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
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
    public Response addModifById(@PathVariable String id, @RequestBody ObjectInv objectInv) {
        this.inventaireService.addObjectInvInInv(id, objectInv);
        return Response.ok("element cree").build();
    }

    @DeleteMapping("{idObjectInv}")
    public Response deleteModifById(@PathVariable String id, @PathVariable int idObjectInv) {
        this.inventaireService.deleteObjectInvFromInv(id, idObjectInv);
        return Response.ok("element supprime").build();
    }
}
