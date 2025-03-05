package es.uah.matcomp.mp.e3.ejerciciosclases.e7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {

    // Prueba para el método getBegin
    @Test
    void getBegin() {
        // Inicializamos un objeto LineSub con los puntos de inicio (1, 2) y fin (3, 4)
        LineSub line = new LineSub(1, 2, 3, 4);

        // Obtenemos el punto de inicio
        Point begin = line.getBegin();

        // Verificamos que las coordenadas del punto de inicio sean las esperadas (1, 2)
        assertEquals(1, begin.getX());
        assertEquals(2, begin.getY());
    }

    // Prueba para el método getEnd
    @Test
    void getEnd() {
        // Inicializamos un objeto LineSub con los puntos de inicio (1, 2) y fin (3, 4)
        LineSub line = new LineSub(1, 2, 3, 4);

        // Obtenemos el punto final
        Point end = line.getEnd();

        // Verificamos que las coordenadas del punto final sean las esperadas (3, 4)
        assertEquals(3, end.getX());
        assertEquals(4, end.getY());
    }

    // Prueba para el método setBegin
    @Test
    void setBegin() {
        // Inicializamos un objeto LineSub con los puntos de inicio (0, 0) y fin (3, 4)
        LineSub line = new LineSub(0, 0, 3, 4);

        // Establecemos un nuevo punto de inicio (5, 5)
        line.setBegin(new Point(5, 5));

        // Verificamos que el punto de inicio se haya actualizado correctamente
        assertEquals(5, line.getBeginX());
        assertEquals(5, line.getBeginY());
    }

    // Prueba para el método setEnd
    @Test
    void setEnd() {
        // Inicializamos un objeto LineSub con los puntos de inicio (0, 0) y fin (3, 4)
        LineSub line = new LineSub(0, 0, 3, 4);

        // Establecemos un nuevo punto final (6, 7)
        line.setEnd(new Point(6, 7));

        // Verificamos que el punto final se haya actualizado correctamente
        assertEquals(6, line.getEndX());
        assertEquals(7, line.getEndY());
    }

    // Prueba para el método getBeginX
    @Test
    void getBeginX() {
        // Inicializamos un objeto LineSub con los puntos de inicio (2, 3) y fin (6, 7)
        LineSub line = new LineSub(2, 3, 6, 7);

        // Verificamos que la coordenada X del punto de inicio sea 2
        assertEquals(2, line.getBeginX());
    }

    // Prueba para el método getBeginY
    @Test
    void getBeginY() {
        // Inicializamos un objeto LineSub con los puntos de inicio (2, 3) y fin (6, 7)
        LineSub line = new LineSub(2, 3, 6, 7);

        // Verificamos que la coordenada Y del punto de inicio sea 3
        assertEquals(3, line.getBeginY());
    }

    // Prueba para el método getEndX
    @Test
    void getEndX() {
        // Inicializamos un objeto LineSub con los puntos de inicio (2, 3) y fin (6, 7)
        LineSub line = new LineSub(2, 3, 6, 7);

        // Verificamos que la coordenada X del punto final sea 6
        assertEquals(6, line.getEndX());
    }

    // Prueba para el método getEndY
    @Test
    void getEndY() {
        // Inicializamos un objeto LineSub con los puntos de inicio (2, 3) y fin (6, 7)
        LineSub line = new LineSub(2, 3, 6, 7);

        // Verificamos que la coordenada Y del punto final sea 7
        assertEquals(7, line.getEndY());
    }

    // Prueba para el método setBeginX
    @Test
    void setBeginX() {
        // Inicializamos un objeto LineSub con los puntos de inicio (1, 1) y fin (4, 4)
        LineSub line = new LineSub(1, 1, 4, 4);

        // Establecemos un nuevo valor para la coordenada X del punto de inicio
        line.setBeginX(10);

        // Verificamos que la coordenada X del punto de inicio se haya actualizado correctamente
        assertEquals(10, line.getBeginX());
    }

    // Prueba para el método setBeginY
    @Test
    void setBeginY() {
        // Inicializamos un objeto LineSub con los puntos de inicio (1, 1) y fin (4, 4)
        LineSub line = new LineSub(1, 1, 4, 4);

        // Establecemos un nuevo valor para la coordenada Y del punto de inicio
        line.setBeginY(20);

        // Verificamos que la coordenada Y del punto de inicio se haya actualizado correctamente
        assertEquals(20, line.getBeginY());
    }

    // Prueba para el método setBeginXY
    @Test
    void setBeginXY() {
        // Inicializamos un objeto LineSub con los puntos de inicio (1, 1) y fin (4, 4)
        LineSub line = new LineSub(1, 1, 4, 4);

        // Establecemos nuevas coordenadas para el punto de inicio
        line.setBeginXY(15, 25);

        // Verificamos que las coordenadas del punto de inicio se hayan actualizado correctamente
        assertEquals(15, line.getBeginX());
        assertEquals(25, line.getBeginY());
    }

    // Prueba para el método setEndX
    @Test
    void setEndX() {
        // Inicializamos un objeto LineSub con los puntos de inicio (1, 1) y fin (4, 4)
        LineSub line = new LineSub(1, 1, 4, 4);

        // Establecemos un nuevo valor para la coordenada X del punto final
        line.setEndX(8);

        // Verificamos que la coordenada X del punto final se haya actualizado correctamente
        assertEquals(8, line.getEndX());
    }

    // Prueba para el método setEndY
    @Test
    void setEndY() {
        // Inicializamos un objeto LineSub con los puntos de inicio (1, 1) y fin (4, 4)
        LineSub line = new LineSub(1, 1, 4, 4);

        // Establecemos un nuevo valor para la coordenada Y del punto final
        line.setEndY(9);

        // Verificamos que la coordenada Y del punto final se haya actualizado correctamente
        assertEquals(9, line.getEndY());
    }

    // Prueba para el método setEndXY
    @Test
    void setEndXY() {
        // Inicializamos un objeto LineSub con los puntos de inicio (1, 1) y fin (4, 4)
        LineSub line = new LineSub(1, 1, 4, 4);

        // Establecemos nuevas coordenadas para el punto final
        line.setEndXY(10, 15);

        // Verificamos que las coordenadas del punto final se hayan actualizado correctamente
        assertEquals(10, line.getEndX());
        assertEquals(15, line.getEndY());
    }

    // Prueba para el método getLength
    @Test
    void getLength() {
        // Inicializamos un objeto LineSub con los puntos de inicio (0, 0) y fin (3, 4)
        LineSub line = new LineSub(0, 0, 3, 4);

        // Verificamos que la longitud de la línea sea la esperada (5.0)
        assertEquals(5.0, line.getLength(), 0.001); // sqrt(3^2 + 4^2) = 5
    }

    // Prueba para el método getGradient
    @Test
    void getGradient() {
        // Inicializamos un objeto LineSub con los puntos de inicio (0, 0) y fin (3, 3)
        LineSub line = new LineSub(0, 0, 3, 3);

        // Verificamos que el gradiente de la línea sea el esperado (45 grados o π/4 radianes)
        assertEquals(Math.PI / 4, line.getGradient(), 0.001); // 45 grados (π/4 radianes)
    }

    // Prueba para el método toString
    @Test
    void testToString() {
        // Inicializamos un objeto LineSub con los puntos de inicio (1, 2) y fin (3, 4)
        LineSub line = new LineSub(1, 2, 3, 4);

        // Verificamos que el método toString devuelva la cadena esperada
        assertEquals("LineSub[begin=Point: (1, 2), end=Point: (3, 4)]", line.toString());
    }
}








