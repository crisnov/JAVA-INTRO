
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite; int suma = 0; int num; int num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un limite positivo: ");
        limite = leer.nextInt();
        
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        while (suma < limite ) {
            System.out.println("Ingrese un numero: ");
            num2 = leer.nextInt();
            suma = num + num2;
        }
        System.out.println("Limite inicial superado");
    }
    
}
