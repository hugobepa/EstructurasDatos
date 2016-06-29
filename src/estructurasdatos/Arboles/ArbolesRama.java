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
}
