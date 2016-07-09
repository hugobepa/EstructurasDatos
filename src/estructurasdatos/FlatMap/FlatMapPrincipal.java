/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.FlatMap;

/**
 *
 * @author hugo
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class FlatMapPrincipal {
    
    public static void main(String[] args) 
    {
        Persona p=new Persona("pedro");
        Viaje v= new Viaje("Francia");
        Viaje v2= new Viaje("Inglaterra");
        p.addViaje(v);
        p.addViaje(v2);
        
         Persona p1=new Persona("luis");
        Viaje v3= new Viaje("Italia");
        Viaje v4= new Viaje("Belgica");
        p1.addViaje(v3);
        p1.addViaje(v4);
       
        List<Persona> lista= new ArrayList<Persona>();
        lista.add(p);
        lista.add(p1);
        for(Persona persona:lista){
             for(Viaje viaje: persona.getLista()){
                 System.out.println(viaje.getPais());
             }
        
    }
        
        lista.stream().map(persona->persona.getNombre()).forEach(new Consumer<String>() {
 
@Override
public void accept(String s) {
System.out.println(s);
 
}
 
});
        
        lista.stream().map(persona -> persona.getLista())
 .flatMap(viajes -> viajes.stream())
 .map(viaje->viaje.getPais()).forEach(System.out::println);
    } 
}
