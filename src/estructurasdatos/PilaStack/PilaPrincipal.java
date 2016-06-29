/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.PilaStack;

/**
 *https://www.youtube.com/watch?v=BjVoxJXFYhM&index=30&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9
 * @author hugo
 */

import java.util. Stack;
public class PilaPrincipal {
    
    
    public static void main(String[] args) 
    {
        Stack pl = new Stack();
        
        pl.add(10);
        pl.add(20);
        pl.add(30);
        pl.add(40);
        pl.add(50);
        pl.add(60);
        
        System.out.println("La cima es "+pl.peek());
        System.out.println("Extreaer elemento "+pl.pop());
        System.out.println("Tamaño Pila "+pl.size());
        System.out.println("Introducir elemento "+pl.push(100));
        System.out.println("Buscar elemento: "+pl.search(40));
        System.out.println("Esta buit? "+pl.isEmpty());
        
    }
    
}
