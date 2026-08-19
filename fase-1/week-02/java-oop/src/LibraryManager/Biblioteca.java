package LibraryManager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        var biblioteca = new Biblioteca();
        biblioteca.menu();
    }
    private final Scanner in = new Scanner(System.in);
    private final List<Libro> libros;
    private final List<UsuarioBiblioteca> usuarioBiblioteca;
    private final List<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarioBiblioteca = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void menu() {
        System.out.println("MENU DE OPCIONES");
        int opc = 11;
        do {
            System.out.println("Ingresa una opcion: "
                    + "\n1-Registrar libro"
                    + "\n2-Registrar usuarios"
                    + "\n3-Listar libro"
                    + "\n4-Buscar libro (isbn)"
                    + "\n5-Buscar libro (titulo)"
                    + "\n6-Prestar libro"
                    + "\n7-Devolver un libro"
                    + "\n8-Mostrar libros disponibles"
                    + "\n9-Mostrar libros prestados"
                    + "\n10-Salir");

            try {
                opc = in.nextInt();
                in.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un numero para entrar a una opcion del menu");
                in.nextLine();
                continue;
            }
            switch (opc) {
                case 1 -> registrarLibro();
                case 2 -> registrarUsuario();
                case 3 -> listarLibros();
                case 4 -> buscarPorIsbn();
                case 5 -> buscarPorTitulo();
                case 6 -> prestarLibro();
                case 7 -> devolverLibro();
                case 8 -> mostrarLibrosDisponibles();
                case 9 -> mostrarLibrosPrestados();
                case 10 -> System.out.println("bye");
                default -> System.out.println("Ingresa una opcion dentro del menu\nBye");
            }
        } while (opc != 10);
    }

    public void registrarLibro() {
        System.out.println("Ingresa el titulo del libro: ");
        String titulo = in.nextLine();
        System.out.println("Ingresa el isbn del libro");
        int isbn = in.nextInt();
        in.nextLine();
        System.out.println("Ingresa el nombre del autor");
        String nombreAutor = in.nextLine();
        libros.add(new Libro(titulo, isbn, new Autor(nombreAutor)));
    }

    public void registrarUsuario() {
        System.out.println("Ingresa el nombre del usuario: ");
        String nombreUsuario = in.nextLine();
        usuarioBiblioteca.add(new UsuarioBiblioteca(nombreUsuario));
    }

    public void listarLibros() {
        System.out.println("Libros->");
        for (Libro l : libros) {
            System.out.println("ISBN: " + l.getIsbn() + "\nTitulo: " + l.getTitulo() + "\nDisponible: " + l.isDisposible() + "\n");
        }
    }

    public void buscarPorIsbn() {
        try {
            boolean encontrado = false;
            System.out.println("Ingresa el isbn del libro que deseas buscar: ");
            int isbnBuscar = in.nextInt();
            in.nextLine();
            for (Libro l : libros) {
                if ((l.getIsbn() == isbnBuscar)) {
                    System.out.print("El libro que buscas es-> ");
                    System.out.println(l.getTitulo());
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) System.out.println("El libro que buscas no esta en nuestra BD");
        } catch (InputMismatchException e) {
            System.out.println("Error: debes ingresar un ISBN valido");
            in.nextLine();
        }
    }

    public void buscarPorTitulo() {
        boolean encontrado = false;
        System.out.println("Ingresa el titulo del libro que deseas buscar: ");
        String titulo = in.nextLine().trim();
        for (Libro libro : libros) {
            if (titulo.equalsIgnoreCase(libro.getTitulo())) {
                System.out.print("El libro que buscas es-> ");
                System.out.println(libro);
                return;
            }
        }
        System.out.println("El libro que buscas no esta en nuestra BD");
    }

    public void prestarLibro() {
        try {

            for (Libro libro : libros) {
                System.out.println(
                        "ISBN: " + libro.getIsbn() + " -> " + libro.getTitulo()
                                + " Disponible: " + libro.isDisposible()
                );
            }

            System.out.println("Ingresa el ISBN del libro que deseas prestar:");
            int isbnPrestar = in.nextInt();
            in.nextLine();

            Libro libroSeleccionado = null;

            for (Libro libro : libros) {
                if (libro.getIsbn() == isbnPrestar) {
                    libroSeleccionado = libro;
                    break;
                }
            }

            if (libroSeleccionado == null) {
                System.out.println("El libro no existe.");
                return;
            }

            if (!libroSeleccionado.isDisposible()) {
                System.out.println("El libro ya está prestado.");
                return;
            }
            for (UsuarioBiblioteca usuario : usuarioBiblioteca) {
                System.out.println(
                        "ID: " + usuario.getIdUsuario() + " -> " + usuario.getNombre()
                );
            }
            System.out.println("Ingresa el ID del usuario:");
            int idUsuarioPrestamo = in.nextInt();
            in.nextLine();
            boolean usuarioEncontrado = false;
            for (UsuarioBiblioteca usuario : usuarioBiblioteca) {
                if (usuario.getIdUsuario() == idUsuarioPrestamo) {
                    usuarioEncontrado = true;
                    break;
                }
            }
            if (!usuarioEncontrado) {
                System.out.println("El usuario no existe.");
                return;
            }
            libroSeleccionado.setDisposible(false);
            prestamos.add(new Prestamo(isbnPrestar, idUsuarioPrestamo));
            System.out.println("Libro prestado correctamente.");
        } catch (InputMismatchException e) {
            System.out.println("Error: debes ingresar números válidos.");
            in.nextLine();
        }
    }

    public void devolverLibro() {
        Libro libroDevuelto = null;
        System.out.println("Ingresa el ISBN del libro que deseas devolver");
        int devolverIsbn = in.nextInt();
        in.nextLine();
        for (Libro libro : libros) {
            if (libro.getIsbn() == devolverIsbn && !libro.isDisposible()) {
                libroDevuelto = libro;
                break;
            }
        }
        if (libroDevuelto == null) {
            System.out.println("El libro no existe o no se encuentra prestado");
            return;
        }
        Prestamo prestamoEncotrado = null;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getIsbnPrestamo() == devolverIsbn) {
                prestamoEncotrado = prestamo;
                break;
            }
        }
        if (prestamoEncotrado != null) {
            prestamos.remove(prestamoEncotrado);
            libroDevuelto.setDisposible(true);
        }

    }

    public void mostrarLibrosDisponibles() {
        for (Libro libro : libros) {
            if (libro.isDisposible()) {
                System.out.println(libro.toString());
            }

        }
    }

    public void mostrarLibrosPrestados() {
        for (Libro libro : libros) {
            if (!libro.isDisposible()) {
                System.out.println(libro.toString());
            }
        }
    }
}