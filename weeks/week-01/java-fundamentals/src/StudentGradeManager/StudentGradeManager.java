package StudentGradeManager;

import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentGradeManager {
    static Scanner in = new Scanner(System.in);
    static private final double calificacionMax = 100;
    static private final double calificacionMin = 70;
    static ArrayList<Double> calificaciones = new ArrayList<Double>();

    public static void main(String[] args) {
        menu();
        in.close();
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
            try {
                opc = in.nextInt();
                in.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ingresa algun numero de las opciones del menu");
                in.nextLine();
                opc = 0;
            }
            switch (opc) {
                case 1 -> registrarCalificacion();
                case 2 -> mostrarCalificaciones();
                case 3 -> calcularPromedio();
                case 4 -> {
                    System.out.println("Calificacion maxima: " + calificacionMax);
                    continuar();
                }
                case 5 -> {
                    System.out.println("Calificacion minima aprobatoria: " + calificacionMin);
                    continuar();
                }
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
        try {
            System.out.println("Ingresa la calificacion que deseas agregar");
            double registrarCalificacion = in.nextDouble();
            in.nextLine();
            validarCalificacion(registrarCalificacion);
            calificaciones.add(registrarCalificacion);
            System.out.println("Calificacion registrada correctamente");
        } catch (InputMismatchException e) {
            System.out.print("Error: debes ingresar una calificacion numerica");
            in.nextLine();
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        continuar();
    }

    static public void mostrarCalificaciones() {
        int i = 1;
        if (calificaciones.isEmpty()) {
            System.out.println("no hay calificaciones registradas");
        } else {
            for (double cali : calificaciones) {
                System.out.println("calificacion " + i + ": " + cali);
                i++;
            }
        }
        continuar();
    }

    static public void calcularPromedio() {
        try {
            System.out.println("Ingresa cuantas materias son: ");
            int materias = in.nextInt();
            if(materias<=0){
                System.out.println("La cantidad de materias debe ser mayor a 0");
                continuar();
                return;
            }
            in.nextLine();
            int i = 1;
            double suma = 0;
            double calificacion;
            while (i <= materias) {
                System.out.println("Ingresa calificacion de la materia " + i);
                calificacion = in.nextDouble();
                in.nextLine();
                if (calificacion < 0 || calificacion > 100) {
                    System.out.println("no puedes agregar una calificacion fuera de rango min:0 max:100");
                } else {
                    suma += calificacion;
                }
                i++;
            }
            double resultado = suma / materias;
            System.out.println("Tu calificacion final es de: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("debes ingresar numero");
            in.nextLine();
        }
        continuar();
    }

    static public void alumnosAprobados() {
        int alumnoAprobado = 0;
        for (int i = 0; i < calificaciones.size(); i++) {
            if (calificaciones.get(i) >= calificacionMin) {
                alumnoAprobado++;
            }
        }
        System.out.println("total de alumnos aprobados " + alumnoAprobado);
        continuar();
    }

    static public double validarCalificacion(double calificacion) {
        if (calificacion > calificacionMax || calificacion < 0) {
            throw new IllegalArgumentException(
                    "La calificacion debe estar entre 0 y 100"
            );
        }
        return calificacion;
    }

    static public void continuar() {
        System.out.print("presiona enter para continuar");
        in.nextLine();
    }

}
