package POO_esencial.ComposicionLibro;

public class Libro {
    private int isbn;
    private String titulo;
    private boolean disponible = true;
    private Autor autor;

    public Libro(int isbn, String titulo, boolean disponible, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.disponible = disponible;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    @Override
    public String toString() {
        return "isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                ", disponible=" + disponible +
                ", autor=" + autor.toString();
    }
}
