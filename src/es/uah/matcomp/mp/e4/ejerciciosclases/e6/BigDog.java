package es.uah.matcomp.mp.e4.ejerciciosclases.e6;

//Clase que representa un perro grande y sobrescribe los métodos de saludo.
public class BigDog extends Dog {
    /**ZONA DE METODOS**/
    //Creo un constructor por defecto
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Wooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Woooooooow");
    }
}
