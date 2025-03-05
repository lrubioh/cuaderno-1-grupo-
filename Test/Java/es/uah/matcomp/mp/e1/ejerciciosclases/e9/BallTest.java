package es.uah.matcomp.mp.e1.ejerciciosclases.e9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {
    //pruebo el metodo getX viendo que la coordenada x sea igual a lo que me devuelve el metodo
    @Test
    void getX() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(1.1f, ball.getX());
    }
    //pruebo el setX dandole un valor a la coordenada x de ball y luego comprobando
    //que ese valor sea igual a lo que me devuelve el getX
    @Test
    void setX() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setX(3.3f);
        assertEquals(3.3f, ball.getX());
    }
    //pruebo el metodo getY viendo que la coordenada y sea igual a lo que me devuelve el metodo
    @Test
    void getY() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(2.2f, ball.getY());
    }
    //pruebo el setY dandole un valor a la coordenada y de ball y luego comprobando
    //que ese valor sea igual a lo que me devuelve el getY
    @Test
    void setY() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setY(3.3f);
        assertEquals(3.3f, ball.getY());
    }
    //pruebo el metodo getRadius viendo que radius sea igual a lo que me devuelve el metodo
    @Test
    void getRadius() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(10, ball.getRadius());
    }
    //pruebo el setRadius dandole un valor a radius de ball y luego comprobando
    //que ese valor sea igual a lo que me devuelve el getRadius
    @Test
    void setRadius() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setRadius(15);
        assertEquals(15, ball.getRadius());
    }
    //pruebo el metodo getXDelta viendo que xDelta sea igual a lo que me devuelve el metodo
    @Test
    void getXDelta() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(3.3f, ball.getXDelta());
    }
    //pruebo el setXDelta dandole un valor a xDelta de ball y luego comprobando
    //que ese valor sea igual a lo que me devuelve el getXDelta
    @Test
    void setXDelta() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setXDelta(4.5f);
        assertEquals(4.5f, ball.getXDelta());
    }
    //pruebo el metodo getYDelta viendo que yDelta sea igual a lo que me devuelve el metodo
    @Test
    void getYDelta() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals(4.4f, ball.getYDelta());
    }
    //pruebo el setYDelta dandole un valor a yDelta de ball y luego comprobando
    //que ese valor sea igual a lo que me devuelve el getYDelta
    @Test
    void setYDelta() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        ball.setYDelta(4.5f);
        assertEquals(4.5f, ball.getYDelta());
    }
    //pruebo la funcion move viendo que x+ xDelta sea igual a lo que me devuelve ball.move
    @Test
    void move() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
    }
    //pruebo que reflectHorizontal funciona viendo que -xDelta es igual a lo que me devolveria
    //reflectHorizontal que es -xDelta
    @Test
    void reflectHorizontal() {
        Ball ball = new Ball(1, 2, 10, 3, 4);
        assertEquals(-3 , -ball.getXDelta());
    }
    //pruebo que reflectVertical funciona viendo que -yDelta es igual a lo que me devolveria
    //reflectVertical que es -yDelta
    @Test
    void reflectVertical() {
        Ball ball = new Ball(1, 2, 10, 3, 4);
        assertEquals(-4 , -ball.getYDelta());

    }

    @Test
    void testToString() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        assertEquals("Ball [(" + ball.getX()+","+ ball.getY() + ")"+ "speed=(" + ball.getXDelta() + ","+ ball.getYDelta() +")]",ball.toString());
    }
}