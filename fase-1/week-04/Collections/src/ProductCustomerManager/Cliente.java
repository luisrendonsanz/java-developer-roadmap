package ProductCustomerManager;

public class Cliente {
    private int id;
    private int edad;
    private String correo;
    private String nombre;

    public Cliente(String nombre, String correo, int edad) {
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("solo puedes agregar una edad en el rango de (1-120)");
        }
        this.edad = edad;
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("no puedes agregar un producto sin nombre");
        }
        this.nombre = nombre;
        if (correo.isEmpty()) {
            throw new IllegalArgumentException("no puedes agregar un correo en blanco");
        }
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }
}
