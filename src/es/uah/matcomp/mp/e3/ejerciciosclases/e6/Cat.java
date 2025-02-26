package es.uah.matcomp.mp.e3.ejerciciosclases.e6;

/**
 * Clase que introduce un gato con extensión del mamífero
 */
public class Cat extends Mammal{

    /**
     * Constructor con el nombre del gato
     */
    public Cat(String name){
        super(name);
    }

    /**
     * Devuelve el saludo del gato
     */
    public void greets(){
        System.out.println("Meow");
    }

    /**
     * Cadena que representa el gato
     */
    @Override
    public String toString(){
        return "Cat[" + super.toString() + "]";
    }
}
