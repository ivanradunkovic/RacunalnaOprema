/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radunkovic.racunalnaoprema.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Ivan
 */
@Entity
@Table
public class Skladiste extends Entitet implements Serializable{
    
    private String naziv;
    private boolean dostupnost;
    private int kolicina;
    
    @ManyToOne
    private Otpis otpis;
    
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public boolean isDostupnost() {
        return dostupnost;
    }

    public void setDostupnost(boolean dostupnost) {
        this.dostupnost = dostupnost;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    

    public Otpis getOtpis() {
        return otpis;
    }

    public void setOtpis(Otpis otpis) {
        this.otpis = otpis;
    }

    @Override
    public String toString() {
        return "Naziv: " + naziv + "  dostupnost " + dostupnost + "  količina: " + kolicina;
    }


    

    
    
    
    
}
