package com.example.persoapi.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CoupS {
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("nom")
    private String nom;
}
