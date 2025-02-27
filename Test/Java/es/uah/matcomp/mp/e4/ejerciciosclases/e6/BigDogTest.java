package es.uah.matcomp.mp.e4.ejerciciosclases.e6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

//Clase de prueba para la clase BigDog.
class BigDogTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testBigDogGreets() {
        BigDog bigDog = new BigDog("Max");
        bigDog.greets();
        assertEquals("Wooow\n", outContent.toString());
    }

    @Test
    void testBigDogGreetsDog() {
        BigDog bigDog = new BigDog("Max");
        Dog dog = new Dog("Rex");
        bigDog.greets(dog);
        assertEquals("Wooooow\n", outContent.toString());
    }

    @Test
    void testBigDogGreetsBigDog() {
        BigDog bigDog1 = new BigDog("Max");
        BigDog bigDog2 = new BigDog("Bruno");
        bigDog1.greets(bigDog2);
        assertEquals("Woooooooow\n", outContent.toString());
    }
}