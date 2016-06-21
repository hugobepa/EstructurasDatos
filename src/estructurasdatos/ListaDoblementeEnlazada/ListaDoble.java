/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.ListaDoblementeEnlazada;

import javax.swing.JOptionPane;

/**
 *https://www.youtube.com/watch?v=auxlBjH7XuQ&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9&index=22
 *4:30
 * @author hugo
 */
public class ListaDoble {
    
    private NodoDoble inicio,fin;

    public ListaDoble() {
        inicio=fin=null;
    }

    public ListaDoble(NodoDoble inicio, NodoDoble fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
 
    public boolean estVacia()
    {
       return inicio==null;
    }
  
    public void agregarFin(int el)
    {
        if(!estVacia())
        {
            fin=new NodoDoble(el,null,fin);
            fin.anterior.siguiente=fin;
        }else{inicio=fin=new NodoDoble(el);}
    }
    
    public void agregarInicio(int el)
    {
        if(!estVacia())
        {
            inicio=new NodoDoble(el,inicio,null);
            inicio.siguiente.anterior=inicio;
        }else{inicio=fin=new NodoDoble(el);}
    }
    // mostrar inicio-fin
    public  void  mostrarListaInicioFin()
    {
        if(!this.estVacia())
        {
            String  datos="<=>";
            NodoDoble auxiliar=inicio;
            while(auxiliar!=null)
            {
                datos = datos + "["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null,datos,"Mostrar Lista I a F",
                    JOptionPane.INFORMATION_MESSAGE);
            
        }
    }
    
    public  void  mostrarListaFinInicio()
    {
        if(!this.estVacia())
        {
            String  datos="<=>";
            NodoDoble auxiliar=fin;
            while(auxiliar!=null)
            {
                datos = datos + "["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null,datos,"Mostrar Lista I a F",
                    JOptionPane.INFORMATION_MESSAGE);
            
        }
    }
    
    public int eliminarInicio()
    {
        int e=inicio.dato;
        if(inicio==fin)
        {
            inicio=fin=null;
        }else{
            inicio=inicio.siguiente;
            inicio.anterior=null;
        }
        return e;
    }
    
    
    public int eliminarFin()
    {
        int e=fin.dato;
        if(inicio==fin)
        {
            inicio=fin=null;
        }else{
           fin=fin.anterior;
            fin.siguiente=null;
        }
        return e;
    }
}
