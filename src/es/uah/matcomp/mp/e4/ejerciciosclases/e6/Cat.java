package es.uah.matcomp.mp.e4.ejerciciosclases.e6;

//Clase que representa un gato y sobrescribe el metodo de saludo.
public class Cat extends Animal {
    /**
     * ZONA DE METODOS
     **/
    //Creo un constructor por defecto
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
