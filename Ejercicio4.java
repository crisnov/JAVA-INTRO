
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author crist
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp; int F;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Temperatura en ºC: ");
        temp = leer.nextInt();
        System.out.println("Ahora se convertirá a ºF");
        F = 32 + ((9 * temp) / 5);
        System.out.println("Su temp en ºF es: " + F + " ºF");
        
    }
    
}
