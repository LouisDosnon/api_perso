package com.example.persoapi.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Equipement {
    @JsonProperty("tete_int")
    private Equip tete_int;
    @JsonProperty("tete_ext")
    private Equip tete_ext;
    @JsonProperty("torse_int")
    private Equip torse_int;
    @JsonProperty("torse_ext")
    private Equip torse_ext;
    @JsonProperty("jambe_int")
    private Equip jambe_int;
    @JsonProperty("jambe_ext")
    private Equip jambe_ext;
    @JsonProperty("pied_int")
    private Equip pied_int;
    @JsonProperty("pied_ext")
    private Equip pied_ext;
    @JsonProperty("arme")
    private Equip arme;
    @JsonProperty("autre")
    private List<Equip> autre;
}
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
class Equip {
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("nom")
    private String nom;
}
