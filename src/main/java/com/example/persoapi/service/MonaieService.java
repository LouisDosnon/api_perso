package com.example.persoapi.service;

import com.example.persoapi.entity.Monaie;


public interface MonaieService {

    Monaie getPersoMonaieById(String idPerso);

    void setPersoOrById(String idPerso, int or);

    void setPersoArgentById(String idPerso, int argent);

    void setPersoBronzeById(String idPerso, int bronze);

}
