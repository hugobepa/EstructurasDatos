/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.SimplementeListasEnlazadas;

import javax.swing.JOptionPane;

/**
 *https://www.youtube.com/watch?v=dpj88NGRhck&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9&index=15
 * https://www.youtube.com/watch?v=KjKvbcvtZc8&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9&index=20
 * @author hugo
 */
public class Lista {
    protected Nodo inicio,fin;//punteros saber Inicio , Final

    public Lista() 
    {
        inicio= null;
        fin=null;
    }

    public Lista(Nodo inicio, Nodo fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    
    public  void agregarInicio(int e)
    {
        //crear nodo
        inicio=new Nodo(e, inicio);
        if(fin==null)
        {
            fin=inicio;
        }
        
    }
    
    public void mostrarLista()
    {
        Nodo recorrer=inicio;
        System.out.println("");
        while(recorrer!=null)
        {
            System.out.print("["+recorrer.dato+"]--->");
            recorrer=recorrer.siguiente;
        }
         System.out.println("");
    }
    
    
    //listaVacia o no Boolean
    public boolean estaVacia()
    {
        if(inicio==null)
        {
            return true;
        }else{
            return false;
        }
    }
    
    public void agregarFinal(int e)
    {
        if(!estaVacia())
        {
            fin.siguiente= new  Nodo(e);
            fin=fin.siguiente;
        }else{
            inicio=fin=new Nodo(e);
        }
    }
    
    public int eliminarInicio()
    {
        int e=inicio.dato;
        if(inicio==fin)  inicio=fin=null;
        else inicio=inicio.siguiente;
        
        return e;
    }
    
    public int eliminarFinal()
    {
        int e=fin.dato;
        if(inicio==fin) inicio=fin=null;
        else{
            Nodo temporal=inicio;
            while(temporal.siguiente!=fin)
            {
               temporal=temporal.siguiente;
              
            }
             fin=temporal;
               fin.siguiente= null;  
            
        }      
        return e;
    }
    
    public void eliminarNodo(int el)
    {
        if(!estaVacia())
        {
            if(inicio==fin && el==inicio.dato)
            {
                inicio=fin=null;
            }else if(el==inicio.dato)
            {
                inicio=inicio.siguiente;
            }else{
                Nodo anterior,temporal;
                anterior=inicio;
                temporal=inicio.siguiente;
                while(temporal!=null && temporal.dato!=el)
                {
                    anterior=anterior.siguiente;
                    temporal=temporal.siguiente;
                }    
                if(temporal!=null)
                {
                    anterior.siguiente=temporal.siguiente;
                    if(temporal==fin)
                    {
                        fin=anterior;
                    }
                }
            }
        }else{
             JOptionPane.showMessageDialog(null,"Lista vacia");
        }
    }
    
    public boolean buscarNodo(int el){
        Nodo temporal=inicio;
        while(temporal!=null && temporal.dato!=el)
        {   
            temporal=temporal.siguiente;
        }
        return   temporal!=null;
    }
}
