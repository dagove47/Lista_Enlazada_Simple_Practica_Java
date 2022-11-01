/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Lista_Enlazada_Simple_Practica_Java;

import javax.swing.JOptionPane;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Lista_Enlazada_Simple_Practica_Java {

    public static void main(String[] args) {
        Lista lista = new Lista();
        
        int loop = 0;
        while(loop == 0) {
            int addCasa = JOptionPane.showConfirmDialog(null,
                    lista + "\n" +
                            "Desea agregar mas casas a la fila?",
                    "Question",JOptionPane.YES_NO_OPTION);
            switch(addCasa) {
                case 0:
                    int creado = Integer.parseInt(JOptionPane.showInputDialog("Digite la el año que se construyo la casa:"));
                    int ventanas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de ventanas que tiene la casa:"));
                    lista.reemplazar(new Casa(creado, ventanas));
                    break;
                default:
                    loop = 1;
                    break;
            }
        }
        System.exit(0);
    }
}
