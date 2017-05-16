/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author sena
 */
public class Partido {
    
    private int numEs;
    private int resultado;
    private Arbitro arbitro1;
    private Incidencias incidencias1;
    
    
    public void setIncidencias1(Incidencias incidencias1P){
        this.incidencias1=incidencias1P;
    }
    public Incidencias getIncidencias1(){
        return incidencias1;
    }
    
    
    public void setNumEs(int numEsP){
        this.numEs=numEsP;
    }
    public int getNumEs(){
        return numEs;
    }
    
    
    public void setResultado(int resultadoP){
        this.resultado=resultadoP;
    }
    public int getResultado(){
        return resultado;
    }
    
    
    public void setArbitro1(Arbitro arbitro1P){
        this.arbitro1=arbitro1P;
    }
    public Arbitro getArbitro1(){
        return arbitro1;
    }
    
}
