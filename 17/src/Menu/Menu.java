/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Object.Alumno;
import Object.Clase;
import java.util.Scanner;

/**
 *
 * @author jake
 */
public class Menu {
    
    private Alumno alumno;
    private Clase clases;
    
    public Menu() {
        alumno = new Alumno();
        clases = new Clase();
    }
    
    public void obtenerDatos() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su codigo");
        alumno.setCodigo(scanner.nextInt());                      
        System.out.println("Ingrese su primer nombre");
        alumno.setPrimerNombre(scanner.next());
        System.out.println("Ingrese su segundo nombre");
        alumno.setSegundoNombre(scanner.next());
        System.out.println("Ingrese su primer apellido");
        alumno.setPrimerApellido(scanner.next());
        System.out.println("Ingrese su segundo apellido");
        alumno.setSegundoApellido(scanner.next());        
    }
    
    public void obtenerDatosNotas() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el codigo del alumno");
        clases.setAlumno(scanner.nextInt());            
        System.out.println("Ingrese la primera nota");
        clases.setNota1(scanner.nextDouble());            
        System.out.println("Ingrese la segunda nota");
        clases.setNota2(scanner.nextDouble());            
    }
    
    public void mostrarMenu() {
        System.out.println("Ejercicio 17");            
        obtenerDatos();
        obtenerDatosNotas();
                
        System.out.println("Su codigo es: " + alumno.generarCodigo());
        System.out.println("Su promedio es: " + clases.obtenerPromedio());
    }
}
