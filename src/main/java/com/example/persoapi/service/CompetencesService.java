package com.example.persoapi.service;

import com.example.persoapi.entity.Competence;

import java.util.List;


public interface CompetencesService {

    List<Competence> getPersoCompetencesById(String idPerso);

    boolean addCompetencesInCompetences(String id, Competence comp);

    boolean deleteCompetenceFromCompetences(String id, int compId);

}
