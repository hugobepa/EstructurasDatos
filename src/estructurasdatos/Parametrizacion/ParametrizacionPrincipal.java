/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.Parametrizacion;

import estructurasdatos.GenericosII.Deportista;

/**
 *
 * @author hugo
 */
public class ParametrizacionPrincipal {
    
    public static void main(String[] args) 
    {
        Generica g1 = new Generica(new Persona("hugo",29));
        
        System.out.println(g1.toString());
        
        Lista lt= new Lista();
        ListaGenerica ltg = new ListaGenerica();
        lt.add(new Persona("sirgul",35));
        lt.add(new Persona("mario",3));
        
        ltg.add(new Generica(new Persona("XATO",35)));
        ltg.add(new Generica(new Persona("SILLON",70)));
        imprimir(lt);
        imprimirltg(ltg);
        
    }
    
    
    
    public static void imprimir(Lista<?> lista) {
 
for(Persona p:lista) {
 
System.out.println(p.toString());
}
 
}
    public static void imprimirltg(ListaGenerica<?> lista) {
 
for(Generica gn:lista) {
 
System.out.println(gn.toString());
}
 
}
    
}
