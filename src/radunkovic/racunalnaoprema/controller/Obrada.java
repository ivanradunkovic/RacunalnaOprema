/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radunkovic.racunalnaoprema.controller;

/**
 *
 * @author Ivan
 * 
 */
public abstract class Obrada<T> {
    
    protected DAO<T> dao;
    
    public Obrada(){
        dao = new DAO<>();
    }
    
}
