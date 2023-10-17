package com.example.persoapi.controller;

import com.example.persoapi.entity.CoupS;
import com.example.persoapi.service.CoupSpeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persos/{id}/coup-speciaux")
@CrossOrigin(origins = "http://localhost:5173")
public class CoupSpeController {

    private CoupSpeService coupSpeService;

    public CoupSpeController(CoupSpeService coupSpeService) {this.coupSpeService = coupSpeService;}

    @GetMapping()
    public List<CoupS> getCoupSpeById(@PathVariable String id) {
        return this.coupSpeService.getPersoCoupSpeById(id);
    }

    @PutMapping()

    public boolean addCoupSpeById(@PathVariable String id, @RequestBody CoupS coupSpe) {
        return this.coupSpeService.addCoupSpeInCoupSpeList(id, coupSpe);
    }

    @DeleteMapping("{idCoupSpe}")

    public boolean deleteCoupSpeById(@PathVariable String id, @PathVariable int idCoupSpe) {
        return this.coupSpeService.deleteCoupSpeFromCoupSpeList(id, idCoupSpe);
    }
}
