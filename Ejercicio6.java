    
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Crear un programa que dado un numero determine si es par o impar.
 * @author crist
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else if (num % 2 != 0) {
            System.out.println("El numero es impar");
        }
        
    }
    
}
