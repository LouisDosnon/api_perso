package com.example.persoapi.service;

import com.example.persoapi.entity.Equip;
import com.example.persoapi.entity.Equipement;


public interface EquipementService {

    Equipement getPersoEquipementById(String idPerso);

    void setPersoTeteExtById(String idPerso, Equip equip);

    void setPersoTeteIntById(String idPerso, Equip equip);

    void setPersoTorseExtById(String idPerso, Equip equip);

    void setPersoTorseIntById(String idPerso, Equip equip);

    void setPersoJambeExtById(String idPerso, Equip equip);

    void setPersoJambeIntById(String idPerso, Equip equip);

    void setPersoPiedExtById(String idPerso, Equip equip);

    void setPersoPiedIntById(String idPerso, Equip equip);

    void setPersoArmeById(String idPerso, Equip equip);

    boolean addEquipInAutre(String id, Equip equip);

    boolean deleteEquipFromAutre(String id, int equipId);

}
