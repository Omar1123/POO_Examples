/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Medidas.Medidas;
import java.util.Scanner;

/**
 *
 * @author jake
 */
public class Menu {
    
    private Medidas medidas;
    
    public Menu() {
        medidas = new Medidas();
    }
    
    public void recibirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primer medida");
        medidas.setMedida1(scanner.nextDouble());
        System.out.println("Ingrese la segunda medida");
        medidas.setMedida2(scanner.nextDouble());
        System.out.println("Ingrese la tercera medida");       
        medidas.setMedida3(scanner.nextDouble());
    }
    
    public void mostrarMenu() {
        System.out.println("Ejercicio 13");
        recibirDatos();
        System.out.println("Es equilatero? " + medidas.equilatero());
        System.out.println("Es isoceles? " + medidas.isoceles());
        System.out.println("Es escaleno? " + medidas.escaleno());
    }   
}
