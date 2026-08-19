package LibraryManager;


public class Libro {
    private Autor autor;
    private String titulo;
    private int isbn;
    private boolean disposible = true;

    public Libro(String titulo, int isbn, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public void setDisposible(boolean disposible) {
        this.disposible = disposible;
    }

    public boolean isDisposible() {
        return disposible;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "autor: " + autor.toString() +
                " titulo: " + titulo
                + " isbn: " + isbn +
                ", disposible: " + disposible;
    }
}


/*
Crear clase Libro

Crear clase Autor

Crear clase UsuarioBiblioteca

Crear clase Prestamo

Crear una clase responsable del sistema, por ejemplo Biblioteca

Usar composición entre las clases donde corresponda*/
