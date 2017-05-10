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
public class Doctor extends Docente {
    
    
    private int maxTesis;
    private Postgrado postgrado1;
    
    
    public void setPostgrado1(Postgrado postgrado1P){
        this.postgrado1=postgrado1P;
    }
    public Postgrado getPostgrado1(){
        return postgrado1;
    }
    
    
    public void setMaxTesis(int maxTesisP){
        this.maxTesis=maxTesisP;
    }
    public int getMaxTesis(){
        return maxTesis;
    }
}
