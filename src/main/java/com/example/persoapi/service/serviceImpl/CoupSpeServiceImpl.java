package com.example.persoapi.service.serviceImpl;

import com.example.persoapi.entity.Competence;
import com.example.persoapi.entity.CoupS;
import com.example.persoapi.entity.Perso;
import com.example.persoapi.repository.PersoRepository;
import com.example.persoapi.service.CompetencesService;
import com.example.persoapi.service.CoupSpeService;
import com.example.persoapi.service.PersoMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service("coup speciaux")
public class CoupSpeServiceImpl extends PersoMapper implements CoupSpeService {

    private PersoRepository persoRepository;

    public CoupSpeServiceImpl(PersoRepository persoRepository) {this.persoRepository = persoRepository;}

    @Override
    public List<CoupS> getPersoCoupSpeById(String idPerso) {
        Optional<Perso> perso = this.persoRepository.findById(idPerso);
        return Objects.requireNonNull(perso.map(this::persoEntityToDto).orElse(null)).getCoup_speciaux();
    }

    @Override
    public boolean addCoupSpeInCoupSpeList(String id, CoupS coupSpe) {
        System.out.println(coupSpe);
        Optional<Perso> persoOptional = this.persoRepository.findById(id);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            res = personnage.getCoup_speciaux().add(coupSpe);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getInventaire());
        }
        return res;
    }

    @Override
    public boolean deleteCoupSpeFromCoupSpeList(String id, int coupSpeId) {
        Optional<Perso> persoOptional = this.persoRepository.findById(id);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            res = (personnage.getCoup_speciaux().remove(coupSpeId) != null);
            this.persoRepository.save(personnage);
        }
        return res;
    }
}
