package com.example.persoapi.service.serviceImpl;

import com.example.persoapi.entity.Competence;
import com.example.persoapi.entity.ObjectInv;
import com.example.persoapi.entity.Perso;
import com.example.persoapi.repository.PersoRepository;
import com.example.persoapi.service.CompetencesService;
import com.example.persoapi.service.InventaireService;
import com.example.persoapi.service.PersoMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service("competences")
public class CompetencesServiceImpl extends PersoMapper implements CompetencesService {

    private PersoRepository persoRepository;

    public CompetencesServiceImpl(PersoRepository persoRepository) {this.persoRepository = persoRepository;}

    @Override
    public List<Competence> getPersoCompetencesById(String idPerso) {
        Optional<Perso> perso = this.persoRepository.findById(idPerso);
        return Objects.requireNonNull(perso.map(this::persoEntityToDto).orElse(null)).getCompetences();
    }

    @Override
    public boolean addCompetencesInCompetences(String id, Competence comp) {
        System.out.println(comp);
        Optional<Perso> persoOptional = this.persoRepository.findById(id);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            res = personnage.getCompetences().add(comp);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getInventaire());
        }
        return res;
    }

    @Override
    public boolean deleteCompetenceFromCompetences(String id, int compId) {
        Optional<Perso> persoOptional = this.persoRepository.findById(id);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            res = (personnage.getCompetences().remove(compId) != null);
            this.persoRepository.save(personnage);
        }
        return res;
    }
}
