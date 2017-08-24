/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Object.Product;
import java.util.Scanner;

/**
 *
 * @author jake
 */
public class Menu {
    
    private Product product;
    private int operando;
    
    
    public Menu() {
        product = new Product();
    }
    
    public void realizarOperacion() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        product.setNumero(scanner.nextInt());
        
        operando = 1;
        
        for(int i=1; i<= product.getNumero(); i++) {
            operando = operando * i;
            System.out.println(operando);
        }
    }
    
    public void mostrarMenu() {
        System.out.println("Ejercicio 12");   
        realizarOperacion();
    }   
}
