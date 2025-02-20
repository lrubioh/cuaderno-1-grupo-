package es.uah.matcomp.mp.e1.ejerciciosclases.e8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    //pruebo el metodo getHour viendo que la hora sera igual a lo que me devuelve
    //el metodo getHour
    @Test
    void getHour() {
        Time t1 = new Time(1, 2, 3);
        assertEquals(1, t1.getHour());
    }
    //pruebo el metodo getMinute viendo que el minuto sera igual a lo que me devuelve
    //el metodo getMinute
    @Test
    void getMinute() {
        Time t1 = new Time(1, 2, 3);
        assertEquals(2, t1.getMinute());
    }
    //pruebo el metodo getSecond viendo que el segundo sera igual al lo que me devuelve
    //el metodo getSecond
    @Test
    void getSecond() {
        Time t1 = new Time(1, 2, 3);
        assertEquals(3, t1.getSecond());
    }
    //pruebo el metodo setHour dandole un valor a la hora y viendo que esa hora sea igual a
    //lo que me devuelve el metodo getHour
    @Test
    void setHour() {
        Time t1 = new Time(1, 2, 3);
        t1.setHour(5);
        assertEquals(5, t1.getHour());
    }
    //pruebo el metodo setMinute dandole un valor al minuto y viendo que ese minuto sea igual a
    //lo que me devuelve el metodo getMinute
    @Test
    void setMinute() {
        Time t1 = new Time(1, 2, 3);
        t1.setMinute(25);
        assertEquals(25, t1.getMinute());

    }
    //pruebo el metodo setSecond dandole un valor a los segundos y viendo que estos sean igual a
    //lo que me devuelve el metodo getSeconds
    @Test
    void setSecond() {
        Time t1 = new Time(1, 2, 3);
        t1.setSecond(59);
        assertEquals(59, t1.getSecond());
    }
    //pruebo el metodo setTime dandole un valor a la hora completa  y viendo que esa hora sea igual a
    //lo que me devuelve el metodo toString
    @Test
    void setTime() {
        Time t1 = new Time(1, 2, 3);
        t1.setTime(3,50,57);
        assertEquals("03:50:57",String.format("%02d:%02d:%02d", t1.getHour(), t1.getMinute(), t1.getSecond()));
    }
    //pruebo el metodo ToString viendo que lo que me devuelve sea igual a la hora en ese formato
    @Test
    void testToString() {
        Time t1 = new Time(1, 2, 3);
        assertEquals("01:02:03",String.format("%02d:%02d:%02d", t1.getHour(), t1.getMinute(), t1.getSecond()));
    }
    //pruebo el metodo nextSecond viendo que el segundo mas uno sea igual a lo que me devuelve el nextSecond
    @Test
    void nextSecond() {
        Time t1 = new Time(1, 2, 3);
        assertEquals("01:02:04", t1.nextSecond());
    }
    //pruebo el metodo previousSecond viendo que el segundo menos uno sea igual a lo que me devuelve el previousSecond
    @Test
    void previousSecond() {
        Time t1 = new Time(1, 2, 3);
        assertEquals("01:02:02", t1.previousSecond());
    }
}