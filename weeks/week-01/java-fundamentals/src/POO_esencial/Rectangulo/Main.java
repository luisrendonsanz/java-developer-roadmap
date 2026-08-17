package POO_esencial.Rectangulo;

public class Main {
    public static void main(String[] args) {

        var rectangulo1 = new Rectangulo(10,20);
        System.out.println("area del rectangulo: "+rectangulo1.calcularArea());
        System.out.println("perimetro del rectangulo: "+rectangulo1.calcularPerimetro());

        var rectangulo2 = new Rectangulo(9,2);
        System.out.println("area del rectangulo: "+rectangulo2.calcularArea());
        System.out.println("perimetro del rectangulo: "+rectangulo2.calcularPerimetro());

        var rectangulo3 = new Rectangulo(23,5);
        System.out.println("area del rectangulo: "+rectangulo3.calcularArea());
        System.out.println("perimetro del rectangulo: "+rectangulo3.calcularPerimetro());

    }
}
