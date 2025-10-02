package Ejercicio4;

import java.util.Scanner;

public class principal {
    static void main() {
        System.out.println("Bienvenido, por favor introduzca su peso en kg");
        Scanner sc = new Scanner(System.in);
        double peso=sc.nextDouble();
        System.out.println("introduzca su altura en metros");
        double altura=sc.nextDouble();
        double IMC=peso/(altura*altura);
        if(IMC<18.5){
            System.out.println("bajo peso");
        }
        else if(IMC>=18.5 && IMC<25){
            System.out.println("peso normal");
        }
        else if(IMC>=25 && IMC<30){
            System.out.println("sobre peso");
        }
        else if(IMC>=30){
            System.out.println("obesidad");
        }
    }
}
