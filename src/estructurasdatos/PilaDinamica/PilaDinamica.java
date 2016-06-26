/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.PilaDinamica;

/**
 *
 * @author hugo
 */
public class PilaDinamica {
    private NodoPila cima;
    int t;
    public PilaDinamica()
    {
        cima=null;
        t=0;
    }
    
    
    public boolean estVacia()
    {
        return cima==null;
    }
    
    public void empujar(int el)
    {
        NodoPila nuevo = new NodoPila(el);
        nuevo.siguiente=cima;
        cima=nuevo;
        t++;
    }
    
   public int sacar()
   {
       int aux=cima.dato;
       cima=cima.siguiente;
       t--;
       return aux;
       
   }
   
   public int cima()
   {
       return cima.dato;
   }
   
   public int tamaño()
   {
       return t;
   }        
    
   
   public void  limpiar()
   {
       while(!estVacia())
       {
           sacar();
       }
   }
   
}
