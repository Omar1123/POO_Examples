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
public class Fiesta {
    
    private String nombre;
    private String primeraClave;
    private String segundaClave;
    private String terceraClave;
    private String cuartaClave;
    private String QuintaClave;
    private boolean resultado;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setPrimeraClave(String clave1) {
        this.primeraClave = clave1;
    }
    
    public String getPrimeraClave() {
        return primeraClave;
    }
    
    public void setSegundaClave(String clave2) {
        this.segundaClave = clave2;
    }
    
    public String getSegundaClave() {
        return segundaClave;
    }
    
    public void setTerceraClave(String clave3) {
        this.terceraClave = clave3;
    }
    
    public String getTerceraClave() {
        return terceraClave;
    }
    
    public void setCuartaClave(String clave4) {
        this.cuartaClave = clave4;
    }
    
    public String getCuartaClave() {
        return cuartaClave;
    }
    
    public void setQuintaClave(String clave5) {
        this.QuintaClave = clave5;
    }
    
    public String getQuintaClave() {
        return QuintaClave;
    }
    
    public boolean comprobarPrimeraClave() {
        resultado = false;
        
        if(primeraClave.equals("TIENES")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarSegundaClave() {
        resultado = false;
        
        if(segundaClave.equals("QUESER")) {
            return true;
        } else {          
            return false;
        }
    }
    
    public boolean comprobarTerceraClave() {
        resultado = false;
        
        if(terceraClave.equals("INVITADO")) {
            return true;
        } else {
            return false;
        }
    }    
    
    public boolean comprobarCuartaClave() {
        resultado = false;
        
        if(cuartaClave.equals("PARA")) {
            return true;
        } else {
            return false;
        }
    }    
    
    public boolean QuintaClave() {
        resultado = false;
        
        if(QuintaClave.equals("INGRESAR")) {
            return true;
        } else {
            return false;
        }
    }    
    
    public Fiesta() {
        resultado = false;
        nombre = "";
        primeraClave = "";
        segundaClave = "";
        terceraClave = "";
        cuartaClave = "";
        QuintaClave = "";
    }
}
