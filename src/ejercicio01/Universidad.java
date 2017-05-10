/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author sena
 */
public class Universidad {
    
     private String nombre;
    private String ciudad;
    private Persona persona1;
    private Trabajador trabajador1;
    private Departamento departamento1=new Departamento();
    
    
     public void setPersona1(Persona persona1P){
        this.persona1=persona1P;
    }
    public Persona getPersona1(){
        return persona1;
    }
    
    
     public void setTrabajador1(Trabajador trabajador1P){
        this.trabajador1=trabajador1P;
    }
    public Trabajador getTrabajador1(){
        return trabajador1;
    }
    
   
    public void setDepartamento(Departamento departamento1P){
        this.departamento1=departamento1P;
    }
    public Departamento getDeparmento1(){
        return departamento1;
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
}
