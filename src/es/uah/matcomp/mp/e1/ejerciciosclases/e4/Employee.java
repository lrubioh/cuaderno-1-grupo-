package es.uah.matcomp.mp.e1.ejerciciosclases.e4;

public class Employee {
    /**ATRIVUTOS**/
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    /**METODOS**/
    //implementa un nuevo empleado con el id, nombre apellidos y salario que yo establezca
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    //me devuelve el id el empleado
    public int getId() {
        return id;
    }
    //me devuelve el nombre del empleado
    public String getFirstName(){
        return firstName;
    }
    //me devuelve el apellido el empleado
    public String getLastName(){
        return lastName;
    }
    //me devuelve el nombre completo, es decir, nombre y apellido
    public String getName(){

        return firstName+" "+lastName;
    }
    //me devuelve el salario
    public int getSalary(){
        return salary;
    }
    //me cambia el salario del empleado
    public void setSalary(int salary){
        this.salary = salary;
    }
    //me devuelve el salario anual
    public int getAnnualSalary(){
        return salary*12;
    }
    //incrementa el salario y me lo devuelve
    public int raiseSalary(int percent){
        salary = salary + (salary*percent)/100;
        return salary;
    }
    //me imprime los datos del empleado
    @Override
    public String toString() {
        return "Employee[" + "id=" + id + ", name='" + firstName+" "+lastName + '\'' + ", salary=" + salary  + ']';
    }
}
