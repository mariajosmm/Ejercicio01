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
public class Trabajador extends Persona {
    
    private String inicioContrato;
      
    
    public void setInicioContrato(String inicioContratoP){
    this.inicioContrato=inicioContratoP;
}
    public String getInicioContrato(){
        return inicioContrato;
    }
}
