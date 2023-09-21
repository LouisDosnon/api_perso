package com.example.persoapi.service.serviceImpl;

import com.example.persoapi.entity.Caracteristique;
import com.example.persoapi.entity.Competence;
import com.example.persoapi.entity.Perso;
import com.example.persoapi.repository.PersoRepository;
import com.example.persoapi.service.CaracteristiqueService;
import com.example.persoapi.service.CompetencesService;
import com.example.persoapi.service.PersoMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service("caracteristique")
public class CaracteristiqueServiceImpl extends PersoMapper implements CaracteristiqueService {

    private PersoRepository persoRepository;

    public CaracteristiqueServiceImpl(PersoRepository persoRepository) {this.persoRepository = persoRepository;}

    @Override
    public Caracteristique getPersoCaracteristiqueById(String idPerso) {
        Optional<Perso> perso = this.persoRepository.findById(idPerso);
        return Objects.requireNonNull(perso.map(this::persoEntityToDto).orElse(null)).getCaracteristique();
    }

    @Override
    public void setPersoCharismeById(String idPerso, int charisme) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getCaracteristique().setCharisme(charisme);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoCourageById(String idPerso, int courage) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getCaracteristique().setCourage(courage);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoAdresseById(String idPerso, int adresse) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getCaracteristique().setAdresse(adresse);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoIntelligenceById(String idPerso, int intelligence) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getCaracteristique().setIntelligence(intelligence);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoForceById(String idPerso, int force) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getCaracteristique().setForce(force);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoAttaqueById(String idPerso, int attaque) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
                personnage.getCaracteristique().setAttaque(attaque);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoParadeById(String idPerso, int parade) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getCaracteristique().setParade(parade);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoDestinById(String idPerso, int destin) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getCaracteristique().setDestin(destin);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoEnergieAstraleById(String idPerso, int energie_astrale) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getCaracteristique().setEnergie_astrale(energie_astrale);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoEnergieAstraleMaxById(String idPerso, int energie_astrale_max) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getCaracteristique().setEnergie_astrale_max(energie_astrale_max);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }
}
