/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmagazzino;

import java.util.List;

/**
 *
 * @author alfieri.fabio
 */
public class Lotto implements NFCLeggibile {

    private String fornitore;
    private String prodotto;
    private double quantità;
    protected double metriQuadriUtilizzati;
    private Farina farina;
    private Orata orata;

    public Lotto(Farina farina, Orata orata) {
        this.farina = farina;
        this.orata = orata;
    }

    public String getFornitore() {
        return fornitore;
    }

    public String getProdotto() {
        return prodotto;
    }

    public double getQuantità() {
        return quantità;
    }

    public double getMetriQuadri() {
        
        
        return metriQuadriUtilizzati;
    }

    @Override
    public String getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPosizione() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String settoreInSpazio() {
        //Stocazzo//
    }
    public String settoreInTemperatura(){
        return;
    }

}
