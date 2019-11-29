/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmagazzino;

/**
 *
 * @author alfieri.fabio
 */
public class Farina implements Pesabile{
private double prezzoAlKg;
private double peso;

    @Override
    public void setPeso() {
        
    }
    public double getPrezzo(){
        return prezzoAlKg;
    }
    @Override
    public double getPeso() {
        return peso;
    }
    
}
