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
    
    public void inserta(Casa V){
        if(cabeza==null){
            cabeza = new Nodo(V);
        }else if(V.getFundado()<cabeza.getDato().getFundado()){
            Nodo aux = new Nodo(V);
            aux.setNext(cabeza);
            cabeza=aux;
        }else if(cabeza.getNext()==null){
            cabeza.setNext(new Nodo(V));
        }else{
           Nodo aux = cabeza;
           while (aux.getNext() != null &&
                   aux.getNext().getDato().getFundado()
                   <V.getFundado()){
               aux=aux.getNext();
           }
           Nodo temp = new Nodo(V);
           temp.setNext(aux.getNext());
           aux.setNext(temp);
        } 
    }
    
    public void modifica (Casa V) {
    //busca a si existe alguien con el id, y le actualiza el nombre
        if (cabeza != null) {
            //Si hay algo en la lista buscaré
            Nodo aux = cabeza; //utilizo aux como indice
            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && aux.getDato().getFundado() < V.getFundado()) {
                aux = aux. getNext(); //avanzo en la lista
            }
            // Si lo encuentra hago el cambio
            if (aux != null && aux.getDato().getFundado() == V.getFundado()){
                //Solo básta cambiar nombre
                aux.getDato().setFundado(V.getFundado());
            }
        }
    }
    
    @Override
    public String toString(){
        Nodo aux = cabeza;
        String s="Lista: ";
        while(aux!=null){
            s+=aux+", ";
            aux=aux.getNext();
        }
        return s;

    }
    
}
