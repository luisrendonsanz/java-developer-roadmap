package fundamentos;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa un numero para determinar si es par o impar");
        int numeroEvaluar = in.nextInt();
        in.nextLine();
        //ternario
        String resultado = (numeroEvaluar%2==0) ? "par" : "impar";
        System.out.println("el numero que ingresaste es "+resultado);

        // condiciones
        if(numeroEvaluar%2==0){
            System.out.println("El numero que ingresaste es par");
        }
        else{
            System.out.println("El numero que ingresaste es impar");
        }
    }
}
