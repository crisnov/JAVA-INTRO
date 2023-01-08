
import java.util.Locale;
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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int[][] matrizMagica = new int[3][3];
        int valorReferencia = 0, valorEvaluar = 0;
        boolean esMagica = true;
        System.out.println("complete la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                do {
                    System.out.print("Posición Fila: " + (i+1)+" Columna: "+ (j+1)+" -> ");
                    matrizMagica[i][j] = leer.nextInt();
                } while (matrizMagica[i][j]<0 || matrizMagica[i][j]>10);
            }
            System.out.println(" ");
        }
        
        //la diagona principal sirve para referencia
        for (int i = 0; i < 3; i++) {
            valorReferencia += matrizMagica[i][i];
        }
        
        //primer paso analizar la diagonal secundaria
        int indiceContrario = 2;
        for (int i = 0; i < 3; i++) {
            valorEvaluar += matrizMagica[i][indiceContrario];
            indiceContrario --;
        }
        if (valorReferencia != valorEvaluar ){
            System.out.println("La Diagonal Secundaria No Coincide. NO ES MAGICA");
            esMagica = false;
        }
        //las dos diagonales coinciden validar al sumar cada fila
        if (esMagica){
            for (int i = 0; i < 3; i++) {
                valorEvaluar = 0;
                for (int j = 0; j < 3; j++) {
                    valorEvaluar += matrizMagica[i][j];
                }
                if (valorReferencia != valorEvaluar ){
                    System.out.println("La Fila " + i + " NO Coincide. NO ES MAGICA");
                    esMagica = false;
                    break;
                }                
            }
        }
        //las dos diagonales y las filas coinciden validar al sumar cada columna
        if (esMagica){
            for (int i = 0; i < 3; i++) {
                valorEvaluar = 0;
                for (int j = 0; j < 3; j++) {
                    valorEvaluar += matrizMagica[j][i];
                }
                if (valorReferencia != valorEvaluar ){
                    System.out.println("La columna " + i + " NO Coincide. NO ES MAGICA");
                    esMagica = false;
                    break;
                }                
            }
        }
        if (esMagica){        
            System.out.println("MATRIZ MAGICA¡¡¡¡¡¡");
        }
    }
    
}
