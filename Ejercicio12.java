
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 * @author crist
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = "A" ; int longitud; int correcto=0; int incorrecto=0;
        
        while (!frase.equals("&&&&&")) {
            System.out.println("Ingrese una frase: ");
            frase = leer.next();
            longitud = frase.length();
            
        
                if (frase.length() <= 5 && frase.substring(0, 1).equals("X") && frase.substring(longitud - 1).equals("O") ) { 
            correcto++;
            } else if (frase.equals("&&&&&")) {
                System.out.println("-----------");  
            }else {
                incorrecto++;
            }
        }       
        System.out.println("La cantidad de lecturas correctas son: " + correcto);
        System.out.println("La cantidad de lecturas incorrectas son: " + (incorrecto));
        
    }
    
}
