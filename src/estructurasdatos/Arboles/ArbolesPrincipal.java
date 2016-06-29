/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.Arboles;

import java.awt.image.ImageObserver;
import javax.swing.JOptionPane;

/**
 *
 * @author hugo
 */
public class ArbolesPrincipal {
    
    public static void main(String[] args) 
    {
        int opcio=0,el;
        String n;
        ArbolesRama rm=new ArbolesRama();
        do {            
            try {
                opcio=Integer.parseInt(JOptionPane.showInputDialog(null,
                   "1.AgregarNodo\n"+
                   "2.RecorrerInOrder\n"+
                   "3.Salir\n"       
                   +"Elige Una Opcion...","MENU_ARBOLES",
                   JOptionPane.QUESTION_MESSAGE
                ));
                        
                 switch(opcio){
                     case 1:
                           el=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero nodo...","Agregar Nodo",
                                   JOptionPane.QUESTION_MESSAGE));
                           n=JOptionPane.showInputDialog(null, "Ingresa el nombre nodo...","Agregar nombre",
                                   JOptionPane.QUESTION_MESSAGE);
                           rm.agregarNodo(el,n);
                         break;
                         
                     case 2:  
                         
                         if(!rm.estVacio())
                         {
                             rm.inOrden(rm.raiz);
                         }else{
                             JOptionPane.showMessageDialog(null,"Estavacio",
                                 "Vaciooor",JOptionPane.ERROR_MESSAGE);
                         }
                         
                          
                         break;
                         
                     case 3:  
                          JOptionPane.showMessageDialog(null,"Finalizacio",
                                 "It's the End",JOptionPane.ERROR_MESSAGE);
                         break;
                     default:
                         JOptionPane.showMessageDialog(null,"Opcio Incorrecta",
                                 "OPCIOINCORRECTA",JOptionPane.ERROR_MESSAGE);
                     
                 }       
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"El error: "+e,"ERROR"
                        ,JOptionPane.ERROR_MESSAGE);
                System.out.println("El error: "+e);
            }
        } while (opcio!=3);
    }
            
    
}
