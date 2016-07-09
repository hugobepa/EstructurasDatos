/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.Parametrizacion;

/**
 *
 * @author hugo
 */
public class Generica <T extends Persona>{
    
    private T p;

    public Generica() {
    }

    public Generica(T p) {
        this.p = p;
    }

    public T getP() {
        return p;
    }

    public void setP(T p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Generica{" + "p=" + p + '}';
    }
    
    
    
    
    
    
}
