package es.uah.matcomp.mp.e4.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Clase de prueba unitaria para la clase Circle.
public class CircleTest {

    //Prueba para verificar el cálculo del área del círculo.
    @Test
    public void testGetArea() {
        Circle circle = new Circle(5);
        assertEquals(78.53981633974483, circle.getArea(), 0.0001, "El área no es la esperada");
    }

    //Prueba para verificar el cálculo del perímetro del círculo.
    @Test
    public void testGetPerimeter() {
        Circle circle = new Circle(5);
        assertEquals(31.41592653589793, circle.getPerimeter(), 0.0001, "El perímetro no es el esperado");
    }

    //Prueba para verificar el metodo toString().
    @Test
    public void testToString() {
        Circle circle = new Circle(5);
        assertEquals("Circle[radius=5.0]", circle.toString(), "La representación en cadena no es la esperada");
    }
}