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
    private int creado;
    private int ventanas;

    public Casa(int creado, int ventanas) {
        this.creado = creado;
        this.ventanas = ventanas;
    }
    
    public Casa() {}

    public int getCreado() {
        return creado;
    }

    public void setCreado(int creado) {
        this.creado = creado;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    @Override
    public String toString(){
        return "Casa {" + "año="+creado+", ventanas="+ventanas+'}';
    }
}
