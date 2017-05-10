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
public class Docente extends Trabajador {
    
     private int maxProyectos;
    private String categoria;
    private Grado grado1;
    
    
    public void setGrado1(Grado grado1P){
        this.grado1=grado1P;
    }
    public Grado getGrado1(){
        return grado1;
    }
    
    
    public void setMaxProyectos(int maxProyectosP){
        this.maxProyectos=maxProyectosP;
    }
    public int getMaxProyectos(){
        return maxProyectos;
    }
    
    
    public void setCategoria(String categoriaP){
        this.categoria=categoriaP;
    }
    public String getCategoria(){
        return categoria;
    }
}
