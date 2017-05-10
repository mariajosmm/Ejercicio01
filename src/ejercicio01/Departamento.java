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
public class Departamento {
    
     private String nombreDep;
    private String direccion;
    
    private Trabajador trabajador1;
    private Doctor doctor1;
    private Alumno alumno1;
    
    public void setTrabajador1(Trabajador trabajador1P){
        this.trabajador1=trabajador1P;
    }
    public Trabajador getTrabajador1(){
        return trabajador1;
    }
    
    
    public void setDoctor1(Doctor doctor1P){
        this.doctor1=doctor1P;
    }
    public Doctor getDoctor1(){
        return doctor1;
    }
    
    
    public void setAlumno1(Alumno alumno1P){
        this.alumno1=alumno1P;
    }
    public Alumno getAlumno1(){
        return alumno1;
    }
    
    
    public void setNombreDep(String nombreDepP){
        this.nombreDep=nombreDepP;
    }
    public String getNombreDep(){
        return nombreDep;
    }
    
    
    public void setDireccion(String direccionP){
        this.direccion=direccionP;
    }
    public String getDireccion(){
        return direccion;
    }
}
