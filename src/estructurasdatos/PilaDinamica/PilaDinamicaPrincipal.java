/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.PilaDinamica;

import javax.swing.JOptionPane;

/**
 *https://www.youtube.com/watch?v=-biLUN_CS6M&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9&index=27
 * @author hugo
 */
public class PilaDinamicaPrincipal {
    
    public static void main(String[] args) 
    {
        int  opcion=0, el=0;
        PilaDinamica pl= new  PilaDinamica();
        do{
            try {
                
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                
                    "1.Entrar Elemento Pila\n"+
                    "2.Sacar Elemento Pila\n"+        
                    "3.PilaVacia\n"+
                    "4.vaciarPila\n"+
                    "5.ElementoCima\n"+
                    "6.TamañoPila\n"+
                    "7.Salir\n"+
                    "Que deseas hacer?\n"
                ,"MenuOpcion",JOptionPane.INFORMATION_MESSAGE));
                
                
                switch(opcion){
                    case 1:
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,
                           "elemento a Introducir",
                           "Aplicando datos",
                           JOptionPane.INFORMATION_MESSAGE
                        ));
                       
                            pl.empujar(el);
                       
                        break;
                    case 2:
                        
                        if(!pl.estVacia())
                        {
                            JOptionPane.showMessageDialog(null,
                                "El elemento obtenido es  "+pl.sacar(),
                                "Elemento sacado",
                                JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,
                                "Pila vacia",
                                "no sacar datos",
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(pl.estVacia())
                        {
                             JOptionPane.showMessageDialog(null,
                                "Pila vacia",
                                "no hay elementos",
                                JOptionPane.INFORMATION_MESSAGE);
                        }else{
                             JOptionPane.showMessageDialog(null,
                                "Pila  no vacia",
                                "hay elementos",
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!pl.estVacia())
                        {
                            pl.limpiar();
                             JOptionPane.showMessageDialog(null,
                                "Pila se ha vaciado",
                                "pilaVaciandose",
                                JOptionPane.INFORMATION_MESSAGE);
                             
                        }else{
                             JOptionPane.showMessageDialog(null,
                                "Pila vacia",
                                "ya esta vacia",
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                         if(!pl.estVacia())
                        {
                            JOptionPane.showMessageDialog(null,
                                "El elemento cima es  "+pl.cima(),
                                "ElementoCima encontrado",
                                JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,
                                "Pila vacia",
                                "no sacar datos",
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null,
                                "El elemento cima es  "+pl.tamaño(),
                                "TamañoFila",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,
                                "Aplicacion finalizada",
                                "FIN",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                         JOptionPane.showMessageDialog(null,
                                "opcion erronea",
                                "Error",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                
                
            
            } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null,"error: "+e.getMessage());
            }
            
        }while(opcion!=7);
    }
    
}
