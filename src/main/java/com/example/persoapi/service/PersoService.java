package com.example.persoapi.service;

import com.example.persoapi.dto.PersoDto;
import com.example.persoapi.entity.*;

import java.lang.module.ModuleFinder;
import java.util.List;

public interface PersoService {
    List<PersoDto> getAllPerso();

    PersoDto getPersoById(String idPerso);

    Caracteristique getPersoCaracById(String idPerso);

    Equipement getPersoEquipById(String idPerso);
}
