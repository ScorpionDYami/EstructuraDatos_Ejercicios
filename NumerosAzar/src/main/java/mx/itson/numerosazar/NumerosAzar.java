
package mx.itson.numerosazar;

import java.util.Random;

/**
 *
 * @author Kevin
 */
public class NumerosAzar {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numeros = new int[10];
        double promedio = 0.0;
        int numerosPrimos = 0;
        int numerosPares = 0;
        int numMayor = 0;
        int numMenor = 0;

        for(int i=0;i < numeros.length;i++){
            numeros[i] = random.nextInt(100)+1;
            promedio += numeros[i];

            if(numeros[i] % 2 == 0){
                numerosPares += 1;
            }

            if(esPrimo(numeros[i])){
                numerosPrimos += 1;
            }

            System.out.print(numeros[i]);
            if(i < numeros.length - 1){
                System.out.print(", ");
            }
        }

        numMayor = numeros[0];
        numMenor = numeros[0];
        for(int i=0;i < numeros.length;i++){
            if(numMayor < numeros[i]){
                numMayor = numeros[i];
            }
            if(numMenor > numeros[i]){
                numMenor = numeros[i];
            }
        }

        promedio /= 10;
        System.out.println("\n\nPromedio: " + promedio);
        System.out.println("Números Primos: " + numerosPrimos);
        System.out.println("Números Pares: " + numerosPares);
        System.out.println("Número Mayor: " + numMayor);
        System.out.println("Número Menor: " + numMenor);

        

    }

    public static boolean esPrimo(int num){
        if(num == 2){
            return true;
        }
        if(num <= 1 || num % 2 == 0){
            return false;
        }

        for(int i=3;i*i <= num;i+=2){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
