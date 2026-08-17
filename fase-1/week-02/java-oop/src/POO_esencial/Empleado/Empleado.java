package POO_esencial.Empleado;

public class Empleado {
    private String nombre;
    private double salario;
    private String puesto;

    public Empleado(String nombre, double salario, String puesto) {
        this.nombre = nombre;

        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
        this.salario = salario;
        this.puesto = puesto;
    }

    public void aumento(double porcentaje) {
        if (porcentaje < 0) {
            throw new IllegalArgumentException("El porcentaje no puede ser negativo");
        }
        salario = salario + (salario * porcentaje / 100);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Puesto: " + puesto);
    }

}
