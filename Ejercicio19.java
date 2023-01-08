
import java.util.Scanner;

/*
 * To change tawdawhis license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author crist
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz,matrizT; int n; boolean antisimetrica=true;
        
        System.out.println("Ingrese un tamaño para la matriz: ");
        n = leer.nextInt();
        matriz=new int[n][n]; matrizT=new int[n][n];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //System.out.print("matriz[" + i + "][" + j + "]= ");
                System.out.println("Ingrese los valores para la matriz: ");
                matriz[i][j] = leer.nextInt();
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
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
	        matriz[j][i] = (-1) * matriz[j][i];
	        matrizT[i][j] = matriz[j][i];
	        matriz[j][i] = (-1) * matriz[j][i];
	            if(matrizT[i][j] != matriz[i][j]) {
                        antisimetrica = false;
	            	i = 3;
	            	break;
	            }
	    }
	}
        
        if(antisimetrica) {System.out.println("La matriz es antisimetrica");}
            else {System.out.println("La matriz NO es antisimetrica");}
        
    }
    
}
