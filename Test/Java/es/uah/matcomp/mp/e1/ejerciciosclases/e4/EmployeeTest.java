package es.uah.matcomp.mp.e1.ejerciciosclases.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    //creo un nuevo empleado y compruebo que su id (16) sea igual a getId del empleado e1
    //comrpobando asi que el metodo funcione correctamente
    @Test
    void getId() {
        Employee e1= new Employee(16,"Laura", "Rubio",2500);
        assertEquals(16,e1.getId());
    }
    //creo un nuevo empleado y compruebo que "Laura" sea igual que getFirstName de empleado creado
    @Test
    void getFirstName() {
        Employee e1= new Employee(16,"Laura", "Rubio",2500);
        assertEquals("Laura",e1.getFirstName());
    }
    //compruebo que "Rubio" se igual que lo que me devuelve el metodo getLastName con el metodo
    //assertEquals
    @Test
    void getLastName() {
        Employee e1= new Employee(16,"Laura", "Rubio",2500);
        assertEquals("Rubio",e1.getLastName());
    }
    //Miro que "Laura Rubio" sea igual que lo que me devuelve el metodo getName
    @Test
    void getName() {
        Employee e1= new Employee(16,"Laura", "Rubio",2500);
        assertEquals("Laura Rubio",e1.getName());
    }
    //pruebo que 2500 sea igual a getSalary , metodo que me devuelve el salario del el empleado e1
    @Test
    void getSalary() {
        Employee e1= new Employee(16,"Laura", "Rubio",2500);
        assertEquals(2500,e1.getSalary());
    }
    //uso el metodo set salary para darle un nuevo valor al salario de el empleado e1 y compruebo que
    //el valor que le he dado sea igual a lo que me devuelve el metodo getSalary
    @Test
    void setSalary() {
        Employee e1= new Employee(16,"Laura", "Rubio",2500);
        e1.setSalary(3500);
        assertEquals(3500,e1.getSalary());
    }
    //veo que el salario*12 sea igual a getAnnualSalary viendo asi que el metodo getAnnualSalary funciona
    @Test
    void getAnnualSalary() {
        Employee e1= new Employee(16,"Laura", "Rubio",2500);
        assertEquals(2500*12,e1.getAnnualSalary());
    }
    //calculo el salario aumentado el porcentaje que quiera y compruebo que eso sea igual a lo que
    //me devuelve el metodo getSalary
    @Test
    void raiseSalary() {
        Employee e1= new Employee(16,"Laura", "Rubio",2500);
        e1.raiseSalary(20);
        assertEquals(2500+(2500*0.2) ,e1.getSalary());
    }
    //compruebo con los getters que el metodo toString sea igual a lo que me deberia de devolver
    @Test
    void testToString() {
        Employee e1= new Employee(16,"Laura", "Rubio",2500);
        assertEquals("Employee[" + "id=" + e1.getId() + ", name='" + e1.getFirstName()+" "+e1.getLastName() + '\'' + ", salary=" + e1.getSalary()  + ']',e1.toString());
    }
}