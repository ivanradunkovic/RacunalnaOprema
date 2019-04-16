/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radunkovic.racunalnaoprema.controller;

import java.util.List;
import radunkovic.racunalnaoprema.model.Odjel;
import radunkovic.racunalnaoprema.pomocno.HibernateUtil;
import radunkovic.racunalnaoprema.pomocno.ObradaSucelje;
import radunkovic.racunalnaoprema.pomocno.RacunalnaOpremaException;

/**
 *
 * @author Ivan
 */
public class ObradaOdjel extends Obrada<Odjel> implements ObradaSucelje<Odjel>{

    public ObradaOdjel(){
        super();
    }
    
    @Override
    public List<Odjel> getLista() {
         return HibernateUtil.getSession().createQuery("from Odjel").list();
    }

    @Override
    public void kontrola(Odjel od) throws RacunalnaOpremaException {
        if (od.getNaziv()== null) {
            throw new RacunalnaOpremaException("Naziv nije definiran");
        }
        if (od.getNaziv().trim().isEmpty()) {
            throw new RacunalnaOpremaException("Naziv nije unesen");
        }
        if (od.getBrojzaposlenih()<= 0) {
            throw new RacunalnaOpremaException("Broj zaposlenih mora bit veći od 0");
        }
        

    }

    @Override
    public Odjel spremi(Odjel od) throws RacunalnaOpremaException {
       kontrola(od);
       return dao.save(od);
    }

    @Override
    public void obrisi(Odjel od) throws RacunalnaOpremaException {
        dao.delete(od);
    }
    
}
