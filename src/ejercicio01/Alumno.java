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
public class Alumno extends Persona {
     private String domicilio;
       
    
    public void setDomicilio(String domicilioP){
        this.domicilio=domicilioP;
    }
    public String getDomicilio(){
        return domicilio;
    }
}
