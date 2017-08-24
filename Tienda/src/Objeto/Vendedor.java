/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author jake
 */
public class Vendedor {
    
    private String nombre;
    private double ventas;
    private double sueldo;
    private double comision;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
    
    public double getVentas() {
        return ventas;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public double comisionPorVentas() {
        
        comision = 0;
        
        if(ventas > 1000) {
            comision = ventas * 15/100;
        }
        
        if(ventas > 500 && ventas < 1000) {
            comision = ventas * 5/100;
        }
        
        if(ventas < 500) {
            comision = ventas * 0/100;
        }
        
        return comision;
        
    }
    
    public Vendedor() {
        this.nombre = "";
        this.ventas = 0;
        this.comision = 0;
    }
}
