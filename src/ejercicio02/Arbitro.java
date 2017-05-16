/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author sena
 */
public class Arbitro {
    private String Nombre;
    private String Colegio;
    private Partido Partido1=new Partido();
    
    
    public void setPartido1(Partido Partido1P){
        this.Partido1=Partido1P;
    }
    public Partido getPartido1(){
        return Partido1;
    }
    
    
     public void setNombre(String nombreP){
        this.Nombre=nombreP;
    }
    public String getNombre(){
        return Nombre;
    }
   public void setColegio(String colegioP){
        this.Colegio=colegioP;
    }
    public String getColegio(){
        return Colegio;
    }
       
}
