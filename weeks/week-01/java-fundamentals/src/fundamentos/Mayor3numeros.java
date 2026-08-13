package fundamentos;

import java.util.Scanner;

public class Mayor3numeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa 3 numeros y te dire cual es el mayor");
        int numero1 = in.nextInt();
        int numero2 = in.nextInt();
        int numero3 = in.nextInt();

        int numeroMayor = numero1;
        if(numero2>numeroMayor){
            numeroMayor = numero2;
        }
        if(numero3>numeroMayor){
            numeroMayor=numero3;
        }
        System.out.println("el numero mayor es "+numeroMayor);
        in.close();
    }
}
