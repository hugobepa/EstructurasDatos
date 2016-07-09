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

public class Persona 
{
    private String nombre;
    private List<Viaje> lista=new ArrayList<Viaje>();
    
    public Persona(String n)
    {
        super();
        this.nombre=n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Viaje> getLista()
    {
        return lista;
    }
    
    public void addViaje(Viaje v)
    {
        lista.add(v);
    }
    
}
