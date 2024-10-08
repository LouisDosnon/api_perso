package com.example.persoapi.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ObjectInv {
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("nom")
    private String nom;

    @Override
    public String toString() {
        return this.nom + " " + this.desc;
    }
}
