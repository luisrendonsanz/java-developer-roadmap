package POO_esencial.UsuarioStatic;

public class Main {
    public static void main(String[] args) {
        var usuario1 = new Usuario();
        var usuario2 = new Usuario();
        var usuario3 = new Usuario();
        System.out.println("Numero total de objetos creados: "+Usuario.getNumUsuarios());
    }
}
