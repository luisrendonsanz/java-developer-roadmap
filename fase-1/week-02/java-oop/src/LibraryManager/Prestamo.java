package LibraryManager;

public class Prestamo {
    private int isbnPrestamo;
    private int idUsuarioPrestamo;

    public Prestamo(int isbnPrestampo, int idUsuarioPrestamo) {
        this.isbnPrestamo = isbnPrestampo;
        this.idUsuarioPrestamo = idUsuarioPrestamo;
    }

    public int getIsbnPrestamo() {
        return isbnPrestamo;
    }

    public int getIdUsuarioPrestamo() {
        return idUsuarioPrestamo;
    }
}
