package com.example.persoapi.service.serviceImpl;

import com.example.persoapi.entity.ObjectInv;
import com.example.persoapi.entity.Perso;
import com.example.persoapi.repository.PersoRepository;
import com.example.persoapi.service.InventaireService;
import com.example.persoapi.service.PersoMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service("inventaire")
public class InventaireServiceImpl extends PersoMapper implements InventaireService {

    private PersoRepository persoRepository;

    public InventaireServiceImpl(PersoRepository persoRepository) {this.persoRepository = persoRepository;}

    @Override
    public List<ObjectInv> getPersoInvById(String idPerso) {
        Optional<Perso> perso = this.persoRepository.findById(idPerso);
        return Objects.requireNonNull(perso.map(this::persoEntityToDto).orElse(null)).getInventaire();
    }

    @Override
    public boolean addObjectInvInInv(String id, ObjectInv objectInv) {
        System.out.println(objectInv);
        Optional<Perso> persoOptional = this.persoRepository.findById(id);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            res = personnage.getInventaire().add(objectInv);
            this.persoRepository.save(personnage);
            System.out.println(personnage.getInventaire());
        }
        return res;
    }

    @Override
    public boolean deleteObjectInvFromInv(String id, int objectInv) {
        Optional<Perso> persoOptional = this.persoRepository.findById(id);
        Perso personnage;
        boolean res = false;
        if (persoOptional.isPresent()) {
            personnage = persoOptional.get();
            res = (personnage.getInventaire().remove(objectInv) != null);
            this.persoRepository.save(personnage);
        }
        return res;
    }
}
