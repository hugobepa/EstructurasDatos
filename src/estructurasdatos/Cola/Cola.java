/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.Cola;

/**
 *
 * @author hugo
 */
public class Cola {
    NodoCola inicio,fin;
    int t;
    
    public Cola()
    {
        inicio=fin=null;
        t=0;
    } 
    
    public boolean estVacia()
    {
        return inicio==null;
    }
    
    public void insertar( int el)
    {
        NodoCola nuevo= new NodoCola(el);
        if(estVacia()){
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo;    
        }
        fin=nuevo;
        t++;
    }
    
    
  public int quitar(){
      int aux=inicio.dato;
      inicio=inicio.siguiente;
      t--;
      return aux;
  }
  
  
  public int inicioCola(){
      return inicio.dato;
  }
  
  public  int tamañoCola(){
      return t;
  }
  
  
}
