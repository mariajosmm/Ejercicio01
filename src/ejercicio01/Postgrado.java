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
public class Postgrado extends Alumno {
    
    private String programa;
        
    
    public void setPrograma(String programaP){
        this.programa=programaP;
    }
    public String getPrograma(){
        return programa;
    }
}
