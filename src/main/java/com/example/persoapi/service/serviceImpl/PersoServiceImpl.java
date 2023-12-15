package com.example.persoapi.service.serviceImpl;

import com.example.persoapi.dto.PersoDto;
import com.example.persoapi.entity.*;
import com.example.persoapi.repository.PersoRepository;
import com.example.persoapi.service.PersoMapper;
import com.example.persoapi.service.PersoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("perso")
public class PersoServiceImpl extends PersoMapper implements PersoService {
    private PersoRepository persoRepository;

    public PersoServiceImpl(PersoRepository persoRepository) {
        this.persoRepository = persoRepository;
    }

    @Override
    public List<PersoDto> getAllPerso() {
        List<Perso> persoList = this.persoRepository.findAll();
        List<PersoDto> persoDtoList = new ArrayList<>();
        for (Perso perso : persoList) {
            persoDtoList.add(persoEntityToDto(perso));
        }
        return persoDtoList;
    }

    @Override
    public PersoDto getPersoById(String idPerso) {
        Optional<Perso> perso = this.persoRepository.findById(idPerso);
        return perso.map(this::persoEntityToDto).orElse(null);
    }

    @Override
    public boolean addPerso(String idPerso) {
        Perso newPerso = new Perso();
        this.persoRepository.insert(newPerso);
        return true;
    }

    @Override
    public boolean removePerso(String idPerso) {
        this.persoRepository.deleteById(idPerso);
        return true;
    }

    @Override
    public void setPersoNomById(String idPerso, String nom) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.setNom(nom);
            this.persoRepository.save(personnage);
        }
    }

    @Override
    public void setPersoClasseById(String idPerso, String classe) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.setClasse(classe);
            this.persoRepository.save(personnage);
        }
    }

    @Override
    public void setPersoRaceById(String idPerso, String race) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.setRace(race);
            this.persoRepository.save(personnage);
        }
    }

    public void setPersoPvById(String idPerso, int pv) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.setPv(pv);
            this.persoRepository.save(personnage);
        }
    }

    public void setPersoPvMaxById(String idPerso, int pvMax) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.setPv_max(pvMax);
            this.persoRepository.save(personnage);
        }
    }

    @Override
    public void setPersoLvlById(String idPerso, int lvl) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.setNiveau(lvl);
            this.persoRepository.save(personnage);
        }
    }

    @Override
    public void setPersoXpById(String idPerso, int xp) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.setXp(xp);
            this.persoRepository.save(personnage);
        }
    }

    @Override
    public void setPersoXpMaxById(String idPerso, int xpMax) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.setXp_max(xpMax);
            this.persoRepository.save(personnage);
        }
    }

    @Override
    public void setPersoImageById(String idPerso, String url) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.setImage(url);
            this.persoRepository.save(personnage);
        }
    }
}
