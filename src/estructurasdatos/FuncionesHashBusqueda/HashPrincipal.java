/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.FuncionesHashBusqueda;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *https://www.youtube.com/watch?v=yUKGvDxleKI&index=71&list=PLCLpAU8VN0j4RGemFfybZrWoSX57NbEq9
 * 
 * @author hugo
 */
public class HashPrincipal {
    String [] arreglo;
    int tamano,contador;
    
    public HashPrincipal(int t)
    {
        this.tamano=t;
        arreglo=new String[t];
        Arrays.fill(arreglo, "-1");
    }
    
    public void funcionHash(String[] cadenaArreglo,String[] arregStrings)
    {
        int i;
        for(i=0;i<cadenaArreglo.length;i++)
        {
            String elemento= cadenaArreglo[i];
            //%7 por tamaño
            int indiceArreglo=Integer.parseInt(elemento)%7;
            System.out.println("El indice es "+indiceArreglo+
                    "Para el elemento o Valor "+elemento);
            while(arreglo[indiceArreglo]!="-1")
            {
                indiceArreglo++;
                System.out.println("Eso es to… eso es to… eso es todo amigos!"+
                 (indiceArreglo-1)+ " Cambiar el indice "+       
                    indiceArreglo);
               
               indiceArreglo%=tamano;
            }
             
             arreglo[indiceArreglo]=elemento;
        }
    }
    
    
    public void mostrar()
    {
        int incremento=0,i,j;
        for(i=0;i<1;i++)
        {
            incremento +=8;
            for(j=0;j<71;j++)
            {
                System.out.println("-");
                
            }
            System.out.println();
            for(j=incremento-8;j <incremento;j++)
            {
                if(arreglo[j].equals("-1")) System.out.println("|      ");
                else System.out.println(String.format("| %3s "+" ",arreglo[j]));   
            }
      }
        System.out.println("|");
        for(j=0;j<71;j++) System.out.println("-");
        System.out.println();
    }
    
    //public String buscarClave
    public String buscarClave(String el)
    {
        int indiceArreglo=Integer.parseInt(el)%7;
        int contador=0;
        while(arreglo[indiceArreglo]!="-1")
        {
            if(arreglo[indiceArreglo]==el)
            {
                System.out.println("El elemento "+ el+
                        "Fue encontrado en el indice "+
                        indiceArreglo);
                return arreglo[indiceArreglo];
            }
            indiceArreglo++;
            indiceArreglo%=tamano;
            contador++;
            if(contador>7) break;
            
        }
        return null;
    }  
    
    public static void main(String[] args) 
    {
        HashPrincipal hash= new HashPrincipal(8);
        String[] el={"20","1","5","10","13","27","3","7"};
        hash.funcionHash(el, hash.arreglo);
        //hash.mostrar();
        String buscar=hash.buscarClave("14");
        if(buscar==null) System.out.println("Elemento  no encontrado");
    }
    
}
