package ejercicio6;

import java.util.Scanner;

public class principal {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("bienvenido introduzca un numero del 1 al 4 para seleccionar");
        System.out.println("*************************************************************");
        System.out.println("el numero 1 CONSULTAR SALDO");
        System.out.println("el numero 2 INGRESAR DINERO");
        System.out.println("el numero 3 RETIRAR DINERO");
        System.out.println("el numero 4 SALIR");
        int numero = sc.nextInt();

        if (numero == 1) {
            System.out.println("500000€");
        }
        else if (numero == 2) {
            System.out.println("INGRESE EL DINERO");
        }
        else if (numero == 3) {
            System.out.println("EXTRAYENDO DINERO");
        }
        else if (numero == 4) {
            System.out.println("EXTRAYENDO TARGETA ");
        }

        else {
            System.out.println("ERROR");
        }

    }
}
