package es.uah.matcomp.mp.e3.ejerciciosclases.e6;

/**
 * Clase que introduce un animal
 */
public class Animal {
    private String name;

    /**
     * Constructror con el nombre
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Cadena que representa al animal
     */
    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}

