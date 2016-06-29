/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.Arboles;

/**
 *  https://www.youtube.com/watch?v=ZKnwBJ8q2TE&index=34&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9
 * @author hugo
 */
public class ArbolesNodo {
    int dato;
    String nombre;
    ArbolesNodo hijoIzq;
    ArbolesNodo hijoDer;
    
    public ArbolesNodo(int d,String n)
    {
        this.dato=d;
        this.nombre=n;
        hijoIzq=hijoDer=null;
    }
    
    public String toString(){
        return nombre+" Su dato es "+dato;
    }
}
