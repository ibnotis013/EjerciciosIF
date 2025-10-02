package ejercicio7;

import java.util.Scanner;

public class principal {
    static void main() {
        System.out.println("bienvenido! introduza una nota del 0 al 100");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        if (nota>=90 && nota<=100) {
            System.out.println("tu nota es un sobresaliente (A)");
        }
        else if (nota>=80 && nota<=89) {
            System.out.println("tu nota es un notable (B)");
        }
        else if (nota>=70 && nota<=79) {
            System.out.println("tu nota es un aprobado (C)");
        }
        else if (nota>=60 && nota<=69) {
            System.out.println("tu nota es un suficiente (D)");
        }
        else if (nota>=0 && nota<=59) {
            System.out.println("tu nota es un suspenso (F)");
        }
        else{
            System.out.println("ERROR, LA NOTA ESTA FUERA DEL RANGO DE 0-100");
        }
    }
}
