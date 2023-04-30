package com.example.persoapi.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Modificateur {
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("attribut")
    private String attribut;
    @JsonProperty("difference")
    private long difference;
}
