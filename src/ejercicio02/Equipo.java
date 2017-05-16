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
public class Equipo {
    private String nombre;
    private String ciudad;
    private Incidencias incidencias1;
    private Pabellon pabellon1;
    private Jugador jugador1=new Jugador();
    
    
    public void setJugador1(Jugador jugador1P){
        this.jugador1=jugador1P;
    }
    public Jugador getJugador1(){
        return jugador1;
    }
    
    
    public void setNombre(String nombreP){
        this.nombre=nombreP;
    }
    public String getNombre(){
        return nombre;
    }
    
    
    
    public void setCiudad(String ciudadP){
        this.ciudad=ciudadP;
    }
    public String getCiudad(){
        return ciudad;
    }
    
    
    
    public void setIncidencias1(Incidencias incidencias1P){
        this.incidencias1=incidencias1P;
    }
    public Incidencias getIncidencias1(){
        return incidencias1;
    }
    
    
    public void setPabellon1(Pabellon pabellon1P){
        this.pabellon1=pabellon1P;
    }
    public Pabellon getPabellon1(){
        return pabellon1;
    }
}
