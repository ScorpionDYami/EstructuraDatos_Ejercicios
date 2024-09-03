
package mx.itson.palindromo;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Palindromo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresar texto: ");
        String cadena = entrada.nextLine();
        
        String cadenaLimpia = cadena.replaceAll("\\s+", "").toLowerCase();
        StringBuilder cadenaSb = new StringBuilder(cadenaLimpia);
        String cadenaInvertida = cadenaSb.reverse().toString();
        
        String palindromo = cadenaLimpia.equals(cadenaInvertida) ? "\nSi es un palíndromo" : "\nNo es un palíndromo";
        System.out.println(palindromo);

    }
}
