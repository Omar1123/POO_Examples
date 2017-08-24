/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medidas;

/**
 *
 * @author jake
 */
public class Medidas {
    
    private double medida1;
    private double medida2;
    private double medida3;
    private boolean resultado;
    
    public void setMedida1(double medida1) {
        this.medida1 = medida1;
    }
    
    public double getMedida1() {
        return medida1;
    }
    
    public void setMedida2(double medida2) {
        this.medida2 = medida2;
    }
    
    public double getMedida2() {
        return medida2;
    }
    
    public void setMedida3(double medida3) {
        this.medida3 = medida3;
    }
    
    public double getMedida3() {
        return medida3;
    }
    
    public boolean equilatero() {
        resultado = false;
        
        if(medida1 == medida2 && medida1 == medida3) {
            resultado = true;
        } else {
            resultado = false;
        }
        
        return resultado;
    }
    
    public boolean isoceles() {
        resultado = false;
        
        if(medida2 == medida3 || medida1 == medida3) {
            resultado = true;
        } else {
            resultado = false;
        }
        
        return resultado;
    }
    
    public boolean escaleno() {
        resultado = false;
        
        if(medida2 != medida3 || medida1 != medida3) {
            resultado = true;
        } else {
            resultado = false;
        }
        
        return resultado;
    }
    
    public Medidas() {
        this.medida1 = 0;
        this.medida2 = 0;
        this.medida3 = 0;
    }
}
