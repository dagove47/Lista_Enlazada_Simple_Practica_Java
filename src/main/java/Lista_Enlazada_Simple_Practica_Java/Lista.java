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
    
    public void inserta(Casa p){
        if(cabeza==null){
            cabeza = new Nodo(p);
        }else if(p.getId()<cabeza.getDato().getAño()){
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza=aux;
        }else if(cabeza.getNext()==null){
            cabeza.setNext(new Nodo(p));
        }else{
           Nodo aux = cabeza;
           while (aux.getNext() != null &&
                   aux.getNext().getDato().getAño()
                   <p.getAño()){
               aux=aux.getNext();
           }
           Nodo temp = new Nodo(p);
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
            while (aux != null && aux.getDato().getAño() < V.getAño()) {
                aux = aux. getNext(); //avanzo en la lista
            }
            // Si lo encuentra hago el cambio
            if (aux != null && aux.getDato().getAño() == V.getAño()){
                //Solo básta cambiar nombre
                aux.getDato().setAño(V.getAño());
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
