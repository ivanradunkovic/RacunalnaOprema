/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radunkovic.racunalnaoprema.pomocno;

import java.util.List;

/**
 *
 * @author Ivan
 */
public interface ObradaSucelje<T> {
    
    public List<T> getLista();
    public void kontrola(T t) throws RacunalnaOpremaException;
    public T spremi(T t)  throws RacunalnaOpremaException;
    public void obrisi(T t) throws RacunalnaOpremaException;
    
}
