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
                   "3.RecorrerPreOrder\n"+
                   "4.RecorrerPostOrder\n"+
                   "5.BuscarNodo\n"+
                   "6.EliminarNodo\n"+
                   "7.Salir\n"       
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
                         
                         if(!rm.estVacio())
                         {
                             rm.preOrden(rm.raiz);
                         }else{
                             JOptionPane.showMessageDialog(null,"Estavacio",
                                 "Vaciooor",JOptionPane.ERROR_MESSAGE);
                         }
                    
                    case 4:  
                         
                         if(!rm.estVacio())
                         {
                             rm.postOrden(rm.raiz);
                         }else{
                             JOptionPane.showMessageDialog(null,"Estavacio",
                                 "Vaciooor",JOptionPane.ERROR_MESSAGE);
                         }     
                          
                         break;     
                    
                    case 5:  
                         
                         if(!rm.estVacio())
                         {
                             el=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero nodo...","Buscar Nodo",
                                   JOptionPane.QUESTION_MESSAGE));
                          
                         
                           if(rm.buscarNodo(el)==null)
                           {
                                JOptionPane.showMessageDialog(null,"No hay Nodo",
                                 "Existe no Nodooor",JOptionPane.ERROR_MESSAGE);
                           }else{
                                JOptionPane.showMessageDialog(null,"El nodo existe "+el,
                                 "NodoExiste",JOptionPane.INFORMATION_MESSAGE);
                                System.out.println("Nodo Encontrado "+rm.buscarNodo(el));
                           }
                         }else{
                             JOptionPane.showMessageDialog(null,"Estavacio",
                                 "Vaciooor",JOptionPane.ERROR_MESSAGE);
                         }     
                          
                         break;        
                        
                    
                     case 6:  
                         
                         if(!rm.estVacio())
                         {
                             el=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero nodo...","EliminarNodo",
                                   JOptionPane.QUESTION_MESSAGE));
                          
                         
                           if(rm.eliminarNodo(el)==false)
                           {
                                JOptionPane.showMessageDialog(null,"No hay Nodo",
                                 "Existe no Nodooor",JOptionPane.ERROR_MESSAGE);
                           }else{
                                JOptionPane.showMessageDialog(null,"El nodo eliminado "+el,
                                 "NodoEliminado",JOptionPane.INFORMATION_MESSAGE);
                                System.out.println("Nodo Eliminado "+rm.eliminarNodo(el));
                           }
                         }else{
                             JOptionPane.showMessageDialog(null,"Estavacio",
                                 "Vaciooor",JOptionPane.ERROR_MESSAGE);
                         }     
                          
                         break;            
                        
                        
                        
                     case 7:  
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
        } while (opcio!=7);
    }
            
    
}
