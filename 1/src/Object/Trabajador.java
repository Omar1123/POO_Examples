/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author jake
 */
public class Trabajador {
    
    private double ventas;
    private double resultado;
    
    public void setVentas(double horas) {
        this.ventas = horas;
    }
    
    public double getVentas() {
        return ventas;
    }
    
    public double totalPago() {
        
        resultado = 0;
        
        if(ventas >= 500) {
            resultado = ventas - (ventas * 30/100);
        }
        
        if(ventas >= 200 && ventas < 500) {
            resultado = ventas - (ventas * 20/100);
        }
        
        if(ventas >= 100 && ventas < 200) {
            resultado = ventas - (ventas * 20/100);
        }
        
        return resultado;       
    }
    
    public Trabajador() {
        ventas = 0;     
    }
}
