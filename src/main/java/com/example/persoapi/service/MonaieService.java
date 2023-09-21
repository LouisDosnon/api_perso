package com.example.persoapi.service;

import com.example.persoapi.entity.Monaie;
import com.example.persoapi.entity.ObjectInv;

import java.util.List;


public interface MonaieService {

    Monaie getPersoMonaieById(String idPerso);

    void setPersoMonaieById(String idPerso, Monaie monaie);

}
