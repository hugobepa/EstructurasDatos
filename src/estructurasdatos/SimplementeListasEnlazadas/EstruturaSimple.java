/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.SimplementeListasEnlazadas;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author hugo
 */
public class EstruturaSimple 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner (System.in);
        Lista lt = new Lista();
        Nodo  nd = new Nodo();
        int opcion=0,el;
        do{
            try{
                
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar Elemento Inicio\n"
                      + "2.Agregar final\n "
                      + "3.EliminarInicio\n"
                      + "4.EliminarFinal\n"
                       +"5.Mostra Lista\n"+
                       "6.EliminarNodo\n"+
                        "7.BuscarNodo\n"+                            
                        "8.Salir",
                        "Menu Opciones",3));
                
                
                
                switch(opcion)
                {
                    case 1:
                    try{
                            el=Integer.parseInt(
                            JOptionPane.showInputDialog(null,"Ingresa el elemento:",
                                    "inicio",3));
                            lt.agregarInicio(el);
                        }catch(NumberFormatException n){    
                            JOptionPane.showMessageDialog(null,"Error: "+n.getMessage()); 
                            System.out.println("Error: "+n.getMessage());
                        }    
                        break;
                        
                    case 2:
                           try{
                            el=Integer.parseInt(
                            JOptionPane.showInputDialog(null,"Ingresa el elemento:",
                                    "final",3));
                            lt.agregarFinal(el);
                        }catch(NumberFormatException n){    
                            JOptionPane.showMessageDialog(null,"Error: "+n.getMessage()); 
                            System.out.println("Error: "+n.getMessage());
                        }    
                        break;
                      
                    case 3:
                        el=lt.eliminarInicio();
                        JOptionPane.showMessageDialog(null,"elemento eliminado:"
                              +el,"eliminar inicio" ,JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                    case 4:    
                         el=lt.eliminarFinal();
                        JOptionPane.showMessageDialog(null,"elemento eliminado:"
                              +el,"eliminar final" ,JOptionPane.INFORMATION_MESSAGE);
                        
                    case 5:
                            lt.mostrarLista();
                            break;    
                        
                    case 6:
                            el=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Elementoa buscar: ",
                            "Eliminando Nodos Especificos",
                            JOptionPane.INFORMATION_MESSAGE));
                             if(lt.buscarNodo(el)==true)
                       {
                             lt.eliminarNodo(el);
                            JOptionPane.showMessageDialog(null,"elemento eliminado:"
                              +el,"eliminar nodo" ,JOptionPane.INFORMATION_MESSAGE);
                       }else{
                            JOptionPane.showMessageDialog(null,"El elemento "+ el+
                                  "NO encontrado" ,"",JOptionPane.INFORMATION_MESSAGE);
                       }
                            
                            
                            
                            
                            
                            break;
                    case 7:
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Elemento buscar: ",
                            "Nodos encontrado Especificos",
                            JOptionPane.INFORMATION_MESSAGE));
                       if(lt.buscarNodo(el)==true)
                       {
                           JOptionPane.showMessageDialog(null,"El elemento "+ el+
                                  " encontrado","",JOptionPane.INFORMATION_MESSAGE );
                       }else{
                            JOptionPane.showMessageDialog(null,"El elemento "+ el+
                                  "NO encontrado" ,"",JOptionPane.INFORMATION_MESSAGE);
                       }
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null,"final"); 
                            System.out.println("final");
                        break;
                        
                    default:
                         JOptionPane.showMessageDialog(null,"Opcion Incorrecta"); 
                            System.out.println("Opcion Incorrecta");
                        break;
                    
                }
                
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Error: "+e.getMessage()); 
                            System.out.println("Error: "+e.getMessage());
            }
            
        }while(opcion!=8);
    }
}
