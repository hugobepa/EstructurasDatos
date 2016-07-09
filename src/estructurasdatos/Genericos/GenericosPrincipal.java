/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.Genericos;

/**
 *
 * @author hugo
 */
import estructurasdatos.Genericos.*;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class GenericosPrincipal {
    
    public static void main(String[] args) 
    {
        Lista<Persona>lista= new Lista<Persona>(5);
        Persona p1= new Persona("hugo");
        Persona p2= new Persona("mario");
        Persona p3= new Persona("John nieve");
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        Iterator<Persona> it = lista.iterator();
 
while (it.hasNext()) {
 
System.out.println(it.next().getNombre());
 
}
        
        
    }
    
}
