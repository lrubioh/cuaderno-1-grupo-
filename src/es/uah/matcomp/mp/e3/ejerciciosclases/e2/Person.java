package es.uah.matcomp.mp.e3.ejerciciosclases.e2;

/**
 * Clase que representa a un persona con nombre y dirección
 */
public class Person {
    private String name;
    private String address;

    /**
     * Constructor para inicializar una persona con nombre y dirreción
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Devuelve el nombre de la persona
     */
    public String getName() {
        return name;
    }

    /**
     * Devuelve la dirección de la persona
     */
    public String getAddress() {
        return address;
    }

    /**
     * Establece una nueva dirección de la persona
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Devuelve una representación en cadena de la persona en formato "Person[name=?,address=?]"
     */
    @Override
    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }

}
