
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
* 
 * @author crist
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int[][] matriz, matrizT;
        
        matriz=new int[4][4]; matrizT=new int[4][4];
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //System.out.print("matriz[" + i + "][" + j + "]= ");
                matriz[i][j] = (int) (Math.random()*9+1);
                System.out.print("matriz[" + i + "][" + j + "]= "+matriz[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("-----------------------------");
        
        for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
        
        System.out.println("-----------------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            matrizT[i][j] = matriz[j][i]; 
            
            System.out.println("matrizT[" + i + "][" + j + "]= "+matrizT[i][j]);
            }
        }
        
        
        
        
    }
    
}
