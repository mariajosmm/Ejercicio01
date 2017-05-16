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
public class Jugador {
    private String Nombre;
    private String Contrato;
    private Ejugador ejugador1=new Ejugador();
    private Incidencias Incidencias1=new Incidencias();
    
    
    public void setIncidencias1(Incidencias Incidencias1P){
        this.Incidencias1=Incidencias1P;
    }
    public Incidencias getIncidencias1(){
        return Incidencias1;
    }
    
    public void setEjugador1(Ejugador Ejugador1P){
        this.ejugador1=Ejugador1P;
    }
    public Ejugador getEjugador1(){
        return ejugador1;
    }
    
   public void setNombre(String nombreP){
        this.Nombre=nombreP;
    }
    public String getNombre(){
        return Nombre;
    }
    
      
   public void setContrato(String contratoP){
        this.Contrato=contratoP;
    }
    public String getContrato(){
        return Contrato;
    }
}
