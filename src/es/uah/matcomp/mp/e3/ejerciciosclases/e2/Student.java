package es.uah.matcomp.mp.e3.ejerciciosclases.e2;

/**
 * Clase que representa a un estudiante con programa, año y tarifa
 */
public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor para inicializar a un estudiante con nombre, direccion, programa, año y tarifa
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Devuelve el programa del estudiante
     */
    public String getProgram() {
        return program;
    }

    /**
     * Establece un nuevo programa para el estudiante
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Devuelve el año del esrudiante
     */
    public int getYear() {
        return year;
    }

    /**
     * Establece un nuevo año del estudiante
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Devuelve la tarifa del estudiante
     */
    public double getFee() {
        return fee;
    }

    /**
     * Establece una nueva tarifa del estudiante
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Devuelve una representación en cadena del estudiante
     */
    @Override
    public String toString() {
        return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]]";
    }

}