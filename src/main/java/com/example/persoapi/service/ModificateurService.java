package com.example.persoapi.service;

import com.example.persoapi.entity.*;

import java.util.List;


public interface ModificateurService {

    List<Modificateur> getPersoModifById(String idPerso);

    boolean addModifInModificateur(String idPerso, Modificateur modif);

    boolean deleteModifFromModificateur(String idPerso, int modif);

}
