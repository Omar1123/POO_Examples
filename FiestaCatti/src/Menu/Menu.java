/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Objeto.Fiesta;
import java.util.Scanner;

/**
 *
 * @author jake
 */
public class Menu {
    
    private Fiesta fiesta;
    
    public Menu() {
        fiesta = new Fiesta();
    }
    
    public void recibirDatos() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        fiesta.setNombre(scanner.next());
                
        System.out.println("Ingrese la primera clave");
        fiesta.setPrimeraClave(scanner.next());
        
        if(fiesta.comprobarPrimeraClave() == true) {
            System.out.println("Ingrese la segunda clave");
            fiesta.setSegundaClave(scanner.next());
            if(fiesta.comprobarSegundaClave() == true) { 
                System.out.println("Ingrese la tercera clave");
                fiesta.setTerceraClave(scanner.next());    
                if(fiesta.comprobarTerceraClave() == true) { 
                    System.out.println("Ingrese la cuarta clave");
                    fiesta.setCuartaClave(scanner.next());    
                    if(fiesta.comprobarCuartaClave() == true) {
                        System.out.println("Ingrese la quinta clave");
                        fiesta.setQuintaClave(scanner.next());    
                        if(fiesta.QuintaClave() == true) {
                            System.out.println("BIENVENIDO A LA FIESTA");
                        } else {
                            System.out.println("TE EQUIVOCASTE DE FIESTA");
                        }           
                    } else {
                        System.out.println("TE EQUIVOCASTE DE FIESTA");
                    }
                } else {
                    System.out.println("TE EQUIVOCASTE DE FIESTA");
                }
            } else {
                System.out.println("TE EQUIVOCASTE DE FIESTA");
            }
        } else {
            System.out.println("TE EQUIVOCASTE DE FIESTA");
        }
        
    }
    
    public void mostrarMenu() {
        System.out.println("Ejercicio 15");              
        recibirDatos();
    }
}
