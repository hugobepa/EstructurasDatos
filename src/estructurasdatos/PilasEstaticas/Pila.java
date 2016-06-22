/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.PilasEstaticas;

/**
 *https://www.youtube.com/watch?v=GHtrC4BPo_Y&index=26&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9
 * @author hugo
 */
public class Pila {
    int vectorPila[];
    int cima;
    
    public Pila(int  t)
    {
        this.vectorPila=new int[t];
        cima=-1;
    }
    
    public void empujar(int d)
    {
        cima++;
        this.vectorPila[cima]=d;
    }
    
    public int  sacar()
    {
        int f;
        f=this.vectorPila[cima];
        cima--;
        return f;
    }
    
    public boolean estVacia(){
        return this.cima==-1;
    }
    
    public boolean estLlena()
    {
       return this.vectorPila.length-1==cima;
    }
    
    public int  cimaPila()
    {
        return this.vectorPila[cima];
    }
    
    public int tamañoPila()
    {
        return this.vectorPila.length;
    }
}
