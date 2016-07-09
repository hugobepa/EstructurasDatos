/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.Arboles;

import javax.swing.JOptionPane;

/**
 *
 * @author hugo
 */
public class ArbolesRama 
{
    ArbolesNodo raiz;
    
    public ArbolesRama()
    {
        raiz= null;
    }
    
    public  void agregarNodo(int d,String n)
    {
      ArbolesNodo nv= new  ArbolesNodo(d,n);
      if(raiz==null)
      {
          raiz=nv;
      }else{
          ArbolesNodo aux=raiz;
          ArbolesNodo padre;
          while(true)
          {
              padre=aux;
              if(d<aux.dato)
              {
                  aux=aux.hijoIzq;
                  if(aux==null)
                  {
                     padre.hijoIzq=nv; 
                     return;
                  }
              }else{
                  aux=aux.hijoDer;
                  if(aux==null)
                  {
                       padre.hijoDer=nv; 
                     return;
                  }
              }
          }
          
      }
    }
    
    
    public boolean estVacio()
    {
        return raiz==null;
    }
    
    public void inOrden(ArbolesNodo r)
    {
        if(r!=null)
        {
            inOrden(r.hijoIzq);
            System.out.println(r.dato);
            inOrden(r.hijoDer);
        }
    }
    
   //https://www.youtube.com/watch?v=Nz-9ZQrhgO0&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9&index=36
    
    public void preOrden(ArbolesNodo r)
    {
        if(r!=null)
        {
           System.out.println(r.dato);
           preOrden(r.hijoIzq); 
            preOrden(r.hijoDer);
        }
    }
    
    public void postOrden(ArbolesNodo r)
    {
        if(r!=null)
        {
           postOrden(r.hijoIzq); 
            postOrden(r.hijoDer);
           System.out.println(r.dato);
        }
    }
    
    
    public ArbolesNodo buscarNodo(int d)
    {
        ArbolesNodo r=raiz;
        while(r.dato!=d)
        {
            if(d<r.dato)
            {
                r=r.hijoIzq;
            }else{
                r=r.hijoDer;
            }
            
            if(r==null) return null;
        }
        
        return r;
    }
    
    //https://www.youtube.com/watch?v=Av1IWdWMDlY&index=40&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9
    public boolean eliminarNodo(int d)
    {
        ArbolesNodo r=raiz;
        ArbolesNodo padre=raiz;
        boolean esHijoIzq=true;
        while(r.dato!=d)
        {
            padre=r;
            if(d<r.dato)
            {
                esHijoIzq=true;
                r=r.hijoIzq;
            }else{
                esHijoIzq=false;
                r=r.hijoDer;
            }
            if(r==null) return false;
        }
        
        if(r.hijoIzq==null && r.hijoDer==null) 
        {
            if(r==raiz) raiz=null;
            else if(esHijoIzq) padre.hijoIzq=null;
            else padre.hijoDer=null;
        }else if(r.hijoDer==null){
             if(r==raiz) raiz=r.hijoIzq;
            else if(esHijoIzq) padre.hijoIzq=r.hijoIzq;
            else padre.hijoDer=r.hijoIzq;
        }else if(r.hijoIzq==null){
            if(r==raiz) raiz=r.hijoDer;
            else if(esHijoIzq) padre.hijoIzq=r.hijoDer;
            else padre.hijoDer=r.hijoIzq;
        }else{
            ArbolesNodo reemplazo=obtenerNodoReemplazo(r);
            if(r==raiz)
            {
                raiz=reemplazo;
            }else if(esHijoIzq){
                padre.hijoIzq=reemplazo;
            }else{
                padre.hijoDer=reemplazo;
            }
              
            reemplazo.hijoIzq=r.hijoIzq;
        }
     return true;
    }
    
    public ArbolesNodo obtenerNodoReemplazo(ArbolesNodo r)
    {
       ArbolesNodo reemplazarPadre=r;
       ArbolesNodo reemplazo=r;
       ArbolesNodo aux=r.hijoDer;
       
       while(aux!=null)
       {
           reemplazarPadre=reemplazo;
           reemplazo=aux;
           aux=aux.hijoIzq;
       }
       if(reemplazo!=r.hijoDer){ 
           reemplazarPadre=reemplazo.hijoDer;
           reemplazo.hijoDer=r.hijoDer;
       }
        System.out.println("El modo reemplazo es "+reemplazo);
       return reemplazo;
    }
}
