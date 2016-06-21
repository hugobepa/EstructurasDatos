/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.ListaCircularEnlazada;

/**
 *
 * @author hugo
 */
public class NodoLC 
{
    int dato;
    NodoLC siguiente;

    public NodoLC() {
    }

    public NodoLC(int dato) {
        this.dato = dato;
        siguiente=this;
    }

    public NodoLC(int dato, NodoLC siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    
    
    
    
}
