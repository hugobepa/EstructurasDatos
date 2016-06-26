/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.LELinkedList;

/**
 *https://www.youtube.com/watch?v=SjVJ6CyDJCM&index=29&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9
 * @author hugo
 * 
 */
import java.util.LinkedList;
public class ListaPrincipal {
    
    public static void main(String[] args)
    {
        LinkedList lt= new LinkedList();
        lt.add(10);
        lt.add(20);
        lt.add(30);
        lt.add(40);
        lt.add(50);
        lt.add(60);
        
        int t= lt.size(),i=0;
        
        while(i<t)
        {
            System.out.println("["+lt.get(i)+"]->");
            i++;
        }
        
        
        lt.remove(10);
        lt.add(3,60);
        
    }
    
}
