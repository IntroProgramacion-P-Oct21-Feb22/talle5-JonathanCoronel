/*
 * Elaborar una solución que permita leer los datos de un automóvil 
 * (marca, origen y costo) imprima el impuesto por pagar y el precio de venta 
 * (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, si es de 
 * Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JonathanCoronel
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución del problema 03
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String marca;
        String origen;
        double costo;
        double impuesto = 0;
        double porcentaje;
        double valorTotal;

        System.out.println("Ingrese la marca del automóvil ");
        marca = entrada.nextLine();
        System.out.println("Ingrese el país de origen del automóvil");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del automóvil");
        costo = entrada.nextDouble();
        valorTotal = costo;
        if (origen.equals("Alemania")) {
            porcentaje = 20;
            impuesto = (valorTotal * porcentaje) / 100;
            valorTotal = valorTotal + impuesto;
        } else {
            if (origen.equals("Japón")) {
                porcentaje = 30;
                impuesto = (valorTotal * porcentaje) / 100;
                valorTotal = valorTotal + impuesto;
            } else {
                if (origen.equals("Italia")) {
                    porcentaje = 15;
                    impuesto = (valorTotal * porcentaje) / 100;
                    valorTotal = valorTotal + impuesto;
                } else {
                    if (origen.equals("USA")
                            || origen.equals("Estados unidos")) {
                        porcentaje = 8;
                        impuesto = (valorTotal * porcentaje) / 100;
                        valorTotal = valorTotal + impuesto;
                    }
                }
            }
        }
        System.out.printf("El impuesto a pagar por el automóvil es de:%.2f\n"
                ,impuesto);
        System.out.printf("El valor total a pagar por el automóvil es de: %.2f"
                ,valorTotal );
    }
}
