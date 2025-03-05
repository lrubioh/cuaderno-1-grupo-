package es.uah.matcomp.mp.e3.ejerciciosclases.e2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    // Prueba para el método getSchool
    @Test
    void getSchool() {
        // Se crea un objeto Staff con los datos iniciales
        Staff staff = new Staff("John Doe", "123 Main St", "Harvard", 50000);

        // Se verifica que el método getSchool devuelva el valor esperado "Harvard"
        assertEquals("Harvard", staff.getSchool(), "El método getSchool no devuelve el valor esperado.");
    }

    // Prueba para el método setSchool
    @Test
    void setSchool() {
        // Se crea un objeto Staff con los datos iniciales
        Staff staff = new Staff("John Doe", "123 Main St", "Harvard", 50000);

        // Se cambia el valor de la escuela usando el método setSchool
        staff.setSchool("MIT");

        // Se verifica que el valor de la escuela haya sido actualizado correctamente a "MIT"
        assertEquals("MIT", staff.getSchool(), "El método setSchool no establece el valor correctamente.");
    }

    // Prueba para el método getPay
    @Test
    void getPay() {
        // Se crea un objeto Staff con el salario inicial
        Staff staff = new Staff("John Doe", "123 Main St", "Harvard", 50000);

        // Se verifica que el método getPay devuelva el valor esperado (50000)
        assertEquals(50000, staff.getPay(), "El método getPay no devuelve el valor esperado.");
    }

    // Prueba para el método setPay
    @Test
    void setPay() {
        // Se crea un objeto Staff con el salario inicial
        Staff staff = new Staff("John Doe", "123 Main St", "Harvard", 50000);

        // Se cambia el valor del salario usando el método setPay
        staff.setPay(60000);

        // Se verifica que el salario haya sido actualizado correctamente a 60000
        assertEquals(60000, staff.getPay(), "El método setPay no establece el valor correctamente.");
    }

    // Prueba para el método toString
    @Test
    void testToString() {
        // Se crea un objeto Staff con los datos iniciales
        Staff staff = new Staff("John Doe", "123 Main St", "Harvard", 50000);

        // Se define la cadena esperada que debe devolver el método toString
        String expected = "Staff[Person[name=John Doe, address=123 Main St], school=Harvard, pay=50000.0]";

        // Se verifica que el método toString devuelva la cadena esperada
        assertEquals(expected, staff.toString(), "El método toString no devuelve la cadena esperada.");
    }

    // Prueba para el método getSchool con otro miembro del personal
    @Test
    void testGetSchool() {
        // Se crea un objeto Staff con diferente escuela (Yale)
        Staff staff = new Staff("Jane Smith", "456 Oak St", "Yale", 45000);

        // Se verifica que el método getSchool devuelva "Yale"
        assertEquals("Yale", staff.getSchool(), "El método getSchool no devuelve el valor esperado.");
    }

    // Prueba para el método setSchool con otro miembro del personal
    @Test
    void testSetSchool() {
        // Se crea un objeto Staff con la escuela inicial "Yale"
        Staff staff = new Staff("Jane Smith", "456 Oak St", "Yale", 45000);

        // Se cambia la escuela a "Princeton" usando el método setSchool
        staff.setSchool("Princeton");

        // Se verifica que el método setSchool actualice correctamente el valor a "Princeton"
        assertEquals("Princeton", staff.getSchool(), "El método setSchool no establece el valor correctamente.");
    }

    // Prueba para el método getPay con otro miembro del personal
    @Test
    void testGetPay() {
        // Se crea un objeto Staff con un salario de 45000
        Staff staff = new Staff("Jane Smith", "456 Oak St", "Yale", 45000);

        // Se verifica que el salario devuelto por getPay sea 45000
        assertEquals(45000, staff.getPay(), "El método getPay no devuelve el valor esperado.");
    }

    // Prueba para el método setPay con otro miembro del personal
    @Test
    void testSetPay() {
        // Se crea un objeto Staff con un salario inicial de 45000
        Staff staff = new Staff("Jane Smith", "456 Oak St", "Yale", 45000);

        // Se cambia el salario a 55000 usando el método setPay
        staff.setPay(55000);

        // Se verifica que el salario haya sido actualizado correctamente a 55000
        assertEquals(55000, staff.getPay(), "El método setPay no establece el valor correctamente.");
    }

    // Prueba para el método toString con otro miembro del personal
    @Test
    void testToString1() {
        // Se crea un objeto Staff con diferente miembro del personal
        Staff staff = new Staff("Jane Smith", "456 Oak St", "Yale", 45000);

        // Se define la cadena esperada que debe devolver el método toString para este objeto
        String expected = "Staff[Person[name=Jane Smith, address=456 Oak St], school=Yale, pay=45000.0]";

        // Se verifica que el método toString devuelva la cadena esperada
        assertEquals(expected, staff.toString(), "El método toString no devuelve la cadena esperada.");
    }
}

