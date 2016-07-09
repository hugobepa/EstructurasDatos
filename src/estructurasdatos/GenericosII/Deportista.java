/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.GenericosII;

import java.util.List;

/**
 *
 * @author hugo
 */
public class Deportista extends Persona {

 
private String deporte;

    public Deportista(String n,String d) {
        super(n);
        this.deporte=d;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Deportista{ nombre="+super.getNombre() + "deporte=" + deporte + '}';
    }
 
    
    
}
