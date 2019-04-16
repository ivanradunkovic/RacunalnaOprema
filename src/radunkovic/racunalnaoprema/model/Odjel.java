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
public class Odjel extends Entitet implements Serializable{
    
    @ManyToOne
    private Oprema oprema;
    
    private String naziv;
    private int brojzaposlenih;

    public Oprema getOprema() {
        return oprema;
    }

    public void setOprema(Oprema oprema) {
        this.oprema = oprema;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojzaposlenih() {
        return brojzaposlenih;
    }

    public void setBrojzaposlenih(int brojzaposlenih) {
        this.brojzaposlenih = brojzaposlenih;
    }

    @Override
    public String toString() {
        return  "Odjel:  " + getNaziv() + "  " + "Broj zaposlenih: "+getBrojzaposlenih();
    }
    
    
    
    
}
