import es.uah.matcomp.mp.e3.ejerciciosclases.e6.Animal;
import es.uah.matcomp.mp.e3.ejerciciosclases.e6.Mammal;
import es.uah.matcomp.mp.e3.ejerciciosclases.e6.Cat;
import es.uah.matcomp.mp.e3.ejerciciosclases.e6.Dog ;

public class Main {
    public static void main(String[] args) {
        //Creación de objetos
        Animal animal = new Animal ("Generic Animal");
        Mammal mammal = new Mammal (" Generic Mammal");
        Cat cat = new Cat ("Luli");
        Dog dog1 = new Dog ("Buddy");
        Dog dog2 = new Dog ("Max");

        //Probando toString()
        System.out.println(animal.toString());
        System.out.println(mammal.toString());
        System.out.println(cat.toString());
        System.out.println(dog1.toString());

        //Probando greets()
        cat.greets();
        dog1.greets();
        dog1.greets(dog2);


    }
}
