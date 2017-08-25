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
public class Alumno {
    
    private int codigo;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String codigoGenerado;
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    
    public String getPrimerNombre() {
        return primerNombre;
    }
    
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    
    public String getSegundoNombre() {
        return segundoNombre;
    }
    
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    
    public String getPrimerApellido() {
        return primerApellido;
    }
    
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
    public String getSegundoApellido() {
        return segundoApellido;
    }
    
    public String generarCodigo() {
        codigoGenerado = null;
        
        String ultimoDigitosPrimerNombre = primerNombre.substring(primerNombre.length() - 2, primerNombre.length());
        String ultimoDigitosSegundoNombre = segundoNombre.substring(segundoNombre.length() - 2, segundoNombre.length());
        
        codigoGenerado = segundoApellido.substring(0,2) + primerApellido.substring(0,2) + ultimoDigitosPrimerNombre + ultimoDigitosSegundoNombre + codigo;
        return codigoGenerado;
    }
    
    public Alumno() {
        codigo = 0;
        primerNombre = "";
        segundoNombre = "";
        primerApellido = "";
        segundoApellido = "";
        codigoGenerado = "";
    }
}
