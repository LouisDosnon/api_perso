package com.example.persoapi.service.serviceImpl;

import com.example.persoapi.entity.Equip;
import com.example.persoapi.entity.Equipement;
import com.example.persoapi.entity.Perso;
import com.example.persoapi.repository.PersoRepository;
import com.example.persoapi.service.EquipementService;
import com.example.persoapi.service.PersoMapper;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service("equipement")
public class EquipementServiceImpl extends PersoMapper implements EquipementService {

    private PersoRepository persoRepository;

    public EquipementServiceImpl(PersoRepository persoRepository) {this.persoRepository = persoRepository;}

    @Override
    public Equipement getPersoEquipementById(String idPerso) {
        Optional<Perso> perso = this.persoRepository.findById(idPerso);
        return Objects.requireNonNull(perso.map(this::persoEntityToDto).orElse(null)).getEquipement();
    }

    @Override
    public void setPersoTeteExtById(String idPerso, Equip equip) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getEquipement().setTete_ext(equip);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoTeteIntById(String idPerso, Equip equip) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getEquipement().setTete_int(equip);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoTorseExtById(String idPerso, Equip equip) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getEquipement().setTorse_ext(equip);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoTorseIntById(String idPerso, Equip equip) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getEquipement().setTorse_int(equip);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoJambeExtById(String idPerso, Equip equip) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getEquipement().setJambe_ext(equip);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoJambeIntById(String idPerso, Equip equip) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getEquipement().setJambe_int(equip);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoPiedExtById(String idPerso, Equip equip) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getEquipement().setPied_ext(equip);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoPiedIntById(String idPerso, Equip equip) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getEquipement().setPied_int(equip);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public void setPersoArmeById(String idPerso, Equip equip) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getEquipement().setArme(equip);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
    }

    @Override
    public boolean addEquipInAutre(String id, Equip equip) {
        Optional<Perso> persoOptional = this.persoRepository.findById(id);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            res = personnage.getEquipement().getAutre().add(equip);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
        return res;
    }

    @Override
    public boolean deleteEquipFromAutre(String id, int equipId) {
        Optional<Perso> persoOptional = this.persoRepository.findById(id);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            res = (personnage.getEquipement().getAutre().remove(equipId) != null);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getCaracteristique());
        }
        return res;
    }
}
