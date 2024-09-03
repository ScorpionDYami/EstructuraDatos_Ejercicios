
package mx.itson.generarrfc;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class GenerarRfc {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar datos:");
        System.out.print("\nPrimer Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Primer Apellido: ");
        String primerApellido = entrada.nextLine();
        System.out.print("Segundo Apellido: ");
        String segundoApellido = entrada.nextLine();
        System.out.println("Ingresar fecha (dd/MM/YYYY): ");
        String fecha = entrada.nextLine();

        fecha = fecha.replaceAll("\\s", "");
        String[] fechaPartes = fecha.split("/");
        int mes = Integer.parseInt(fechaPartes[1].toString());
        int dia = Integer.parseInt(fechaPartes[0].toString());
        String mesFormateado = String.format("%02d", mes);
        String diaFormateado = String.format("%02d", dia);
        

        String rfc = primerApellido.substring(0,2).toUpperCase() + 
        segundoApellido.substring(0,1).toUpperCase() +
        nombre.substring(0,1).toUpperCase() +
        fechaPartes[2].substring(2,4) +
        mesFormateado + diaFormateado;

        System.out.println(rfc);

    }
}
