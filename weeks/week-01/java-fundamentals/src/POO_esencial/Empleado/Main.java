package POO_esencial.Empleado;

public class Main {
    public static void main(String[] args) {
        var empleado1 = new Empleado("Luis",2000,"dev");
        empleado1.aumento(20);
        empleado1.mostrarInfo();
    }
}
