package es.uah.matcomp.mp.e3.ejerciciosclases.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        // Crear un objeto Student
        Student student = new Student("John Doe", "123 Main St", "Computer Science", 2, 15000.00);

        // Verificar que el método getProgram() devuelve el valor correcto
        assertEquals("Computer Science", student.getProgram());
    }

    @Test
    void setProgram() {
        // Crear un objeto Student
        Student student = new Student("Jane Smith", "456 Oak St", "Physics", 1, 12000.00);

        // Cambiar el programa con setProgram()
        student.setProgram("Mathematics");

        // Verificar que el programa se actualizó correctamente
        assertEquals("Mathematics", student.getProgram());
    }

    @Test
    void getYear() {
        // Crear un objeto Student
        Student student = new Student("Mark Johnson", "789 Pine St", "Math", 3, 18000.00);

        // Verificar que el método getYear() devuelve el valor correcto
        assertEquals(3, student.getYear());
    }

    @Test
    void setYear() {
        // Crear un objeto Student
        Student student = new Student("Emily White", "101 Maple St", "Biology", 1, 13000.00);

        // Cambiar el año con setYear()
        student.setYear(2);

        // Verificar que el año se actualizó correctamente
        assertEquals(2, student.getYear());
    }

    @Test
    void getFee() {
        // Crear un objeto Student
        Student student = new Student("James Brown", "202 Birch St", "Chemistry", 2, 15000.00);

        // Verificar que el método getFee() devuelve el valor correcto
        assertEquals(15000.00, student.getFee(), 0.001);
    }

    @Test
    void setFee() {
        // Crear un objeto Student
        Student student = new Student("Sarah Lee", "303 Cedar St", "Physics", 1, 12000.00);

        // Cambiar la tarifa con setFee()
        student.setFee(13500.00);

        // Verificar que la tarifa se actualizó correctamente
        assertEquals(13500.00, student.getFee(), 0.001);
    }

    @Test
    void testToString() {
        // Crear un objeto Student
        Student student = new Student("Alice Green", "505 Ash St", "Literature", 3, 14000.00);

        // Verificar que el método toString() devuelve la cadena correcta
        String expectedString = "Student[Person[name=Alice Green, address=505 Ash St], program=Literature, year=3, fee=14000.0]]";
        assertEquals(expectedString, student.toString());
    }
}