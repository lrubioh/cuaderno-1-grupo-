package es.uah.matcomp.mp.e2.ejerciciosclases.e5;

import es.uah.matcomp.mp.e2.ejerciciosclases.e4.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {/**Test para probar la clase MyLine*/
    /**Prueba que el punto inicial de la linea a establecer sea el correcto*/
    @Test
    void getBegin() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        assertEquals(begin, line.getBegin());
    }
    /**Se establece un nuevo punto de inicio a traves del setBegin y se prueba que el punto inicial de
     * la linea a establecer sea el establecido con el setBegin*/
    @Test
    void setBegin() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        MyPoint newBegin = new MyPoint(3, 4);
        line.setBegin(newBegin);
        assertEquals(newBegin, line.getBegin());
    }
    /**Prueba que el punto final de la linea a establecer sea el correcto*/
    @Test
    void getEnd() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        assertEquals(end, line.getEnd());
    }
    /**Se establece un nuevo punto de fin a traves del setEnd y se prueba que el punto final de
     * la linea a establecer sea el establecido con el setEnd*/
    @Test
    void setEnd() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        MyPoint newEnd = new MyPoint(7, 8);
        line.setEnd(newEnd);
        assertEquals(newEnd, line.getEnd());
    }
    /**Se comprueba que la X de la coordenada del inicio de la línea y se devuelve correctamente*/
    @Test
    void getBeginX() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        assertEquals(begin.getX(), line.getBeginX());

    }
    /**Se modifica la X de la coordenada del inicio de la línea y se quiere comprobar si el
     * resultado devuelto es el correcto*/
    @Test
    void setBeginX() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        begin.setX(20);
        assertEquals(20, line.getBeginX());
    }
    /**Se comprueba que la Y de la coordenada del inicio de la línea y se devuelve correctamente*/
    @Test
    void getBeginY() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        assertEquals(begin.getY(), line.getBeginY());
    }
    /**Se modifica la Y de la coordenada del inicio de la línea y se quiere comprobar si el
     * resultado devuelto es el correcto*/
    @Test
    void setBeginY() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        begin.setY(10);
        assertEquals(10, line.getBeginY());
    }
    /**Se comprueba que la X de la coordenada del final de la línea y se devuelve correctamente*/
    @Test
    void getEndX() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        assertEquals(end.getX(), line.getEndX());
    }
    /**Se modifica la X de la coordenada del final de la línea y se quiere comprobar si el
     * resultado devuelto es el correcto*/
    @Test
    void setEndX() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        end.setX(0);
        assertEquals(end.getX(), line.getEndX());
    }
    /**Se comprueba que la Y de la coordenada del final de la línea y se devuelve correctamente*/
    @Test
    void getEndY() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        assertEquals(end.getY(), line.getEndY());
    }
    /**Se modifica la Y de la coordenada del final de la línea y se quiere comprobar si el
     * resultado devuelto es el correcto*/
    @Test
    void setEndY() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        end.setY(16);
    }

    /**Se comprueba que la longitud que mide la linea es la correcta*/
    @Test
    void getLength() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        assertEquals(4.47213595499958, line.getLength());
    }
    /**Se comprueba el angulo que forma la línea con el eje de coordenadas y cuyo valor a retornar sea correcto*/
    @Test
    void getGradient() {
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(0, 0);
        MyLine line = new MyLine(begin, end);
        assertEquals((0), line.getGradient());
    }
    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos de la línea*/
    @Test
    void testToString() {
        MyPoint begin = new MyPoint(1, 5);
        MyPoint end = new MyPoint(3, 9);
        MyLine line = new MyLine(begin, end);
        assertEquals("MyLine{begin=(1, 5), end=(3, 9)]", line.toString());
    }
}