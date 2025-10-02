package ejercicio8;

import java.util.Scanner;

public class principal {
    static void main() {
        System.out.println("BIENVENIDO, ERES UN EMPLEADO?");
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();
        int nivel = sc.nextInt();
        if (opcion.equals("Si")) {
            System.out.println("cual es su nivel de acceso");
            if (nivel>=1 && nivel<=4){
                System.out.println("ACCESO LIMITADO");
            }
            else if (nivel==5){
                System.out.println("ACCESO TOTAL");
            }
            else{
                System.out.println("ACCESO DENEGADO");
            }
        }
        else if (opcion.equals("No")) {
            System.out.println("ACCESO DENEGADO");
        }
        else {
            System.out.println("ACCESO DENEGADO");
        }
    }
}
