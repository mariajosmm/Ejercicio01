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
public class Incidencias {
    
    private  String Descripcion;
    private Sanciones sanciones1;
    
    
    public void setSanciones1(Sanciones sanciones1P){
        this.sanciones1=sanciones1P;
    }
    public Sanciones getSanciones1(){
        return sanciones1;   }
    
    
    public void setDescripcion(String DescripcionP){
        this.Descripcion=DescripcionP;
    }
    public String getDescripcion(){
        return Descripcion;
    }
}
