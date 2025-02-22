package es.uah.matcomp.mp.e2.ejerciciosclases.e6;

import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {/**Test sobre la clase MyCircle*/

    /**Se comprueba que el valor del radio establecido es el correcto*/
    @Test
    void getRadius() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        assertEquals(5, circle.getRadius());
    }
    /**A través del setRadius establecemos un valor nuevo para el radio y debemos comprobra que el valor retornado
     * es el nuevo establecido*/
    @Test
    void setRadius() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        circle.setRadius(9);
        assertEquals(9, circle.getRadius());
    }
    /**Prueba que las coordenas del centro del circulo son las correctas*/
    @Test
    void getCenter() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        assertEquals(p1, circle.getCenter());
    }
    /**A través del setCentre establecemos unas coordenas nuevas para el centro y debemos comprobar que las coordenas retornadas
     * son las establecidas*/
    @Test
    void setCenter() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        MyPoint p2 = new MyPoint(5,8);
        circle.setCenter(p2);
        assertEquals(p2, circle.getCenter());
    }
    /**Se comprueba que la X de la coordenada del centro del circulo sea la correcta*/
    @Test
    void getCenterX() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        assertEquals(p1.getX(), circle.getCenterX());
    }
    /**A través del setCenterX se modifica la X de la coordenada y se comprueba que sea la correcta*/
    @Test
    void setCenterX() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        p1.setX(6);
        assertEquals(p1.getX(), circle.getCenterX());
    }
    /**Se comprueba que la Y de la coordenada del centro del circulo sea la correcta*/
    @Test
    void getCenterY() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        assertEquals(p1.getY(), circle.getCenterY());
    }
    /**A través del setCenterY se modifica la Y de la coordenada y se comprueba que sea la correcta*/
    @Test
    void setCenterY() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        p1.setY(6);
        assertEquals(p1.getY(), circle.getCenterY());
    }
   /**Se comprueba que la coordenada del centro (x,y) sea la correcta*/
    @Test
    void getCenterXY() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        assertEquals(p1.getXY(), circle.getCenterXY());
    }
    /**A traves del setCenterXY se modifica la coordenada del centro del circulo y se comprueba que sea correcta*/
    @Test
    void setCenterXY() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        p1.setX(10);
        p1.setY(10);
        assertEquals(p1.getXY(), circle.getCenterXY());
    }
    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos del circulo*/
    @Test
    void testToString() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        assertEquals("MyCircle{radius=5, center=(3,4)}", circle.toString());
    }
    /**Se comprueba que el valor retornado del area del circulo sea correcto*/
    @Test
    void getArea() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        assertEquals( 78.53, circle.getArea());
    }
    /**Se comprueba que el valor retornado de la circunferencia del circulo sea correcto*/
    @Test
    void getCircumference() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        assertEquals( 31.42, circle.getCircumference());
    }
    /**Se comprueba que la distancia entre los centros de dos circulos sea correcta*/
    @Test
    void distance() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle circle = new MyCircle(p1, 5);
        MyPoint p2 = new MyPoint(5,8);
        MyCircle circle2 = new MyCircle(p2, 9);
        assertEquals(2, circle.distance(circle2));
    }
}