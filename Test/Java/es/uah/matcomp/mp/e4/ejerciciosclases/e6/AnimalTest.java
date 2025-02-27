package es.uah.matcomp.mp.e4.ejerciciosclases.e6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void greets() {
        // Crear instancias de los animales
        Cat cat = new Cat("Whiskers");
        Dog dog = new Dog("Buddy");
        Dog anotherDog = new Dog("Rocky");
        BigDog bigDog = new BigDog("Thor");
        BigDog anotherBigDog = new BigDog("Hulk");

        // Capturar la salida de consola
        assertDoesNotThrow(() -> cat.greets()); // Debería imprimir "Meow"
        assertDoesNotThrow(() -> dog.greets()); // Debería imprimir "Woof"
        assertDoesNotThrow(() -> dog.greets(anotherDog)); // Debería imprimir "Woooof"
        assertDoesNotThrow(() -> bigDog.greets()); // Debería imprimir "Wooow"
        assertDoesNotThrow(() -> bigDog.greets(dog)); // Debería imprimir "Wooooow"
        assertDoesNotThrow(() -> bigDog.greets(anotherBigDog)); // Debería imprimir "Woooooooow"
    }
}