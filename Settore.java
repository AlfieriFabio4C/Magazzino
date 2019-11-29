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
public class Settore extends Lotto{
    private String posizione;
    private int metriQuadrati;
    private int lotti;
    private int temperatura;
    private List settore;

    public Settore(Farina farina, Orata orata) {
        super(farina, orata);
    }


    public int getMetriQuadrati() {
        return metriQuadrati;
    }

    public int getLotti() {
        return lotti;
    }

    public int getTemperatura() {
        return temperatura;
    }
    public double getMetriQuadratiDisponibili(){
        
        double metriQuadratiDisponibili = 0;
        metriQuadratiDisponibili = metriQuadrati - metriQuadriUtilizzati;
        return (metriQuadratiDisponibili);
    }

}
