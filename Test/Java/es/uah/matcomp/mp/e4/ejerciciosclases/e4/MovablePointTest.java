package es.uah.matcomp.mp.e4.ejerciciosclases.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Pruebas unitarias para la clase MovablePoint.
class MovablePointTest {
    //Prueba la correcta inicialización del objeto MovablePoint.
    @Test
    void testInitialization() {
        MovablePoint point = new MovablePoint(5, 10, 2, 3);
        assertEquals("(5,10),speed=(2,3)", point.toString());
    }
    //Prueba el metodo moveUp().
    @Test
    void moveUp() {
        MovablePoint point = new MovablePoint(0, 0, 1, 2);
        point.moveUp();
        assertEquals("(0,-2),speed=(1,2)", point.toString());
    }
    //Prueba el metodo moveDown().
    @Test
    void moveDown() {
        MovablePoint point = new MovablePoint(0, 0, 1, 2);
        point.moveDown();
        assertEquals("(0,2),speed=(1,2)", point.toString());
    }
    //Prueba el metodo moveLeft().
    @Test
    void moveLeft() {
        MovablePoint point = new MovablePoint(0, 0, 1, 2);
        point.moveLeft();
        assertEquals("(-1,0),speed=(1,2)", point.toString());
    }
    //Prueba el metodo moveRight().
    @Test
    void moveRight() {
        MovablePoint point = new MovablePoint(0, 0, 1, 2);
        point.moveRight();
        assertEquals("(1,0),speed=(1,2)", point.toString());
    }
    //Prueba la representación en cadena del objeto MovablePoint.
    @Test
    void testToString() {
        MovablePoint point = new MovablePoint(3, 4, 1, 1);
        assertEquals("(3,4),speed=(1,1)", point.toString());
    }
}