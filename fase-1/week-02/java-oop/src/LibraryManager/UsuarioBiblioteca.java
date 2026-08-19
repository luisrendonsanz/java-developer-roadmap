package LibraryManager;

public class UsuarioBiblioteca {
    private final String nombre;
    protected static int contadorIdUsuario =0;
    private int idUsuario;
    private Prestamo prestamo;

    public UsuarioBiblioteca(String nombre) {
        this.nombre = nombre;
        contadorIdUsuario++;
        this.idUsuario = contadorIdUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public static int getContadorIdUsuario() {
        return contadorIdUsuario;
    }

    public String getNombre() {
        return nombre;
    }
}
