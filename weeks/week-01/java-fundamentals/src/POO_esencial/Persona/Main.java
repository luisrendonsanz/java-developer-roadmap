package POO_esencial.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("persona 1");
        Persona persona1 = new Persona("Luis",23,"l@gmail.com");
        persona1.mostrarInformacion();
        System.out.println("persona 2");
        var persona2 = new Persona("Itzel",20,"i@gmail.com");
        persona2.mostrarInformacion();
        System.out.println("persona 3");
        var persona3 = new Persona("Nyla",2,"nyla@gmail.com");
        persona3.mostrarInformacion();


    }
}
