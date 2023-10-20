package com.example.persoapi.service;

import com.example.persoapi.dto.PersoDto;
import com.example.persoapi.entity.Perso;

public abstract class PersoMapper {
    public Perso persoDtoToEntiy(PersoDto persoDto) {
        Perso perso = new Perso();
        perso.setId(persoDto.getId());
        perso.setNom(persoDto.getNom());
        perso.setImage(persoDto.getImage());
        perso.setRace(persoDto.getRace());
        perso.setClasse(persoDto.getClasse());
        perso.setPv(persoDto.getPv());
        perso.setPv_max(persoDto.getPv_max());
        perso.setNiveau(persoDto.getNiveau());
        perso.setXp(persoDto.getXp());
        perso.setXp_max(persoDto.getXp_max());
        perso.setCaracteristique(persoDto.getCaracteristique());
        perso.setCompetences(persoDto.getCompetences());
        perso.setEquipement(persoDto.getEquipement());
        perso.setInventaire(persoDto.getInventaire());
        perso.setMonaie(persoDto.getMonaie());
        perso.setCoup_speciaux(persoDto.getCoup_speciaux());
        perso.setModificateurs(persoDto.getModificateurs());
        return perso;
    }

    public PersoDto persoEntityToDto(Perso perso) {
        PersoDto persoDto = new PersoDto();
        persoDto.setId(perso.getId());
        persoDto.setNom(perso.getNom());
        persoDto.setImage(perso.getImage());
        persoDto.setRace(perso.getRace());
        persoDto.setClasse(perso.getClasse());
        persoDto.setPv(perso.getPv());
        persoDto.setPv_max(perso.getPv_max());
        persoDto.setNiveau(perso.getNiveau());
        persoDto.setXp(perso.getXp());
        persoDto.setXp_max(perso.getXp_max());
        persoDto.setCaracteristique(perso.getCaracteristique());
        persoDto.setCompetences(perso.getCompetences());
        persoDto.setEquipement(perso.getEquipement());
        persoDto.setInventaire(perso.getInventaire());
        persoDto.setMonaie(perso.getMonaie());
        persoDto.setCoup_speciaux(perso.getCoup_speciaux());
        persoDto.setModificateurs(perso.getModificateurs());
        return persoDto;
    }
}
