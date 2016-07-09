/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.GenericosII;

/**
 *
 * @author hugo
 */
import estructurasdatos.GenericosII.*;
import java.util.ArrayList;
import java.util.List;
import estructurasdatos.Genericos.*;

public class GenericosIIPrincipal {
    public static void main(String[] args)
    {
        Lista<Deportista> ld=new Lista<Deportista>(5);
  
        Deportista d1= new Deportista("messi","futbol");
        ld.add(d1);
        ld.add(new Deportista("rayu","poker"));
        
        imprimir(ld);
    }
    
   
   



public static void imprimir(Lista<Deportista> lista) {
 
for(Deportista p:lista) {
 
System.out.println(p.getNombre());
}
 
}

public static void imprimirGeneral(Lista<?> lista) {
 
for(Object p:lista) {
 
System.out.println(p.toString());
}
 
}

public static void imprimirComunidad(List<? extends Deportista> lista) {
 
 for(Persona p:lista) {
 
 System.out.println(p.getNombre());
 }
 
 }
}
