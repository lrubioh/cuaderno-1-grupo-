//importo la clase Employee

import es.uah.matcomp.mp.e1.ejerciciosclases.e4.Employee;
public class Main {
    public static void main(String[] args) {
        //creo mi empleado 1 y lo muesto por pantalla con el metodo toString
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);
        //pruebo la funcion setSalary y la muestro con el toString
        e1.setSalary(999);
        System.out.println(e1);
        //devuelvo el id de mi empleado con el metodo getId
        System.out.println("id is: " + e1.getId());
        //devuelvo el nombre del empleado con el metodo getFirstName
        System.out.println("firstname is: " + e1.getFirstName());
        //devuelvo el apellido del empleado con el metodo getLastName
        System.out.println("lastname is: " + e1.getLastName());
        //devuelvo el salary del empleado con el metodo getSalary
        System.out.println("salary is: " + e1.getSalary());
        //devuelvo el nombre completo nombre y apellidos con el metodo getName
        System.out.println("name is: " + e1.getName());
        //devuelvo el salary anual con el metodo getAnnualSalary
        System.out.println("annual salary is: " + e1.getAnnualSalary());
        //pruebo el metodo raiseSalary y lo muestro por pantalla
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}

