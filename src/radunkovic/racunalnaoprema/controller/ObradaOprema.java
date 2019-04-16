/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radunkovic.racunalnaoprema.controller;

import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Query;
import radunkovic.racunalnaoprema.model.Oprema;
import radunkovic.racunalnaoprema.pomocno.HibernateUtil;
import radunkovic.racunalnaoprema.pomocno.ObradaSucelje;
import radunkovic.racunalnaoprema.pomocno.RacunalnaOpremaException;

/**
 *
 * @author Ivan
 */
public class ObradaOprema extends Obrada<Oprema> implements ObradaSucelje<Oprema>{

    public ObradaOprema(){
        super();
    }
    
    @Override
    public List<Oprema> getLista() {
        return HibernateUtil.getSession().createQuery("from Oprema").list();
    }
    
    public List<Oprema> getLista(String uvjet,boolean isSelected){
         
         Query query = HibernateUtil.getSession().createQuery("from Oprema a "
                 + " where concat(a.naziv) like :uvjet")
                 .setString("uvjet", "%" + uvjet + "%");
         if(isSelected){
             query.setMaxResults(50);
         }
         
         return query.list();
     }

    @Override
    public void kontrola(Oprema op) throws RacunalnaOpremaException {
        if (op.getNaziv()== null) {
            throw new RacunalnaOpremaException("Naziv nije definiran");
        }
        if (op.getNaziv().trim().isEmpty()) {
            throw new RacunalnaOpremaException("Naziv nije unesen");
        }
        if (op.getMacadresa()== null) {
            throw new RacunalnaOpremaException("Macadresa nije definirana");
        }
        if (op.getMacadresa().trim().isEmpty()) {
            throw new RacunalnaOpremaException("Macadresa nije unesena");
        }
        if (op.getGodinaKupnje()== null) {
            throw new RacunalnaOpremaException("Godina kupnje nije definirana");
        }
        if (op.getCijena().compareTo(BigDecimal.ZERO) <= 0) {
            throw new RacunalnaOpremaException("Cijena mora bit pozitivan broj");
        }
        
        
    }

    @Override
    public Oprema spremi(Oprema op) throws RacunalnaOpremaException {
        kontrola(op);
        return dao.save(op);
    }

    @Override
    public void obrisi(Oprema op) throws RacunalnaOpremaException {
        dao.delete(op);
    }
    
}
