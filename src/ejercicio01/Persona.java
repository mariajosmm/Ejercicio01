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
public class Persona {
    private String DNI;
    private String nombre;
    
    public void setDNI(String DNIP){
        this.DNI=DNIP;
    }
    public String getDNI(){
        return DNI;
    }
    
    
    public void setNombre(String nombreP){
        this.nombre=nombreP;
    }
    public String getNombre(){
        return nombre;
    }
}
