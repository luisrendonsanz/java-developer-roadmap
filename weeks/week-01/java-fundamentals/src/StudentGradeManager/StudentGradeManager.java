package StudentGradeManager;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentGradeManager {
    static Scanner in = new Scanner(System.in);
    static private final double calificacionMax=100;
    static private final double calificacionMin=70;
    static ArrayList<Double> calificaciones = new ArrayList<Double>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opc;
        do {
            System.out.println("Ingresa una opcion");
            System.out.println("1- Registrar calificacion\n" +
                    "2- Mostrar todas las calificaciones\n" +
                    "3- Calcular promedio\n" +
                    "4- Mostrar calificacion maxima\n" +
                    "5- Mostrar calificacion minima\n" +
                    "6- Indicar cuantos alumnos aprobaron\n" +
                    "7- Salir del programa "
            );

            opc = in.nextInt();

            switch (opc) {
                case 1 -> registrarCalificacion();
                case 2 -> mostrarCalificaciones();
                case 3 -> calcularPromedio();
                case 4 -> System.out.println(calificacionMax);
                case 5 -> System.out.println(calificacionMin);
                case 6 -> alumnosAprobados();
                case 7 -> {

                    System.out.println("Bye");
                    opc = 7;
                }
                default -> System.out.println("Opcion no valida dentro de las opciones");
            }
        } while (opc != 7);
    }

    static public void registrarCalificacion() {
        System.out.println("Ingresa la calificacion que deseas agregar");
        double registrarCalificacion = in.nextDouble();
        calificaciones.add(registrarCalificacion);
    }

    static public void mostrarCalificaciones() {
        for (double cali : calificaciones) {
            System.out.println(cali);
        }
    }

    static public void calcularPromedio() {
        System.out.println("Ingresa cuantas materias son: ");
        int materias = in.nextInt();
        int i = 1;
        double suma = 0;
        while (i <= materias) {
            System.out.println("Ingresa calificacion de la materia " + i);
            suma += in.nextInt();
            i++;
        }
        double resultado = suma / materias;
        System.out.println("Tu calificacion final es de: " + resultado);
    }

    static public void alumnosAprobados() {
        int alumnoAprobado = 0;
        for (int i = 0; i <= calificaciones.size(); i++) {
            if (calificaciones.get(i) >= calificacionMin) {
                alumnoAprobado = i + 1;
            }
        }
        System.out.println("total de alumnos aprobados " + alumnoAprobado);
    }

}
