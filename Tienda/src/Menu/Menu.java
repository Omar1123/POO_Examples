/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Objeto.Vendedor;
import java.util.Scanner;

/**
 *
 * @author jake
 */
public class Menu {
    
    private Vendedor vendedor;
    
    public Menu() {
        vendedor = new Vendedor();
    }
    
    public void recibirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor");
        vendedor.setNombre(scanner.next());
        System.out.println("Ingrese el sueldo");
        vendedor.setSueldo(scanner.nextDouble());
        System.out.println("Ingrese la cuota de ventas");
        vendedor.setVentas(scanner.nextDouble());
    }
    
    public void mostrarMenu() {
        System.out.println("Ejercicio 14");              
        recibirDatos();
        System.out.println("La comision que ha recivido por ventas es: " + vendedor.comisionPorVentas());
    }
    
}
