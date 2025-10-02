package ejercicio9;

import java.util.Scanner;

public class principal {
    static void main() {
        System.out.println("bienvenido!");
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el primer numero entero");
        int num1 = sc.nextInt();
        System.out.println("introduce el segundo numero entero");
        int num2 = sc.nextInt();
        System.out.println("introduce el tercer numero entero");
        int num3 = sc.nextInt();


        if(num1 > num2 && num1>num3){
            System.out.println("El numero 1 es el mayor");
        }
        else if(num2 > num1 && num2>num3){
            System.out.println("El numero 2 es el mayor");
        }
        else if(num3 > num1 && num3>num2){
            System.out.println("El numero 3 es el mayor");
        }
        else if(num1 == num2 && num1 > num3){
            System.out.println("El numero 1 y el 2 son mayores que el 3 y son iguales");
        }
        else if(num1 > num2 && num1 == num3){
            System.out.println("El numero 1 y el 3 son mayores que el 2 y son iguales");
        }
        else if(num2 > num1 && num2 == num3){
            System.out.println("El numero 2 y el 3 son mayores que el 1 y son iguales");
        }
        else if(num3 == num1 && num3 == num2){
            System.out.println("los 3 numero son iguales");
        }
    }
}
