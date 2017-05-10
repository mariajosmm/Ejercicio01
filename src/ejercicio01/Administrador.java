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
public class Administrador extends Trabajador{
     private String puesto;
    
    public void setPuesto(String puestoP){
        this.puesto=puestoP;
    }
    public String getPuesto(){
        return puesto;
    }
}
