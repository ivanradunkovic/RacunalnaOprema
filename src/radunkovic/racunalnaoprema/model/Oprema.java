/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radunkovic.racunalnaoprema.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ivan
 */
@Entity
@Table
public class Oprema extends Entitet implements Serializable{
    
    private String naziv;
    private String macadresa;
    private BigDecimal cijena;
    
    @Temporal(TemporalType.DATE)
    private Date godinaKupnje;
    
    @OneToMany(mappedBy = "oprema")
    private List<Odjel> odjeli = new ArrayList<>();
    
    @OneToMany(mappedBy = "oprema")
    private List<Otpis> Otpisi = new ArrayList<>();

    public List<Otpis> getOtpisi() {
        return Otpisi;
    }

    public void setOtpisi(List<Otpis> Otpisi) {
        this.Otpisi = Otpisi;
    }

    
    
    public List<Odjel> getOdjeli() {
        return odjeli;
    }

    public void setOdjeli(List<Odjel> odjeli) {
        this.odjeli = odjeli;
    }

    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getMacadresa() {
        return macadresa;
    }

    public void setMacadresa(String macadresa) {
        this.macadresa = macadresa;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Date getGodinaKupnje() {
        return godinaKupnje;
    }

    public void setGodinaKupnje(Date godinaKupnje) {
        this.godinaKupnje = godinaKupnje;
    }

    @Override
    public String toString() {
        return "Naziv: " + naziv + ", Cijena: " + cijena + " kn"+", macAdresa: " + macadresa;
    }
    
    
    
}
