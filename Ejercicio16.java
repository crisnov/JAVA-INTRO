
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido.
* 
 * @author crist
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n; int[] vector; /*int num; int buscar; int cont = 0;*/
        
        System.out.println("Ingrese un tamaño para el vector: ");
        n = leer.nextInt();
        vector = new int[n];
        
        /*System.out.println(" " );      
        for (int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random()*9+1);
            System.out.println("v["+i+"]= "+vector[i] );
        }        
        System.out.println(" " ); */
        
        cargarVectorN(vector);
        
        buscarEnVector(vector);
        
       /* System.out.println("Ingrese un numero a buscar dentro del vector: ");
        num = leer.nextInt();
        
        System.out.println(" " );
        
        for (int i = 0; i < vector.length; i++){
            
            if (num == vector[i]) {
                cont++;
                System.out.println("El numero "+vector[i]+" se encuentra en la posicion: v["+i+"]");
            } //else {
                //System.out.println(" " );
            //}  
        }
        System.out.println(" " );
        if (cont > 0) {
                System.out.println("Se repitió "+cont+" veces");
            } else {
                System.out.println("El numero ingresado no se encuentra dentro del vector :(");
            } */
        
        
    }
    
    public static void cargarVectorN (int[] vector){
        Scanner leer = new Scanner(System.in);
        /*System.out.println("Ingrese un tamaño para el vector: ");
        int n = leer.nextInt();
        vector = new int[n];*/
        System.out.println(" " );       
        for (int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random()*9+1);
            System.out.println("v["+i+"]= "+vector[i] );
        }       
        System.out.println(" " );
    }
    
    public static void buscarEnVector (int[] vector) {
        Scanner leer = new Scanner(System.in); int cont=0;
        System.out.println("Ingrese un numero a buscar dentro del vector: ");
        int num = leer.nextInt();
        
        System.out.println(" " );
        
        for (int i = 0; i < vector.length; i++){
            
            if (num == vector[i]) {
                cont++;
                System.out.println("El numero "+vector[i]+" se encuentra en la posicion: v["+i+"]");
            } //else {
                //System.out.println(" " );
            //}  
        }
        System.out.println(" " );
        if (cont > 0) {
                System.out.println("Se repitió "+cont+" veces");
            } else {
                System.out.println("El numero ingresado no se encuentra dentro del vector :(");
            }
    }
    
    
    
}
