/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.PilasEstaticas;

import javax.swing.JOptionPane;

/**
 *https://www.youtube.com/watch?v=GHtrC4BPo_Y&index=26&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9
 *18;00
 * @author hugo
 */
public class PilasEstaticasPrincipal {
    
    
    public static void main(String[] args)
    {
        int opcion=0, el,t;
        
        try {
            t=Integer.parseInt(
            JOptionPane.showInputDialog(null,"¿tamaño pila? ",
                    "el tamaño pila",JOptionPane.INFORMATION_MESSAGE)
            );
            Pila pl=new Pila(t);
            do{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                
                    "1.Entrar Elemento Pila\n"+
                    "2.Sacar Elemento Pila\n"+        
                    "3.PilaVacia\n"+
                    "4.PilaLlena\n"+
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
                        if(!pl.estLlena())
                        {
                            pl.empujar(el);
                        }else{
                            JOptionPane.showMessageDialog(null,
                                "Pila Llena",
                                "NO INTRODUCIR ELEMENTO",
                                JOptionPane.INFORMATION_MESSAGE);
                        }
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
                        if(pl.estLlena())
                        {
                             JOptionPane.showMessageDialog(null,
                                "Pila LLena",
                                "no cabe nada",
                                JOptionPane.INFORMATION_MESSAGE);
                        }else{
                             JOptionPane.showMessageDialog(null,
                                "Pila  no llena",
                                "cabe algo",
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                         if(!pl.estVacia())
                        {
                            JOptionPane.showMessageDialog(null,
                                "El elemento cima es  "+pl.cimaPila(),
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
                                "El elemento cima es  "+pl.tamañoPila(),
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
                
                
            }while(opcion!=7);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"error: "+e.getMessage());
        }
    }
}
