
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 * @author crist
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100]; /*int num;*/ /*String aux="";*/
        Scanner leer = new Scanner(System.in);
        
/*        for (int i = 0; i < vector.length; i++){
            
           System.out.println("Ingrese un valor para la posicion: " + i );
            
            num = (int)(Math.random()*100);
            num = leer.nextInt();
            
            if (num >= 0 && num < 100){
                vector[i] = num;
                System.out.println("v["+i+"]= "+num );
            }            
        } */

        rellenarVector(vector);
        mostrarVector(vector);
        
        
       /* System.out.println("------------");
        System.out.println("* vector[i]:");
            for (int elemento: vector) {
                aux = aux + " | " + elemento;
            }
            System.out.println(aux+ " |"); */   
    }
    
    public static int[] rellenarVector (int[] vector){
        int num;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor para la posicion: " + i );
            num = (int)(Math.random()*100);
            
                if (num >= 0 && num < 100) {
                    vector[i] = num;
                System.out.println("v["+i+"]= "+num );            
            }
        }
        return vector;
    }
    
    public static void mostrarVector (int[] vector) {
        String aux=" ";
        System.out.println("------------");
        System.out.println("* vector[i]:");
            for (int elemento: vector) {
                aux = aux + " | " + elemento;
            }
            System.out.println(aux+ " |");
    }
    
    
}
