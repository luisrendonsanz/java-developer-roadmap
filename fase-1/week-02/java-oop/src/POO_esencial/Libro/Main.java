package POO_esencial.Libro;

public class Main {
    public static void main(String[] args) {
        var libro1 = new Libro(1234,"Principito","Luis");
        System.out.println(libro1.isDisponible());
        libro1.prestar();
        System.out.println(libro1.isDisponible());
    }
}
