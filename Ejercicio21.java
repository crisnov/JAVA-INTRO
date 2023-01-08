
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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int[][] matrizP = new int[3][3];
        int cont, veces=0;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
           //     matriz[i][j] = leer.nextInt();
               // matriz[i][j]=j+1;
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
        System.out.println("ingrese los valores de la matrizP");
        for (int j = 0; j < 3; j++) {
            for (int h = 0; h < 3; h++) {
                System.out.print("Posición Fila: " + (j+1)+" Columna: "+ (h+1)+" -> ");
                matrizP[j][h] = leer.nextInt();
            }
            System.out.println(" ");
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               if (matriz[i][j] == matrizP[0][0]) {                 
                   if (i+2 < 10 && j+2 < 10){
                       cont=0;
                       for (int k = 0; k < 3; k++) {
                           for (int l = 0; l < 3; l++) {
                               if (matrizP[k][l] == matriz[i+k][j+l]){
                                   cont++;
                               }
                           }
                           
                       }
                       if(cont==9){
                           System.out.println("Se encuentra en la coordenada: "+i+", "+j);
                           veces++;
                       } 
                   }
               }
            }
        }
        
        if(veces == 0) {
            System.out.println("Matriz P no se encuentra dentro de la Matriz");
        }

    }
    
}
