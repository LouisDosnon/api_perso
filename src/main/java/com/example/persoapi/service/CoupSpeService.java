package com.example.persoapi.service;

import com.example.persoapi.entity.Competence;
import com.example.persoapi.entity.CoupS;

import java.util.List;


public interface CoupSpeService {

    List<CoupS> getPersoCoupSpeById(String idPerso);

    boolean addCoupSpeInCoupSpeList(String id, CoupS coupSpe);

    boolean deleteCoupSpeFromCoupSpeList(String id, int coupSpeId);

}
