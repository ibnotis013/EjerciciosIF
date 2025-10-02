package ejercicio2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class principal {
    static void main() {

        System.out.println("bienvenido");
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el valor para el lado A");
        int ladoA = sc.nextInt();
        System.out.println("ingresa el valor para el lado B");
        int ladoB = sc.nextInt();
        System.out.println("ingresa el valor para el lado C");
        int ladoC = sc.nextInt();

        if (ladoA == ladoB && ladoA == ladoC) {
            System.out.println("los tres lados son iguales entonces es un triangulo Equilatero");
        }
        if (ladoA != ladoB && ladoA == ladoC || ladoA == ladoB && ladoA != ladoC || ladoC == ladoB && ladoC != ladoA) {
            System.out.println("dos lados son iguales y uno es distinto por lo que es un triangulo isosceles");
        }
        if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            System.out.println("los tres lado son distintos por lo que es un triangulo escaleno");
        }


    }
}
