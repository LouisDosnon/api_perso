package com.example.persoapi.service;

import com.example.persoapi.dto.PersoDto;
import com.example.persoapi.entity.Caracteristique;

import java.util.List;

public interface PersoService {
    List<PersoDto> getAllPerso();

    PersoDto getPersoById(String idPerso);

    Caracteristique getPersoCaracById(String idPerso);
}
