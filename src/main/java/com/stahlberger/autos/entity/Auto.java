package com.stahlberger.autos.entity;




import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String marke;
    @NotNull
    private String modell;
    @NotNull
    private Calendar baujahr;

    public Auto(String marke, String modell, Calendar baujahr) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public Auto() {

    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public Calendar getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(Calendar baujahr) {
        this.baujahr = baujahr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
