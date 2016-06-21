/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.ListaDoblementeEnlazada;

import javax.swing.JOptionPane;

/**
 *https://www.youtube.com/watch?v=KjKvbcvtZc8&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9&index=20
 * 
 * https://www.youtube.com/watch?v=auxlBjH7XuQ&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9&index=22
 * @author hugo
 */
public class ListaDE {
    
    public static void main(String[] args) 
    {
        ListaDoble ltd=new ListaDoble();
        int opcion=0,el;
        
        do{
            try{
                opcion= Integer.parseUnsignedInt(JOptionPane.showInputDialog(null,
                        "1.Agregar NodoInicio\n"+
                        "2.Agregar NodoFinal\n"+
                        "3.Mostrar Inicio\n"+
                        "4.Mostrar Final\n"+
                        "5.Eliminar Inicio\n"+
                        "6.Eliminar Final\n"+
                        "7.Fin\n"+"Que deseas hacer?",
                        "Menu Opciones",
                        JOptionPane.INFORMATION_MESSAGE
                        ));
                
            switch(opcion)
            {
                case 1:
                    el=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingresa el elemento del nodo",
                            "Agregando Inicio",JOptionPane.INFORMATION_MESSAGE));
                     ltd.agregarInicio(el);
                            
                    break;
                case 2:
                    el=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingresa el elemento del nodo",
                            "Agregando Final",JOptionPane.INFORMATION_MESSAGE));
                     ltd.agregarFin(el);
                    break;
                case 3:
                    if(!ltd.estVacia())
                        ltd.mostrarListaInicioFin();
                    else{
                        JOptionPane.showMessageDialog(null,"No hay elementos",
                                "listaVacia",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 4:
                    if(!ltd.estVacia())
                        ltd.mostrarListaFinInicio();
                    else{
                        JOptionPane.showMessageDialog(null,"No hay elementos",
                                "listaVacia",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 5:
                    if(!ltd.estVacia())
                    {
                        el=ltd.eliminarInicio();
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es " +
                                el,"Elemento eliminado Inicio",JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(null,"No hay elementos",
                                "listaVacia",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    break;
                
                case 6:
                       if(!ltd.estVacia())
                    {
                        el=ltd.eliminarFin();
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es " +
                                el,"Elemento eliminado Fin",JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(null,"No hay elementos",
                                "listaVacia",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    break;  
                    
                    
                case 7:
                     JOptionPane.showMessageDialog(null,"FIN","fin",JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null,"Opcion equivocada");
            }
                
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"error: "+e.getMessage());
            }
        }while(opcion!=7);
    }
    
}
