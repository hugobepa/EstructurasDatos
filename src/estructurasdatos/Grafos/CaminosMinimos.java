/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.Grafos;

/**
 * https://www.youtube.com/watch?v=xK0ShW9G-Ts&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9&index=49
 * min7:00
 *
 * @author hugo
 */
public class CaminosMinimos {

    public String algoritmoFloyd(long[][] mAdy) {
        int vertices = mAdy.length;
        long matrizAdyacencia[][] = mAdy;
        String caminos[][] = new String[vertices][vertices];
        String caminosAuxiliares[][] = new String[vertices][vertices];
        String caminoRecorrido = "", cadena = "", caminitos = "";
        int i, j, k;
        float temporal1, temporal2, temporal3, temporal4, minimo;
        //Inicializando matrices camninos Y caminosAuxiliares
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                caminos[i][j] = "";
                caminosAuxiliares[i][j] = "";
            }
        }

        for (k = 0; k < vertices; k++) {
            for (i = 0; i < vertices; i++) {
                for (j = 0; j < vertices; j++) {
                    temporal1 = matrizAdyacencia[i][j];
                    temporal2 = matrizAdyacencia[i][k];
                    temporal3 = matrizAdyacencia[k][j];
                    temporal4 = temporal2 + temporal3;
                    //encontrado al Minimo
                    minimo = Math.min(temporal1, temporal4);
                    if (temporal1 != temporal4) {
                        if (minimo == temporal4) {
                            caminoRecorrido = "";
                            caminosAuxiliares[i][j] = k + "";
                            caminos[i][j] = caminoR(i, k, caminosAuxiliares, caminoRecorrido) + (k + 1);
                        }
                    }

                    matrizAdyacencia[i][j] = (long) minimo;
                }
            }
        }
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                cadena = cadena + "[" + matrizAdyacencia[i][j] + "]";
            }
            cadena = cadena + "\n";
        }
        ///////////
        for (i = 0; i < vertices; j++) {
            for (j = 0; j < vertices; j++) {
                if (matrizAdyacencia[i][j] != 100000000) {
                    if (i != j) {
                        if (caminos[i][j].equals("")) {
                            caminitos += "de (" + (i + 1) + "--->" + (j + 1)
                                    + ") irse por...(" + (i + 1) + " ," + (j + 1) + ")\n";
                        } else {
                            caminitos += "de (" + (i + 1) + "--->" + (j + 1)
                                    + ") irse por...(" + (i + 1) + " ," + caminos[i][j] + ", " + (j + 1) + ")\n";
                        }
                    }
                }
            }
        }
        return "la matriz mas corta entre los diferentes vertices \n"+
                cadena+"\nLos diferentes caminos mas cortos entre  Vertices son \n"+
                caminitos;
    }  

    public String  caminoR(int i,int k,String[][] caminosAuxiliares,String caminoRecorrido)
    {
      if(caminosAuxiliares[i][k].equals(""))
      { 
          return "";
      }else{
          caminoRecorrido +=caminoR(i,Integer.parseInt(caminosAuxiliares[i][k].toString()),
                  caminosAuxiliares,caminoRecorrido)+(Integer.parseInt(caminosAuxiliares[i][k].toString())+1)+", ";
          return caminoRecorrido;
      }
   
         
    }

}
