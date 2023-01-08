
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author crist
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, cifra1=0, cifra2=0, cifra3=0, cifra4=0, cifra5=0; int[] vector;
       // System.out.println((Math.abs(num))); //valor absoluto del numero por si es negativo
       // System.out.println((Math.log10(Math.abs(num))+1 )); //conocer la base del numero y sumarle 1 por si es cero
        
        System.out.println("Ingrese un tamaño para el vector: ");
        n = leer.nextInt();
        vector = new int[n];
        System.out.println("----------------------------------");
        
        for (int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random()*99999+1);
            System.out.println("v["+i+"]= "+vector[i] );
        }
        
        for (int i = 0; i < vector.length; i++){
            
            if (Math.floor(Math.log10(Math.abs(vector[i])) + 1) == 1) {
                cifra1++;
            } else if (Math.floor(Math.log10(Math.abs(vector[i])) + 1) == 2) {
                cifra2++;
            } else if (Math.floor(Math.log10(Math.abs(vector[i])) + 1) == 3) {
                cifra3++;
            } else if (Math.floor(Math.log10(Math.abs(vector[i])) + 1) == 4) {
                cifra4++;
            } else if (Math.floor(Math.log10(Math.abs(vector[i])) + 1) == 5) {
                cifra5++;
            }
        }
        
            System.out.println("----------------------------------");
            System.out.println("Cantidad de nros con 1 digito: "+cifra1);        
            System.out.println("Cantidad de nros con 2 digitos: "+cifra2);        
            System.out.println("Cantidad de nros con 3 digitos: "+cifra3);        
            System.out.println("Cantidad de nros con 4 digitos: "+cifra4);       
            System.out.println("Cantidad de nros con 5 digito: "+cifra5);
        
        
        
        
       //if (num == 0) {
       //     num++;
       // }
       //System.out.println(Math.floor(Math.log10(Math.abs(num)) + 1));
        
        
    }
    
}
