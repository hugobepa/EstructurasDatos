/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.Grafos;

/**
 * https://www.youtube.com/watch?v=xK0ShW9G-Ts&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9&index=49
 * min7:00
 * @author hugo
 */
public class CaminosMinimos {
    public String algoritmoFloyd(long [][]mAdy)
    {
       int vertices=mAdy.length;
       long matrizAdyancencia[][]=mAdy;
       String caminos[][]=new String [vertices][vertices];
       String caminosAuxiliares[][]= new String [vertices][vertices];
       String caminoRecorrido="",cadena="",caminitos="";
       int i,j,k;
       float temporal1,temporal2,temporal3,temporal4,minimo;
       //Inicializando matrices camninos Y caminosAuxiliares
       for(i=0;i<vertices;i++)
       {
           for(j=0;j<vertices;j++)
           {
               caminos[i][j]="";
               caminosAuxiliares[i][j]="";
           }
       }
       
       
    return null;
    
}
}