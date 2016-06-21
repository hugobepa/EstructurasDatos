/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.ListaDoblementeEnlazada;

/**
 *
 * @author hugo
 */
public class NodoDoble {
    
    public int dato;
    NodoDoble siguiente,anterior;

    public NodoDoble() {
    }

    public NodoDoble(int dato) {
        this(dato,null,null);
    }

    
    
    public NodoDoble(int dato, NodoDoble siguiente, NodoDoble anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    
    
}
