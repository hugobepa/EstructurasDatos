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
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Lista<T> implements Iterable<T>
{
    private ArrayList<T> lista = new ArrayList<T>();
    private int tope=1;
    
    public Lista(int tope)
    {
        this.tope=tope;
    }

    public Lista() {
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
