package es.uah.matcomp.mp.e2.ejerciciosclases.e7;

import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {/**Test para comprobar la clase MyTriangle*/
    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos del triangulo*/
    @Test
    void testToString() {
        MyPoint p1 = new MyPoint(1, 5);
        MyPoint p2 = new MyPoint(2, 3);
        MyPoint p3 = new MyPoint(4, 9);
        MyTriangle t = new MyTriangle(p1, p2, p3);
        assertEquals("MyTriangle{v1={1, 5}, v2={2, 3}, v3={4, 9}}", t.toString());
    }
    /**Se comprueba que el perimetro obtenido es el correcto*/
    @Test
    void getPerimeter() {
        MyPoint p1 = new MyPoint(1, 5);
        MyPoint p2 = new MyPoint(2, 3);
        MyPoint p3 = new MyPoint(4, 9);
        MyTriangle t = new MyTriangle(p1, p2, p3);
        assertEquals(13.56062329783655, t.getPerimeter());
    }
    /**Se comprueba que dado un triangulo definido por 3 puntos que tipo de triangulo es*/
    @Test
    void getType() {
        MyPoint p1 = new MyPoint(1, 5);
        MyPoint p2 = new MyPoint(2, 3);
        MyPoint p3 = new MyPoint(4, 9);
        MyTriangle t = new MyTriangle(p1, p2, p3);
        assertEquals("El triangulo es escaleno", t.getType());
    }
}