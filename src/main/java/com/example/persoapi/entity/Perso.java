package com.example.persoapi.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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
}
