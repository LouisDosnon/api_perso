package com.example.persoapi.service.serviceImpl;

import com.example.persoapi.dto.PersoDto;
import com.example.persoapi.entity.*;
import com.example.persoapi.repository.PersoRepository;
import com.example.persoapi.service.PersoMapper;
import com.example.persoapi.service.PersoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
    public Caracteristique getPersoCaracById(String idPerso) {
        Optional<Perso> perso = this.persoRepository.findById(idPerso);
        return Objects.requireNonNull(perso.map(this::persoEntityToDto).orElse(null)).getCaracteristique();
    }

    @Override
    public Equipement getPersoEquipById(String idPerso) {
        Optional<Perso> perso = this.persoRepository.findById(idPerso);
        return Objects.requireNonNull(perso.map(this::persoEntityToDto).orElse(null)).getEquipement();
    }
}
