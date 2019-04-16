/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radunkovic.racunalnaoprema.controller;

import java.util.List;
import radunkovic.racunalnaoprema.model.Skladiste;
import radunkovic.racunalnaoprema.pomocno.HibernateUtil;
import radunkovic.racunalnaoprema.pomocno.ObradaSucelje;
import radunkovic.racunalnaoprema.pomocno.RacunalnaOpremaException;

/**
 *
 * @author Ivan
 */
public class ObradaSkladiste extends Obrada<Skladiste> implements ObradaSucelje<Skladiste>{

    public ObradaSkladiste(){
        super();
    }
    
    @Override
    public List<Skladiste> getLista() {
        return HibernateUtil.getSession().createQuery("from Skladiste").list();
    }

    @Override
    public void kontrola(Skladiste s) throws RacunalnaOpremaException {
        if (s.getNaziv()== null) {
            throw new RacunalnaOpremaException("Naziv nije definiran");
        }
        if (s.getNaziv().trim().isEmpty()) {
            throw new RacunalnaOpremaException("Naziv nije unesen");
        }
        if(s.getKolicina()<0){
            throw new RacunalnaOpremaException("Kolicina ne može biti manja od 0");
        }
        
    }

    @Override
    public Skladiste spremi(Skladiste s) throws RacunalnaOpremaException {
        kontrola(s);
        return dao.save(s);
    }

    @Override
    public void obrisi(Skladiste s) throws RacunalnaOpremaException {
       dao.delete(s);
    }
    
}
