/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.ColasQueue;

/**
 * https://www.youtube.com/watch?v=uwrMPpDFZ3o&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9&index=31
 * @author hugo
 */
import java.util.LinkedList;
import java.util.Queue;
public class ColasQueuePrincipal
{
    
    public static void main(String[] args)
    {
        Queue <Integer> cl = new LinkedList<Integer>();
        
        cl.add(10);
        cl.add(20);
        cl.add(30);
        cl.add(40);
        cl.add(50);
        cl.add(60);
        
        System.out.println("Elemento inicio: "+cl.peek());
        System.out.println("Tamaño cola: "+cl.size());
        System.out.println("Cola vacia: "+cl.isEmpty());
        //while (!colita.isEmpty())
        System.out.println("Eliminar un elemento: "+cl.remove());
        System.out.println("Vaciar toda la lista: "); cl.clear();
        
    }
    
    
}
