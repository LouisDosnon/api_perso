package com.example.persoapi.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Monaie {
    @JsonProperty("or")
    private long or;
    @JsonProperty("argent")
    private long argent;
    @JsonProperty("bronze")
    private long bronze;
}
