package es.uah.matcomp.mp.e3.ejerciciosclases.e4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    // Prueba para el método getXSpeed
    @Test
    void getXSpeed() {
        // Inicializamos el objeto MovablePoint con coordenadas (3.5f, 5.5f) y velocidades (1.0f, 1.5f)
        MovablePoint mp = new MovablePoint(3.5f, 5.5f, 1.0f, 1.5f);

        // Verificamos que la velocidad en X sea la esperada, que es 1.0f
        assertEquals(1.0f, mp.getXSpeed(), "La velocidad en X debería ser 1.0f");
    }

    // Prueba para el método setXSpeed
    @Test
    void setXSpeed() {
        // Inicializamos el objeto MovablePoint con coordenadas (3.5f, 5.5f) y velocidades (1.0f, 1.5f)
        MovablePoint mp = new MovablePoint(3.5f, 5.5f, 1.0f, 1.5f);

        // Cambiamos la velocidad en X a 2.0f
        mp.setXSpeed(2.0f);

        // Verificamos que la nueva velocidad en X sea 2.0f
        assertEquals(2.0f, mp.getXSpeed(), "La velocidad en X debería ser 2.0f");
    }

    // Prueba para el método getYSpeed
    @Test
    void getYSpeed() {
        // Inicializamos el objeto MovablePoint con coordenadas (3.5f, 5.5f) y velocidades (1.0f, 1.5f)
        MovablePoint mp = new MovablePoint(3.5f, 5.5f, 1.0f, 1.5f);

        // Verificamos que la velocidad en Y sea la esperada, que es 1.5f
        assertEquals(1.5f, mp.getYSpeed(), "La velocidad en Y debería ser 1.5f");
    }

    // Prueba para el método setYSpeed
    @Test
    void setYSpeed() {
        // Inicializamos el objeto MovablePoint con coordenadas (3.5f, 5.5f) y velocidades (1.0f, 1.5f)
        MovablePoint mp = new MovablePoint(3.5f, 5.5f, 1.0f, 1.5f);

        // Cambiamos la velocidad en Y a 2.5f
        mp.setYSpeed(2.5f);

        // Verificamos que la nueva velocidad en Y sea 2.5f
        assertEquals(2.5f, mp.getYSpeed(), "La velocidad en Y debería ser 2.5f");
    }

    // Prueba para el método setSpeed
    @Test
    void setSpeed() {
        // Inicializamos el objeto MovablePoint con coordenadas (3.5f, 5.5f) y velocidades (1.0f, 1.5f)
        MovablePoint mp = new MovablePoint(3.5f, 5.5f, 1.0f, 1.5f);

        // Cambiamos simultáneamente las velocidades en X y Y
        mp.setSpeed(2.5f, 3.5f);

        // Verificamos que la nueva velocidad en X sea 2.5f
        assertEquals(2.5f, mp.getXSpeed(), "La velocidad en X debería ser 2.5f");

        // Verificamos que la nueva velocidad en Y sea 3.5f
        assertEquals(3.5f, mp.getYSpeed(), "La velocidad en Y debería ser 3.5f");
    }

    // Prueba para el método getSpeed
    @Test
    void getSpeed() {
        // Inicializamos el objeto MovablePoint con coordenadas (3.5f, 5.5f) y velocidades (1.0f, 1.5f)
        MovablePoint mp = new MovablePoint(3.5f, 5.5f, 1.0f, 1.5f);

        // Obtenemos las velocidades en X y Y
        float[] speed = mp.getSpeed();

        // Verificamos que la velocidad en X sea 1.0f
        assertEquals(1.0f, speed[0], "La velocidad en X debería ser 1.0f");

        // Verificamos que la velocidad en Y sea 1.5f
        assertEquals(1.5f, speed[1], "La velocidad en Y debería ser 1.5f");
    }

    // Prueba para el método move
    @Test
    void move() {
        // Inicializamos el objeto MovablePoint con coordenadas (3.5f, 5.5f) y velocidades (1.0f, 1.5f)
        MovablePoint mp = new MovablePoint(3.5f, 5.5f, 1.0f, 1.5f);

        // Movemos el punto utilizando el método move
        mp.move();

        // Verificamos que la nueva posición en X sea 4.5f (3.5f + 1.0f)
        assertEquals(4.5f, mp.getX(), "La nueva posición en X debería ser 4.5f");

        // Verificamos que la nueva posición en Y sea 7.0f (5.5f + 1.5f)
        assertEquals(7.0f, mp.getY(), "La nueva posición en Y debería ser 7.0f");
    }

    // Prueba para el método toString
    @Test
    void testToString() {
        // Inicializamos el objeto MovablePoint con coordenadas (3.5f, 5.5f) y velocidades (1.0f, 1.5f)
        MovablePoint mp = new MovablePoint(3.5f, 5.5f, 1.0f, 1.5f);

        // Definimos la representación en cadena esperada
        String expected = "(3.5, 5.5), speed=(1.0, 1.5)";

        // Verificamos que el método toString devuelva la cadena esperada
        assertEquals(expected, mp.toString(), "La representación en cadena debería ser (3.5, 5.5), speed=(1.0, 1.5)");
    }
}