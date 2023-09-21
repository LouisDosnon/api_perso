package com.example.persoapi.service;

import com.example.persoapi.entity.Modificateur;
import com.example.persoapi.entity.ObjectInv;

import java.util.List;


public interface InventaireService {

    List<ObjectInv> getPersoInvById(String idPerso);

    boolean addObjectInvInInv(String id, ObjectInv objectInv);

    boolean deleteObjectInvFromInv(String id, int objectInv);

}
