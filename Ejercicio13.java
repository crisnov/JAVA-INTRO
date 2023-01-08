
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 * @author crist
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado de asteriscos: ");
        n = leer.nextInt();
        
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if ((i == 1) || (i == n) || (j == 1) || (j == n))
                    System.out.print("*");
                 else 
                   System.out.print(" ");
            }System.out.println();
        }   
    }
}
        
   
    

