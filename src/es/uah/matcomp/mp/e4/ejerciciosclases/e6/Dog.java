package es.uah.matcomp.mp.e4.ejerciciosclases.e6;

public class Dog extends Animal {
    /**ZONA DE METODOS**/
    //Creo un constructor por defecto
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}
