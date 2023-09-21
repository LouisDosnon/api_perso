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

    public void setTete_int(Equip tete_int) {
        this.tete_int = tete_int;
    }

    public void setTete_ext(Equip tete_ext) {
        this.tete_ext = tete_ext;
    }

    public void setTorse_int(Equip torse_int) {
        this.torse_int = torse_int;
    }

    public void setTorse_ext(Equip torse_ext) {
        this.torse_ext = torse_ext;
    }

    public void setJambe_int(Equip jambe_int) {
        this.jambe_int = jambe_int;
    }

    public void setJambe_ext(Equip jambe_ext) {
        this.jambe_ext = jambe_ext;
    }

    public void setPied_int(Equip pied_int) {
        this.pied_int = pied_int;
    }

    public void setPied_ext(Equip pied_ext) {
        this.pied_ext = pied_ext;
    }

    public void setArme(Equip arme) {
        this.arme = arme;
    }

    public void setAutre(List<Equip> autre) {
        this.autre = autre;
    }

    public List<Equip> getAutre() {
        return autre;
    }
}
