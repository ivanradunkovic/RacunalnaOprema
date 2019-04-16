/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radunkovic.racunalnaoprema.controller;

import java.math.BigDecimal;
import java.util.List;
import radunkovic.racunalnaoprema.model.Otpis;
import radunkovic.racunalnaoprema.pomocno.HibernateUtil;
import radunkovic.racunalnaoprema.pomocno.ObradaSucelje;
import radunkovic.racunalnaoprema.pomocno.RacunalnaOpremaException;

/**
 *
 * @author Ivan
 */
public class ObradaOtpis extends Obrada<Otpis> implements ObradaSucelje<Otpis>{
    
    public ObradaOtpis(){
        super();
    }

    @Override
    public List<Otpis> getLista() {
        return HibernateUtil.getSession().createQuery("from Otpis").list();
    }

    @Override
    public void kontrola(Otpis ot) throws RacunalnaOpremaException {
        
        if(ot.getVrijednost().compareTo(BigDecimal.ZERO)<0){
            throw  new RacunalnaOpremaException("Vrijednost mora biti pozitivan broj");
        }
        
    }

    @Override
    public Otpis spremi(Otpis ot) throws RacunalnaOpremaException {
        kontrola(ot);
        return dao.save(ot);
    }

    @Override
    public void obrisi(Otpis ot) throws RacunalnaOpremaException {
       dao.delete(ot);
    }
    
}
