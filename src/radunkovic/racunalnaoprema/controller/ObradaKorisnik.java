/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editot.
 */
package radunkovic.racunalnaoprema.controller;

import java.util.List;
import org.hibernate.Query;
import radunkovic.racunalnaoprema.model.Korisnik;
import radunkovic.racunalnaoprema.pomocno.HibernateUtil;
import radunkovic.racunalnaoprema.pomocno.ObradaSucelje;
import radunkovic.racunalnaoprema.pomocno.RacunalnaOpremaException;

/**
 *
 * @author Ivan
 */
public class ObradaKorisnik extends Obrada<Korisnik> implements ObradaSucelje<Korisnik>{
    
    public ObradaKorisnik() {
        super();
    }

    @Override
    public List<Korisnik> getLista() {
        return HibernateUtil.getSession().createQuery("from Korisnik").list();
    }
    
    public List<Korisnik> getLista(String uvjet,boolean isSelected){
         
         Query query = HibernateUtil.getSession().createQuery("from Korisnik a "
                 + " where concat(a.ime,' ',a.prezime) like :uvjet")
                 .setString("uvjet", "%" + uvjet + "%");
         if(isSelected){
             query.setMaxResults(50);
         }
         
         return query.list();
     }

    @Override
    public Korisnik spremi(Korisnik t) throws RacunalnaOpremaException {
        
        kontrola(t);
        return dao.save(t);
    }

    @Override
    public void obrisi(Korisnik t) throws RacunalnaOpremaException {
        
        dao.delete(t);
    }
    
    @Override
    public void kontrola(Korisnik t) throws RacunalnaOpremaException {
        
        if (t.getIme() == null) {
            throw new RacunalnaOpremaException("Ime nije definirano");
        }
        if (t.getIme().trim().isEmpty()) {
            throw new RacunalnaOpremaException("Ime nije uneseno");
        }
        if (t.getPrezime() == null) {
            throw new RacunalnaOpremaException("Prezime nije definirano");
        }
        if (t.getPrezime().trim().isEmpty()) {
            throw new RacunalnaOpremaException("Prezime nije uneseno");
        }
        if (t.getUsername()== null) {
            throw new RacunalnaOpremaException("Username nije definiran");
        }
        if (t.getUsername().trim().isEmpty()) {
            throw new RacunalnaOpremaException("Username nije unesen");
        }
        if (t.getOdjel()== null) {
            throw new RacunalnaOpremaException("Odjel nije definiran");
        }
        
        
        
        
        
        
        
        
    }

    
    
}
