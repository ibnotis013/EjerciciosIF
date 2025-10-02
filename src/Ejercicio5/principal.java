package Ejercicio5;

import java.util.Scanner;

public class principal {
    static void main() {
        System.out.println("introduzca un anho");
        Scanner sc = new Scanner(System.in);
        int anho = sc.nextInt() ;

        if (anho %4==0 && anho%100!=0){
            System.out.println("el anho es bisiesto");
        }
        else if (anho%100==0 && anho%4!=0 || anho%400!=0 ) {
                System.out.println("el anho no es bisiesto");
        }
        else if (anho%400==0){
            System.out.println("el anho es bisiesto");
        }
    }
}
