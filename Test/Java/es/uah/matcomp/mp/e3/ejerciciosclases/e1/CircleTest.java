package es.uah.matcomp.mp.e3.ejerciciosclases.e1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    // Prueba para el método getRadius
    @Test
    void getRadius() {
        // Se crea un objeto Circle con un radio de 5.0
        Circle circle = new Circle(5.0);

        // Se verifica que el método getRadius devuelva el valor esperado (5.0)
        // El valor tolerado para la comparación es 0.001
        assertEquals(5.0, circle.getRadius(), 0.001);
    }

    // Prueba para el método setRadius
    @Test
    void setRadius() {
        // Se crea un objeto Circle con un radio inicial de 5.0
        Circle circle = new Circle(5.0);

        // Se cambia el radio a 10.0 utilizando el método setRadius
        circle.setRadius(10.0);

        // Se verifica que el radio haya sido actualizado correctamente a 10.0
        // El valor tolerado para la comparación es 0.001
        assertEquals(10.0, circle.getRadius(), 0.001);
    }

    // Prueba para el método getColor
    @Test
    void getColor() {
        // Se crea un objeto Circle con un radio de 5.0 y color "rojo"
        Circle circle = new Circle(5.0, "red");

        // Se verifica que el método getColor devuelva el color correcto ("red")
        assertEquals("red", circle.getColor());
    }

    // Prueba para el método setColor
    @Test
    void setColor() {
        // Se crea un objeto Circle con un radio de 5.0 y color "rojo"
        Circle circle = new Circle(5.0, "red");

        // Se cambia el color a "azul" utilizando el método setColor
        circle.setColor("blue");

        // Se verifica que el color haya sido actualizado correctamente a "blue"
        assertEquals("blue", circle.getColor());
    }

    // Prueba para el método getArea
    @Test
    void getArea() {
        // Se crea un objeto Circle con un radio de 5.0
        Circle circle = new Circle(5.0);

        // Se verifica que el área calculada sea igual al valor esperado:
        // Área = π * radio^2, en este caso π * 5.0^2
        // El valor tolerado para la comparación es 0.001
        assertEquals(Math.PI * 5.0 * 5.0, circle.getArea(), 0.001);
    }

    // Prueba para el método toString
    @Test
    void testToString() {
        // Se crea un objeto Circle con un radio de 5.0 y color "rojo"
        Circle circle = new Circle(5.0, "red");

        // Se verifica que el método toString devuelva la cadena esperada
        // El formato esperado es "Circle{radius=5.0, color=red}"
        assertEquals("Circle{radius=5.0, color=red}", circle.toString());
    }
}
