package POO_esencial.ComposicionLibro;

public class Autor {
    private String nombre;

    public Autor(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return
                nombre + '\'';
    }
}
