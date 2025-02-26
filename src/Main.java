import es.uah.matcomp.mp.e3.ejerciciosclases.e8.Cylinder;
import es.uah.matcomp.mp.e3.ejerciciosclases.e8.Circle;

public class Main {
    public static void main(String[] args) {
        //Crear un objeto Circle con valores predeterminados
        Circle circulo = new Circle();
        System.out.println("Circulo por defecto: ");
        System.out.println("Radio: " + circulo.getRadius() );
        System.out.println("Color: " + circulo.getColor() );

        //Crear un objeto Cylinder con valores predeterminados
        Cylinder clilindro = new Cylinder();
        System.out.println("Cylinder por defecto: ");
        System.out.println("Altura: " + clilindro.getHeight() );

        //Calcular y mostrar el volumen del clilindro
        System.out.printf("Volumen del cilindro: "+clilindro.getVolume());
    }
}
