/*
 * Solución que imprima el costo de un pedido de un artículo del cual se tiene 
 * la descripción, la cantidad que se requiere y el precio unitario. Si la 
 * cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author JonathanCoronel
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución del problema 02
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double cantidad_pedida;
        double coste_unidad;
        double valorTotal;
        double descuento;
        double porcentaje = 15;
        String articulo;

        System.out.println("Ingrese el nombre del articulo");
        articulo = entrada.nextLine();
        System.out.println("Ingrese la cantidad del pedido");
        cantidad_pedida = entrada.nextDouble();
        System.out.println("Ingrese el valor unitario del articulo");
        coste_unidad = entrada.nextDouble();
        valorTotal = cantidad_pedida * coste_unidad;
        if (cantidad_pedida > 50) {
            descuento = (valorTotal * porcentaje) / 100;
            valorTotal = valorTotal - descuento;
        }
        System.out.printf("El valor total a pagar por %s", articulo);
        System.out.printf("es de: %.2f\n" , valorTotal);
    }

}
