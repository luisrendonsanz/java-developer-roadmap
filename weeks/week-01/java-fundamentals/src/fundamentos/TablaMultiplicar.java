package fundamentos;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa un numero para ver su tabla de multiplicar ");
        int numeroTabla = in.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(numeroTabla+" x "+i+" = "+numeroTabla*i);
        }
        in.close();
    }
}
