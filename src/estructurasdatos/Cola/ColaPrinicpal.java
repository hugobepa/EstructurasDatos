/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.Cola;

import javax.swing.JOptionPane;

/**
 *
 * @author hugo
 */
public class ColaPrinicpal {
    
    public static void main(String[] args) 
    {
        int el=0, opcio=0;
        Cola pl = new Cola();
        
        do{
            try {
                opcio=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Insertar en Cola\n"+
                        "2.Sacar en Cola\n"+
                        "3.ColaVacia?\n"+ 
                        "4.Inicio?\n"+
                        "5.Tamaño?\n"+
                        "6.Salir\n","MenuOpcionesCola",
                        JOptionPane.QUESTION_MESSAGE
                        ));
                switch(opcio)
                {
                    case 1:
                        el=Integer.parseInt(
                        JOptionPane.showInputDialog(null,"Insertar elemento"
                        ,"Insertando Cola",JOptionPane.QUESTION_MESSAGE
                        ));
                        pl.insertar(el);
                        break;
                    case 2:
                        if(!pl.estVacia()){
                            JOptionPane.showMessageDialog(null, 
                                    "elemento atendido es "+pl.quitar(),
                                    "Elemento Eliominado",JOptionPane.INFORMATION_MESSAGE
                            );
                        }else{
                            JOptionPane.showMessageDialog(null, "ColaVacia",
                           "Vacia",JOptionPane.INFORMATION_MESSAGE
                            );
                        }
                        break;
                    case 3:
                         if(!pl.estVacia()){
                           JOptionPane.showMessageDialog(null, "ColaNOVacia",
                           "NOVacia",JOptionPane.INFORMATION_MESSAGE
                            );
                        }else{
                            JOptionPane.showMessageDialog(null, "ColaVacia",
                           "Vacia",JOptionPane.INFORMATION_MESSAGE
                            );
                        }
                        break;
                    case 4:
                       
                        
                        if(!pl.estVacia()){
                          JOptionPane.showMessageDialog(null, "ElementoInicio: "+pl.inicioCola(),
                           "InicioCola",JOptionPane.INFORMATION_MESSAGE
                            );
                        }else{
                            JOptionPane.showMessageDialog(null, "ColaVacia",
                           "Vacia",JOptionPane.INFORMATION_MESSAGE
                            );
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Tamaño: "+pl.tamañoCola()
                        ,"TAMAÑOCOLA",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "FIN"
                        ,"final",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                          JOptionPane.showMessageDialog(null, "Opcion Equivocada"
                        ,"EQUIVOCADA",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    
                }
                
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"mensaje: "+e);
            }
            
        }while(opcio!=6);
        
        
        
    }
    
    
    
}
