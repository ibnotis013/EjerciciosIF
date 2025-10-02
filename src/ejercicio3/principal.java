package ejercicio3;

import java.util.Scanner;

public class principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre de usuario");
        String user = sc.nextLine();
        String user1 = "admin";
        System.out.println("por favor introdizca la contraseña");
        String contrasenha = sc.nextLine();
        String conntrasenha1 = "Cs2GOTY";
        if (contrasenha.equals(conntrasenha1)&&user.equals(user1)) {
         System.out.println("Contraseña correcta, Bienvenido!");
     }else{
         System.out.println("contraseña incorrecta");
     }


    }
}
