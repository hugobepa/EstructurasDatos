/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.ListaCircularEnlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author hugo
 */
public class ListaLC
{
    NodoLC ultimo;

    public ListaLC() {
        ultimo=null;
    }

    public ListaLC(NodoLC ultimo) {
        this.ultimo = ultimo;
    }
    
    public boolean estaVacia()
    {
        return ultimo==null;
    }
    
    public ListaLC insertar(int el)
    {
        NodoLC nuevo = new  NodoLC(el);
        if(ultimo!=null)
        {
            nuevo.siguiente=ultimo.siguiente;
            ultimo.siguiente=nuevo;
        }
        ultimo=nuevo;
        return this;
    }
    
    public void mostrarLista()
    {
        NodoLC aux=ultimo.siguiente;
        String cadena="";
        do{
            cadena=cadena+"["+aux.dato+"]->";
        }while(aux!=ultimo.siguiente);
        JOptionPane.showMessageDialog(null,cadena, "Mostrando Lista Circular",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean eliminar(int el)
    {
        NodoLC actual;
        boolean encontrado=false;
        actual=ultimo;
        while(actual.siguiente!=ultimo && !encontrado){
            encontrado=(actual.siguiente.dato==el);
            if(!encontrado)
            {
                actual=actual.siguiente;
            }
        }
        encontrado=(actual.siguiente.dato==el);
        if(encontrado)
        {
            NodoLC aux=actual.siguiente;
            if(ultimo==ultimo.siguiente)
            {
                ultimo=null;
            }else{
                if(aux==ultimo)
                {
                    ultimo=actual;
                }
                actual.siguiente=aux.siguiente;
            }
            aux=null;
        }
        return encontrado==true;
    }
}
