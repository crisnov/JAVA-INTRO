
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * @author crist
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        num = leer.nextInt();
        System.out.println("El doble del nº es: " + num*2);
        System.out.println("El triple del nº es: " + num*3);
        System.out.println("La raiz cuadrada del nº es: " + Math.sqrt(num));
    }
    
}
