package fundamentos;

import java.util.Scanner;

public class SumaDeUnoHastaN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa hasta que numero sumar");
        int finSuma = in.nextInt();
        int suma = 0;
        for (int i = 1; i <= finSuma; i++) {
            suma += i;
        }
        System.out.println("la suma del 1 hasta el numero " + finSuma + " es: " + suma);
    }
}
