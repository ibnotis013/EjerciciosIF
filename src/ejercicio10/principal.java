package ejercicio10;

import java.util.Scanner;

public class principal {
    static void main() {
        System.out.println("Bienvenio");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el clima:");
        String clima = sc.nextLine();
        System.out.println("Ingrese el temperatura:");
        int temperatura = sc.nextInt();
        if(clima.equals("soleado")){
            if(temperatura >25){
                System.out.println("se recomienda ir a la playa");
            }
            else if (temperatura >= 15 && temperatura<=25){
                System.out.println("se recomienda ir a dar un paseo");
            }
            else if(temperatura <15){
                System.out.println("se recomienda ir a la montanha con chaqueta");
            }
        }
        else if(clima.equals("lluvioso")){
            System.out.println("se recomienda ver una peli en casa");
        }
        else if(clima.equals("nublado")){
            System.out.println("se recomienda ir a un museo");
        }
        else{
            System.out.println("no tengo recomendacion para ese clima");
        }
    }
}
