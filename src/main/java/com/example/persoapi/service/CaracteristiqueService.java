package com.example.persoapi.service;

import com.example.persoapi.entity.Caracteristique;


public interface CaracteristiqueService {

    Caracteristique getPersoCaracteristiqueById(String idPerso);

    void setPersoCharismeById(String idPerso, int charisme);

    void setPersoCourageById(String idPerso, int courage);

    void setPersoAdresseById(String idPerso, int adresse);

    void setPersoIntelligenceById(String idPerso, int intelligence);

    void setPersoForceById(String idPerso, int force);

    void setPersoAttaqueById(String idPerso, int attaque);

    void setPersoParadeById(String idPerso, int parade);

    void setPersoDestinById(String idPerso, int destin);

    void setPersoEnergieAstraleById(String idPerso, int energie_astrale);

    void setPersoEnergieAstraleMaxById(String idPerso, int energie_astrale_max);

}
