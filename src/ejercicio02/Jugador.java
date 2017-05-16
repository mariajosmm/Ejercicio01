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
    private String DNI;
    private String Nombre;
    private String Contrato;
    private Ejugador ejugador1;
    private Incidencias incidencias1;
    
    
    public void setDNI(String DNIP){
        this.DNI=DNIP;
    }
    public String getDNI(){
        return DNI;
    }
    
    
    public void setIncidencias1(Incidencias incidencias1P){
        this.incidencias1=incidencias1P;
    }
    public Incidencias getIncidencias1(){
        return incidencias1;
    }
    
    public void setEjugador1(Ejugador ejugador1P){
        this.ejugador1=ejugador1P;
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
