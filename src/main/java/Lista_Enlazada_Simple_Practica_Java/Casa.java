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
    private int año;
    private int ventanas;
    
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public Casa(int año, int ventanas) {
        this.año = año;
        this.ventanas = ventanas;
    }

    public Casa() {}
    
    @Override
    public String toString(){
        return "Persona{" + "anno="+año+", ventanas="+ventanas+'}';
    }
}
