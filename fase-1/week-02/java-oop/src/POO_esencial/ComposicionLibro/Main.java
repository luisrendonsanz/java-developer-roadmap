package POO_esencial.ComposicionLibro;

public class Main {
    public static void main(String[] args) {
        var libro1 = new Libro(1234, "Principito", true, new Autor("Luis"));
        System.out.println(libro1.toString());
    }
}
