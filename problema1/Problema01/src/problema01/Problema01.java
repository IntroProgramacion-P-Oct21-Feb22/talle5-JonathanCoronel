/*
 * Solución que permita calcular y mostrar el valor a cancelar de una planilla 
 * de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de 
 * kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, se 
 * debe descontrar el 10%.
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JonathanCoronel
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución del problema 01
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoHora;
        double kwConsumidos;
        double valorTotal;
        int edad;
        double descuento;
        double porcentaje;
        porcentaje = 10;
        System.out.println("Ingrese el costo de un Kilovatio Hora");
        costoHora = entrada.nextDouble();
        System.out.println("Ingrese su consumo de Kilovatios en el mes");
        kwConsumidos = entrada.nextDouble();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        valorTotal = kwConsumidos * costoHora;
        if (edad > 65) {
            descuento = (valorTotal * porcentaje) / 100;
            valorTotal = valorTotal - descuento;
        }
        System.out.printf("El valor total a pagar es de:valorTotal: %.2f\n",
                valorTotal);
    }
}
