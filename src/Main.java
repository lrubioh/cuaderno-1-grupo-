import es.uah.matcomp.mp.e3.ejerciciosclases.e2.Person;
import es.uah.matcomp.mp.e3.ejerciciosclases.e2.Student;
import es.uah.matcomp.mp.e3.ejerciciosclases.e2.Staff;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Person
        Person person = new Person("Juan Perez", "Av. Siempre Viva 123");
        System.out.println(person); // Se llama a toString()

        // Crear un objeto de la clase Student
        Student student = new Student("Maria Gomez", "Calle Falsa 456", "Ingeniería", 2, 1500.50);
        System.out.println(student); // Se llama a toString()

        // Modificar valores del estudiante
        student.setProgram("Matemáticas");
        student.setYear(3);
        student.setFee(2000.75);
        System.out.println("Programa actualizado: " + student.getProgram());
        System.out.println("Año actualizado: " + student.getYear());
        System.out.println("Cuota actualizada: " + student.getFee());

        // Crear un objeto de la clase Staff
        Staff staff = new Staff("Carlos Ruiz", "Paseo del Prado 789", "Escuela Primaria", 2500.00);
        System.out.println(staff); // Se llama a toString()

        // Modificar valores del staff
        staff.setSchool("Colegio Nacional");
        staff.setPay(3000.25);
        System.out.println("Escuela actualizada: " + staff.getSchool());
        System.out.println("Pago actualizado: " + staff.getPay());
    }
}
