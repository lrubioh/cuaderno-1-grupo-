package es.uah.matcomp.mp.e3.ejerciciosclases.e6;

/**
 * Clase que introduce un perro con extensión del mamífero
 */
public class Dog extends Mammal{

    /**
     * Constructor con el nombre del perro
     */
    public Dog(String name){
        super(name);
    }

    /**
     * Método greets()
     */
    public void greets(){
        System.out.println("Woof");
    }

    /**
     * Método greets sobrecargado()
     */
    public void greets(Dog another){
        System.out.println("Woooof");
    }

    /**
     * Clase que representa el perro
     */
    @Override
    public String toString(){
        return "Dog[" + super.toString() + "]";
    }
}
