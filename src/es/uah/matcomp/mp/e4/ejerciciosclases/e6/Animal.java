package es.uah.matcomp.mp.e4.ejerciciosclases.e6;

//Clase abstracta que representa un Animal con un nombre y un metodo abstracto para saludar.
public abstract class Animal {
    /**ZONA DE ATRIBUTOS PROTEGIDOS**/
    protected String name;
    /**ZONA DE METODOS**/
    //Creo un constructor por defecto
    public Animal(String name) {
        this.name = name;
    }
    public abstract void greets();
}
