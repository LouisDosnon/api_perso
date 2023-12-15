package com.example.persoapi.entity;

public class Caracteristique {
    public long charisme;
    public long courage;
    public long adresse;
    public long intelligence;
    public long force;
    public long attaque;
    public long parade;
    public long destin;
    public long energie_astrale;
    public long energie_astrale_max;

    public void setCharisme(long charisme) {
        this.charisme = charisme;
    }

    public void setCourage(long courage) {
        this.courage = courage;
    }

    public void setAdresse(long adresse) {
        this.adresse = adresse;
    }

    public void setIntelligence(long intelligence) {
        this.intelligence = intelligence;
    }

    public void setForce(long force) {
        this.force = force;
    }

    public void setAttaque(long attaque) {
        this.attaque = attaque;
    }

    public void setParade(long parade) {
        this.parade = parade;
    }

    public void setDestin(long destin) {
        this.destin = destin;
    }

    public void setEnergie_astrale(long energie_astrale) {
        this.energie_astrale = energie_astrale;
    }

    public void setEnergie_astrale_max(long energie_astrale_max) {
        this.energie_astrale_max = energie_astrale_max;
    }

    public Caracteristique() {
        this.charisme = 0;
        this.courage = 0;
        this.adresse = 0;
        this.intelligence = 0;
        this.force = 0;
        this.attaque = 0;
        this.parade = 0;
        this.destin = 0;
        this.energie_astrale = 0;
        this.energie_astrale_max = 0;
    }
}
