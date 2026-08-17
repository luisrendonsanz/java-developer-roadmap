package POO_esencial.Persona;

public class Persona {
    private String nombre;
    private int edad;
    private String email;

    public Persona(String nombre, int edad, String email) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (edad < 0 || edad > 110) {
            throw new IllegalArgumentException("La edad debe estar entre 0 y 110");
        }
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("El email no es válido");
        }
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre+
                "\nEdad: "+edad+
                "\nEmail: "+email);
    }
}
