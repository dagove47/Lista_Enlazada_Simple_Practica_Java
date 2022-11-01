/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Enlazada_Simple_Practica_Java;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Casa {
    private int fundado;
    private int ventanas;

    public Casa(int fundado, int ventanas) {
        this.fundado = fundado;
        this.ventanas = ventanas;
    }

    public int getFundado() {
        return fundado;
    }

    public void setFundado(int fundado) {
        this.fundado = fundado;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public Casa() {}
    
    @Override
    public String toString(){
        return "Casa{" + "año="+fundado+", ventanas="+ventanas+'}';
    }
}
