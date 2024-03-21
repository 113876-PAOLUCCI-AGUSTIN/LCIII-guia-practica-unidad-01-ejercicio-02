/*
* LC_III-guía-práctica-unidad-01-ejercicio-02
* Hacer un programa que ingrese el precio de un artículo a la venta y calcule
* el precio con IVA.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio del artículo...");
        Double precioArticulo = teclado.nextDouble();
        System.out.println("Precio del articulo IVA incl.:"+calcularIVA(precioArticulo));
    }
    private static Double calcularIVA(Double precio) {
        return precio * 1.21;
    }
}