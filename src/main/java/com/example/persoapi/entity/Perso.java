package com.example.persoapi.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Data
@Document("personnages")
public class Perso {
    @Id
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
    @Field("competence.listObj")
    private List<Competence> competences;
    private Equipement equipement;
    @Field("inventaire.listObj")
    private List<ObjectInv> inventaire;
    private Monaie monaie;
    @Field("coupSpeciaux.listCoup")
    private List<CoupS> coup_speciaux;
    @Field("modificateurs.listModif")
    private List<Modificateur> modificateurs;

    public Perso(String id) {
        this.id = id;
        this.image = "";
        this.nom = "nom";
        this.race = "race";
        this.classe = "classe";
        this.niveau = 1;
        this.pv = 0;
        this.pv_max = 0;
        this.xp = 0;
        this.xp_max = 100;
        this.caracteristique = new Caracteristique();
        this.competences = new ArrayList<>();
        this.equipement = new Equipement();
        this.inventaire = new ArrayList<>();
        this.monaie = new Monaie();
        this.coup_speciaux = new ArrayList<>();
        this.modificateurs = new ArrayList<>();
    }
}
