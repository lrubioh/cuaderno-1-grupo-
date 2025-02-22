package es.uah.matcomp.mp.e2.ejerciciosclases.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrizTest {/**Prueba el test de la clase Matriz*/
    /**Se debe comprobar que la matriz impresa es la correcta */
    @Test
    void imprimirMatriz() {
        Matriz matriz = new Matriz();
        MyPoint[] puntos = new MyPoint[10];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new MyPoint();
            puntos[i].setX(i);
            puntos[i].setY(i);
        }
        System.out.println(matriz);

    }
}