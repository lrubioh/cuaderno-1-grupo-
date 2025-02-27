package es.uah.matcomp.mp.e4.ejerciciosclases.e3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Clase de prueba para MovablePoint.
//Se prueban los movimientos y la representación en cadena del objeto.
class MovablePointTest {

    //Prueba el constructor de MovablePoint.
    @Test
    void testConstructor() {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        assertEquals("(0,0), speed=(2,3)", point.toString());
    }

    //Prueba el metodo moveUp().
    @Test
    void testMoveUp() {
        MovablePoint point = new MovablePoint(5, 5, 2, 3);
        point.moveUp();
        assertEquals("(5,2), speed=(2,3)", point.toString());
    }

    //Prueba el metodo moveDown().
    @Test
    void testMoveDown() {
        MovablePoint point = new MovablePoint(1, 1, 1, 2);
        point.moveDown();
        assertEquals("(1,3), speed=(1,2)", point.toString());
    }

    //Prueba el metodo moveLeft().
    @Test
    void testMoveLeft() {
        MovablePoint point = new MovablePoint(4, 4, 3, 2);
        point.moveLeft();
        assertEquals("(1,4), speed=(3,2)", point.toString());
    }

    //Prueba el metodo moveRight().
    @Test
    void testMoveRight() {
        MovablePoint point = new MovablePoint(2, 2, 5, 1);
        point.moveRight();
        assertEquals("(7,2), speed=(5,1)", point.toString());
    }
}