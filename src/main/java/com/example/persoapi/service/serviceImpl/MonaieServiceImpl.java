package com.example.persoapi.service.serviceImpl;

import com.example.persoapi.entity.Monaie;
import com.example.persoapi.entity.Perso;
import com.example.persoapi.repository.PersoRepository;
import com.example.persoapi.service.MonaieService;
import com.example.persoapi.service.PersoMapper;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service("monaie")
public class MonaieServiceImpl extends PersoMapper implements MonaieService {

    private PersoRepository persoRepository;

    public MonaieServiceImpl(PersoRepository persoRepository) {this.persoRepository = persoRepository;}

    @Override
    public Monaie getPersoMonaieById(String idPerso) {
        Optional<Perso> perso = this.persoRepository.findById(idPerso);
        return Objects.requireNonNull(perso.map(this::persoEntityToDto).orElse(null)).getMonaie();
    }

    @Override
    public void setPersoOrById(String idPerso, int or) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getMonaie().setOr(or);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getInventaire());
        }
    }

    @Override
    public void setPersoArgentById(String idPerso, int argent) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getMonaie().setArgent(argent);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getInventaire());
        }
    }

    @Override
    public void setPersoBronzeById(String idPerso, int bronze) {
        Optional<Perso> persoOptional = this.persoRepository.findById(idPerso);
        Perso personnage;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            personnage.getMonaie().setBronze(bronze);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getInventaire());
        }
    }
}
