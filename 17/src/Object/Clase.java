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
public class Clase {
    
    private int alumno;
    private double nota1;
    private double nota2;
    private double promedio;
    
    public void setAlumno(int alumno) {
        this.alumno = alumno;
    }
    
    public int getAlumno() {
        return alumno;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota1() {
        return nota1;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double getNota2() {
        return nota2;
    }
    
    public Clase() {
        this.alumno = 0;
        this.nota1 = 0;
        this.nota2 = 0;
        this.promedio = 0;
    }
    
    public double obtenerPromedio() {
       promedio = 0; 
       promedio = nota1 + nota2;
       promedio = promedio / 2;
       return promedio;
    }
}
