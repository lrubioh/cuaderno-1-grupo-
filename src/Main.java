import es.uah.matcomp.mp.e4.ejerciciosclases.e6.Animal;
import es.uah.matcomp.mp.e4.ejerciciosclases.e6.BigDog;
import es.uah.matcomp.mp.e4.ejerciciosclases.e6.Cat;
import es.uah.matcomp.mp.e4.ejerciciosclases.e6.Dog;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de animal
        Animal cat = new Cat("Whiskers");
        Animal dog = new Dog("Buddy");
        Dog anotherDog = new Dog("Rocky");
        BigDog bigDog = new BigDog("Thor");
        BigDog anotherBigDog = new BigDog("Hulk");

        // Prueba de saludos individuales
        System.out.println("Saludo de Cat:");
        cat.greets();

        System.out.println("\nSaludo de Dog:");
        dog.greets();

        System.out.println("\nSaludo de BigDog:");
        bigDog.greets();

        // Prueba de saludos entre perros
        System.out.println("\nDog saludando a otro Dog:");
        ((Dog) dog).greets(anotherDog);

        System.out.println("\nBigDog saludando a un Dog:");
        bigDog.greets(anotherDog);

        System.out.println("\nBigDog saludando a otro BigDog:");
        bigDog.greets(anotherBigDog);
    }
}
