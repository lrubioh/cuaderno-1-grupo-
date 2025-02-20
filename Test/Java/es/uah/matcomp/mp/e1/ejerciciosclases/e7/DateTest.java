package es.uah.matcomp.mp.e1.ejerciciosclases.e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    //pruebo el metodo getDay viendo que lo que me devuelve sea igual al dia
    @Test
    void getDay() {
        Date d1= new Date (16, 10,2025);
        assertEquals(16,d1.getDay());
    }
    //pruebo el metodo getMonth viendo que lo que me devuelve sea igual al mes
    @Test
    void getMonth() {
        Date d1= new Date (16, 10,2025);
        assertEquals(10,d1.getMonth());
    }
    //pruebo el metodo getYear viendo que lo que me devuelve sea igual al año
    @Test
    void getYear() {
        Date d1= new Date (16, 10,2025);
        assertEquals(2025,d1.getYear());
    }
    //pruebo el metodo setDay dando valor al dia de la fecha y comprobando que el valor que le he dado
    //sea igual al que me devuelve el metodo getDay
    @Test
    void setDay() {
        Date d1= new Date (16, 10,2025);
        d1.setDay(5);
        assertEquals(5,d1.getDay());
    }
    //pruebo el metodo setMonth dando valor al mes de la fecha y comprobando que el valor que le he dado
    //sea igual al que me devuelve el metodo getMonth
    @Test
    void setMonth() {
        Date d1= new Date (16, 10,2025);
        d1.setMonth(5);
        assertEquals(5,d1.getMonth());
    }
    //pruebo el metodo setYear dando valor al año de la fecha y comprobando que el valor que le he dado
    //sea igual al que me devuelve el metodo getYear
    @Test
    void setYear() {
        Date d1= new Date (16, 10,2025);
        d1.setYear(2024);
        assertEquals(2024,d1.getYear());
    }
    //pruebo el metodo setDate dando valor al dia, mes , año de la fecha y comprobando que el valor que le he dado
    //sea igual al que me devuelve el metodo toString que me devuelve la fecha
    @Test
    void setDate() {
        Date d1= new Date (16, 10,2025);
        d1.setDate(5,10,2006);
        assertEquals(d1.getDay() + "/" + d1.getMonth() + "/" + d1.getYear(), d1.toString());
    }
    //pruebo que el metodo ToString devuelva lo que deberia comparandolo con lo que tiene que devolver
    @Test
    void testToString() {
        Date d1= new Date (16, 10,2025);
        assertEquals(d1.getDay() + "/" + d1.getMonth() + "/" + d1.getYear(),d1.toString());
    }
}