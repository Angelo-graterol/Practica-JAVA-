package variables;
import java.util.Scanner;
public class variables{

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Bienvenid@");
        System.out.println("Calcula el precio final de tu producto con decuento");


        System.out.println("Ingresa el valor de tu producto");
        double precioOriginal= scanner.nextDouble();
        System.out.println("Ingresa el valor porcentaje del descuento");
        double porcentajeDescuento= scanner.nextDouble();

        double descuento;
        descuento= precioOriginal * (porcentajeDescuento/100);

        double precioFinal;
        precioFinal= precioOriginal - descuento;

        System.out.println("Total a pagar con descuento: " + precioFinal);
        System.out.println("Gracias por tu compra =)");

        scanner.close();
    }
}