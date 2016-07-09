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
import estructurasdatos.Genericos.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ListaGenerica<T extends Generica> implements Iterable<T>
{
    private ArrayList<T> lista = new ArrayList<T>();
    private int tope=1;
    
    public ListaGenerica(int tope)
    {
        this.tope=tope;
    }

    public ListaGenerica() {
    }

   
    
    public void add(T objeto)
    {
        if(lista.size()<=tope)
        {
            lista.add(objeto);
            JOptionPane.showMessageDialog(null,"Objecte introduit\n","OBJECTE_INTRODUIT",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Esta ple, no introduit\n","LLISTA_PLENA",JOptionPane.INFORMATION_MESSAGE);
        }    
    }
    
    @Override
    public Iterator<T> iterator() 
    {
        return lista.iterator();
    }
    
    
    
}
