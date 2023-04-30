package com.example.persoapi.dto;

import com.example.persoapi.entity.*;
import lombok.Data;

import java.util.List;

@Data
public class PersoDto {
    private String id;
    private String image;
    private String nom;
    private String race;
    private String classe;
    private long niveau;
    private long pv;
    private long pv_max;
    private long xp;
    private long xp_max;
    private Caracteristique caracteristique;
    private List<Competence> competences;
    private Equipement equipement;
    private List<ObjectInv> inventaire;
    private Monaie monaie;
    private List<CoupS> coup_speciaux;
    private List<Modificateur> modificateurs;
}
