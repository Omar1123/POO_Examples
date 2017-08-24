/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Object.Trabajador;
import java.util.Scanner;

/**
 *
 * @author jake
 */
public class Menu {
    
    private Trabajador trabajador;
    private double resultado;
    
    public Menu() {
        trabajador = new Trabajador();
    }
    
    public void recibirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto de venta");
        trabajador.setVentas(scanner.nextDouble());
    }
    
    public void mostrarMenu() {
        System.out.println("Ejercicio 11");
        recibirDatos();
        System.out.println("El precio a pagar es: " + trabajador.totalPago());
    }
}
