/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.SimplementeListasEnlazadas;

/**
 *
 * @author hugo
 */
public class Nodo {
    
    public int dato;
    public Nodo siguiente;//puntero enlace

    public Nodo() {
    }

    
    
    public Nodo(int dato) {
        this.dato = dato;
        siguiente=null;
    }

    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    
    
}
