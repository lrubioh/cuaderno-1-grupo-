package es.uah.matcomp.mp.e3.ejerciciosclases.e6;

/***
 * Clase que introduce a los mamíferos con extensión del animal
 */
public class Mammal extends Animal {

    /**
     * Constructor con el nombre
     */
    public Mammal(String name){
        super(name);
    }

    public String toString(){
        return "Mammal[" + super.toString() + "]";
    }
}
