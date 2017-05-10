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
public class Grado extends Alumno{
    
    private String titulacion;
    private String curso;
    private Departamento departamento1;
    
    
    public void setDepartamento1(Departamento departamento1P){
        this.departamento1=departamento1P;
    }
    public Departamento getDepartamento1(){
        return departamento1;
    }
    
    
    public void setTitulacion(String titulacionP){
        this.titulacion=titulacionP;
    }
    public String getTitulacion(){
        return titulacion;
    }
    
    
    public void setCurso(String cursoP){
        this.curso=cursoP;
    }
    public String getCurso(){
        return curso;
    }
}
