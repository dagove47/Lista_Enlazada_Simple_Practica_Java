/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_Enlazada_Simple_Practica_Java;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Lista {
    private Nodo cabeza;
    
    public void reemplazar(Casa casa) {

        if(cabeza==null){ 
            // La fila esta vacia
            cabeza = new Nodo(casa);
        }else if(casa.getCreado() < cabeza.getDato().getCreado()) { 
            // si la casa es mas vieja, reemplaza primera
            Nodo aux = new Nodo(casa);
            aux.setNext(cabeza.getNext());
            cabeza=aux;
        }else if(cabeza.getNext()==null){ 
            // El next de la cabeza esta vacia
            cabeza.setNext(new Nodo(casa));
        }else{ 
            // Si no cumple lo anterior se envia a la ultima posicion
            Nodo aux = cabeza;
            while (aux.getNext() != null) {
                aux=aux.getNext();
            }
            aux.setNext(new Nodo(casa));
        } 
    }
    
    @Override
    public String toString(){
        Nodo aux = cabeza;
        int num = 1;
        String s="Lista de casas (vieja a nueva): \n\n";
        while(aux!=null){
            s+= num + " - " + aux+", \n";
            num++;
            aux=aux.getNext();
        }
        return s;

    }
    
}
