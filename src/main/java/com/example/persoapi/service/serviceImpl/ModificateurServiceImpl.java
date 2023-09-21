package com.example.persoapi.service.serviceImpl;

import com.example.persoapi.entity.Modificateur;
import com.example.persoapi.entity.Perso;
import com.example.persoapi.repository.PersoRepository;
import com.example.persoapi.service.ModificateurService;
import com.example.persoapi.service.PersoMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service("modificateur")
public class ModificateurServiceImpl extends PersoMapper implements ModificateurService {

    private PersoRepository persoRepository;

    public ModificateurServiceImpl(PersoRepository persoRepository) {this.persoRepository = persoRepository;}

    @Override
    public List<Modificateur> getPersoModifById(String idPerso) {
        Optional<Perso> perso = this.persoRepository.findById(idPerso);
        return Objects.requireNonNull(perso.map(this::persoEntityToDto).orElse(null)).getModificateurs();
    }

    @Override
    public boolean addModifInModificateur(String id, Modificateur modif) {
        System.out.println(modif);
        Optional<Perso> persoOptional = this.persoRepository.findById(id);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            res = personnage.getModificateurs().add(modif);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getInventaire());
        }
        return res;
    }

    @Override
    public boolean deleteModifFromModificateur(String id, int idModif) {
        Optional<Perso> persoOptional = this.persoRepository.findById(id);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            res = (personnage.getModificateurs().remove(idModif) != null);
            this.persoRepository.save(personnage);
        }
        return res;
    }
}
