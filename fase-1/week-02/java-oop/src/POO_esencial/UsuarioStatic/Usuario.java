package POO_esencial.UsuarioStatic;

public class Usuario {
    private static int numUsuarios=0;

    public Usuario() {
        numUsuarios++;
    }

    public static int getNumUsuarios() {
        return numUsuarios;
    }
}
