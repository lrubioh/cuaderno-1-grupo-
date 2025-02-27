package es.uah.matcomp.mp.e4.ejerciciosclases.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {
    //Configura un objeto MovableCircle antes de cada prueba.
    @Test
    void testInitialization() {
        MovableCircle circle = new MovableCircle(5, 10, 2, 3, 7);
        assertEquals("(5,10),speed=(2,3)", circle.toString().split(", radius=")[0].substring(15)); // Extrae el centro
        assertEquals(7, Integer.parseInt(circle.toString().split("radius=")[1].replace("]", ""))); // Extrae el radio
    }
    //Prueba el movimiento hacia arriba del círculo.
    @Test
    void moveUp() {
        MovableCircle circle = new MovableCircle(0, 0, 1, 2, 5);
        circle.moveUp();
        assertEquals("(0,-2),speed=(1,2)", circle.toString().split(", radius=")[0].substring(15));
    }
    //Prueba el movimiento hacia abajo del círculo.
    @Test
    void moveDown() {
        MovableCircle circle = new MovableCircle(0, 0, 1, 2, 5);
        circle.moveDown();
        assertEquals("(0,2),speed=(1,2)", circle.toString().split(", radius=")[0].substring(15));
    }
    //Prueba el movimiento hacia la izquierda del círculo.
    @Test
    void moveLeft() {
        MovableCircle circle = new MovableCircle(0, 0, 1, 2, 5);
        circle.moveLeft();
        assertEquals("(-1,0),speed=(1,2)", circle.toString().split(", radius=")[0].substring(15));
    }
    //Prueba el movimiento hacia la derecha del círculo.
    @Test
    void moveRight() {
        MovableCircle circle = new MovableCircle(0, 0, 1, 2, 5);
        circle.moveRight();
        assertEquals("(1,0),speed=(1,2)", circle.toString().split(", radius=")[0].substring(15));
    }

    @Test
    void testToString() {
        MovableCircle circle = new MovableCircle(3, 4, 1, 1, 8);
        assertEquals("MovableCircle[=(3,4),speed=(1,1), radius=8]", circle.toString());
    }
}