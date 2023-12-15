package com.example.persoapi.service;

import com.example.persoapi.dto.PersoDto;

import java.util.List;

public interface PersoService {
    List<PersoDto> getAllPerso();

    PersoDto getPersoById(String idPerso);
    boolean addPerso(String idPerso, PersoDto persoDto);
    boolean removePerso(String idPerso);
    void setPersoNomById(String idPerso, String nom);
    void setPersoClasseById(String idPerso, String classe);
    void setPersoRaceById(String idPerso, String race);
    void setPersoPvById(String idPerso, int pv);
    void setPersoPvMaxById(String idPerso, int pvMax);
    void setPersoLvlById(String idPerso, int lvl);
    void setPersoXpById(String idPerso, int xp);
    void setPersoXpMaxById(String idPerso, int xpMax);
    void setPersoImageById(String idPerso, String url);
}
