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

        int menu = 0;

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Desea agregar más casas a la lista?" +
                    "\n\t1.Sí\n\t2.No\n\t0.Salir\nSeleccione lo que desea hacer (0-2): "));

            switch (menu){
                case 0:
                    break;

                case 1:
                    lista.inserta(new Casa(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fundación " +
                            "de la casa: ")),Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de " +
                            "ventanas que tiene la casa: "))));
                    JOptionPane.showMessageDialog(null,"La lista actual es: " +
                            "\n" + lista + "\n");
                    System.out.println(lista);
                    break;

                case 2:
                    int menu2 = 0;
                    do {
                        menu2 = Integer.parseInt(JOptionPane.showInputDialog("Desea reemplazar una casa?\n\t1.Sí" +
                                "\n\t2.No\nSeleccione que quiere hacer (1-2): "));
                        switch (menu2){
                            case 1:
                                lista.modifica(new Casa(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año " +
                                        "de fundación de la casa: ")),Integer.parseInt(JOptionPane.showInputDialog("Ingr" +
                                        "ese la cantidad de ventanas que tiene la casa: "))));
                                JOptionPane.showMessageDialog(null, "La lista modificada es:" +
                                        " \n" + lista + "\n");
                                System.out.println(lista);
                                break;

                            case 2:
                                menu2 = 2;
                                break;

                        }
                    }while (menu2 != 2);

                default:
                    JOptionPane.showMessageDialog(null,"La opción indicada" +
                            " no existe, intente de nuevo...");
            }
        }while (menu != 0);
    }
}
