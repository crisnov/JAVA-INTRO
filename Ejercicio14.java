
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 * @author crist
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int e; String moneda;
        
        System.out.println("Ingrese la cantidad de euros a convertir: ");
        e = leer.nextInt();
        
        System.out.println("Elija a qué moneda desea convertir (l-libra, d-dolar, y-yen)");
        moneda = leer.next();
        
        //System.out.println("La cantidad de euros a libra es: " + conversion(leer.nextInt()));
        
        conversion(e,moneda);
    }
    
    public static double conversion(int e, String moneda) {
        double l;
        
        if (moneda.equals("l")) {
            l = e * 0.86;
            System.out.println("La cantidad de euros a libra es: " + l);
        } else if (moneda.equals("d")){
            l = e * 1.28611;
            System.out.println("La cantidad de euros a dolares es: " + l);
        } else {
            l = e *129.852;
            System.out.println("La cantidad de euros a yenes es: " + l);
        }
        
        
        return l;
   
    }
    
}
