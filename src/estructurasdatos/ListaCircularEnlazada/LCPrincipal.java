/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.ListaCircularEnlazada;

import estructurasdatos.ListaDoblementeEnlazada.ListaDoble;
import javax.swing.JOptionPane;

/**
 *https://www.youtube.com/watch?v=auxlBjH7XuQ&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9&index=22
 * @author hugo
 */
public class LCPrincipal {
    
    public static void main(String[] args) 
    {
        ListaLC llc=new ListaLC();
        int opcion=0,el;
        boolean kill= false;
        
        do{
            try{
                opcion= Integer.parseUnsignedInt(JOptionPane.showInputDialog(null,
                        "1.Agregar Nodo\n"+
                        "2.Eliminar Nodo\n"+
                        "3.Mostrar Inicio\n"+                   
                        "4.Fin\n"+"Que deseas hacer?",
                        "Menu Opciones",
                        JOptionPane.INFORMATION_MESSAGE
                        ));
                
            switch(opcion)
            {
                case 1:
                    el=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingresa el elemento del nodo",
                            "Agregando Inicio",JOptionPane.INFORMATION_MESSAGE));
                     llc.insertar(el);
                            
                    break;
                case 2:
                 el=Integer.parseInt(JOptionPane.showInputDialog(null,"Elemento eliminar:  ",
                         "Eliminado nodo",JOptionPane.INFORMATION_MESSAGE));
                 kill=llc.eliminar(el);
                 if(kill)   JOptionPane.showMessageDialog(null,"elemento eliminado: "+el,
                                "kill element",JOptionPane.INFORMATION_MESSAGE);
                 else   JOptionPane.showMessageDialog(null,"No existe elemento",
                                "elemento no eliminado",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    if(!llc.estaVacia())
                        llc.mostrarLista(); 
                    else{
                        JOptionPane.showMessageDialog(null,"No hay elementos",
                                "listaVacia",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"FIN","fin",JOptionPane.INFORMATION_MESSAGE);
                    break;
                
                    
                default:
                    JOptionPane.showMessageDialog(null,"Opcion equivocada");
            }
                
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"error: "+e.getMessage());
            }
        }while(opcion!=4);
    }
    
}
