package es.uah.matcomp.mp.e2.ejerciciosclases.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {/**Test de la clase MyPoint*/

    /**Prueba que en la coordenada establecida como punto, el X es el correcto*/
    @Test
    void getX() {
        MyPoint myPoint = new MyPoint(4,5);
        assertEquals(4,myPoint.getX());
    }
    /**Prueba que en la coordenada establecida como punto, si cambiamos la X mediante el setX el valor retornado
     * es el correcto*/
    @Test
    void setX() {
        MyPoint myPoint1 = new MyPoint(4,5);
        myPoint1.setX(5);
        assertEquals(5,myPoint1.getX());
    }
    /**Prueba que en la coordenada establecida como punto, el Y es el correcto*/
    @Test
    void getY() {
        MyPoint myPoint1 = new MyPoint(4,5);
        assertEquals(5,myPoint1.getY());
    }
    /**Prueba que en la coordenada establecida como punto, si cambiamos la Y mediante el setX el valor retornado
     * es el correcto*/
    @Test
    void setY() {
        MyPoint myPoint1 = new MyPoint(4,5);
        myPoint1.setY(7);
        assertEquals(7,myPoint1.getY());
    }
    /**Probamos que la coordenada que retorna es la misma establecida con el punto (x,y) de MyPoint*/
    @Test
    void getXY() {
        MyPoint myPoint1 = new MyPoint(4,5);
        assertEquals(4,myPoint1.getX());
        assertEquals(5,myPoint1.getY());
    }
    /**Establezco un nuevo punto de coordenadas (x,y) a traves del setXY y compruebo que el valor que retorna es el
     * correcto*/
    @Test
    void setXY() {
        MyPoint myPoint1 = new MyPoint(4,5);
        myPoint1.setX(7);
        myPoint1.setY(7);
        assertEquals(7,myPoint1.getX());
        assertEquals(7,myPoint1.getY());
    }
    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos del punto*/
    @Test
    void testToString() {
        MyPoint myPoint1 = new MyPoint(4,5);
        assertEquals(myPoint1.toString(),"{4, 5}");
    }
    /**Comprueba que las distancias entre los puntos sean las correctas y establecidas*/
    @Test
    void distance() {
        MyPoint myPoint1 = new MyPoint(1,5);
        MyPoint myPoint2 = new MyPoint(1,0);
        assertEquals(myPoint1.distance(myPoint2),5.0);
    }
    @Test
    void testDistance() {
        MyPoint myPoint1 = new MyPoint(1,5);
        MyPoint myPoint2 = new MyPoint(1,0);
        assertEquals(myPoint1.distance(myPoint2),5.0);
    }
    @Test
    void testDistance1() {
        MyPoint myPoint1 = new MyPoint(1,5);
        MyPoint myPoint2 = new MyPoint(0,0);
        assertEquals(myPoint1.distance(myPoint2),5.0990195135927845);
    }
}