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

    public long getOr() {
        return or;
    }

    public void setOr(long or) {
        this.or = or;
    }

    public long getArgent() {
        return argent;
    }

    public void setArgent(long argent) {
        this.argent = argent;
    }

    public long getBronze() {
        return bronze;
    }

    public void setBronze(long bronze) {
        this.bronze = bronze;
    }

    public Monaie() {
        this.or = 0;
        this.argent = 0;
        this.bronze = 0;
    }
}
