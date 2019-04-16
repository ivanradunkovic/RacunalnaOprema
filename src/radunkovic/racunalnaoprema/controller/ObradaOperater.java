/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radunkovic.racunalnaoprema.controller;

import radunkovic.racunalnaoprema.model.Operater;
import radunkovic.racunalnaoprema.pomocno.BCrypt;
import radunkovic.racunalnaoprema.pomocno.RacunalnaOpremaException;
import radunkovic.racunalnaoprema.pomocno.HibernateUtil;
import radunkovic.racunalnaoprema.pomocno.ObradaSucelje;
import java.util.List;

/**
 *
 * @author Profesor
 */
public class ObradaOperater extends Obrada<Operater> implements ObradaSucelje<Operater>{

    
    /**
     * 
     * 
     * Ako treba gledati vrijednosti parametara koji idu u bazu tada u my.ini (C:\xampp\mysql\bin)
     * u dijelu [mysqld] dodati (ili osloboditi - maknuti #)
     * #general_log_file = f:\mysqllog.log
     * #general_log      = 1
     * f:\mysqllog.log je datoteka gdje želite da piše - pripaziti ima li mysql ovlasti nad tom datotekom
     */
    
    
    public Operater autoriziraj(String email, String lozinka){
        Operater o = (Operater) HibernateUtil.getSession().createQuery(" from Operater a "
                + " where a.email=:email ")
                .setString("email", email)
                .uniqueResult();
        if(o==null){
            return null;
        }
        
        if(BCrypt.checkpw(lozinka, o.getLozinka())){
            //o.setLozinka(null); - riješiti
            return o;
        }
        
        return null;
    }
    
    @Override
    public List<Operater> getLista() {
        return HibernateUtil.getSession().createQuery("from Operater").list();
    }

    @Override
    public void kontrola(Operater t) throws RacunalnaOpremaException {
        
    }

    @Override
    public Operater spremi(Operater t) throws RacunalnaOpremaException {
        return dao.save(t);
    }

    @Override
    public void obrisi(Operater t) throws RacunalnaOpremaException {
        
    }
    
}
