package Ejercicio1;

import java.util.Scanner;

public class principal {
    static void main() {
        System.out.println("bienvenido, porfa introduce tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        double precioentrada=100;

        if (edad<5){
            System.out.println("al tener menos de 4 años entras gratis ");
            precioentrada=0;
            System.out.println("el precio de la entrada "+precioentrada);
        }
        else if (edad>=5 && edad<=12){
            precioentrada=precioentrada%50;
            System.out.println("al tener entre 5 y 12 tienes un 50% de descuento");
            System.out.println("el precio de la entrada es "+precioentrada);
        }
        else if (edad>=13 && edad<=64){
            System.out.println("al tener entre 13 y 64 tienes que pagar todo el precio");
            System.out.println("el precio de la entrada es "+precioentrada);
        }
        else if (edad>=65){
            precioentrada=precioentrada%75;
            System.out.println("al ser un señor mayor tienes el 75% de descuento");
            System.out.println("el precio de la entrada es "+precioentrada);
        }


    }
}
