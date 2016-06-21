/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos.SimplementeListasEnlazadas;



/**
 *
 * @author hugo
 */
public class Persona implements Comparable<Persona>{
    
    private String nom;
    private int edad;
    
   public Persona(){}
   
   public Persona(String n,int e) 
   {
       this.nom=n;
       this.edad=e;
   }
    public Persona(String n) 
   {
       this.nom=n;
      
   }
   
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   //metodo ordenar solo

    

    @Override
    public int compareTo(Persona o) {
         int e1=this.edad;
        int e2=this.getEdad();
        
        if(e1==e2) return 0;
        if(e1>e2)  return 1; else return -1;
    }
   
}
