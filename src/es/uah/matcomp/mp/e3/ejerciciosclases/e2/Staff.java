package es.uah.matcomp.mp.e3.ejerciciosclases.e2;

/**
 * Clase que representa al personal con escuela y pago
 */
public class Staff extends Person{
    private String school;
    private double pay;

    /**
     * Constructor que inicializa al personal con su nombre, direccion, escuela y pago
     */
    public Staff(String name, String addresss, String school, double pay) {
        super(name, addresss);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Devuelve la escuela del personal
     */
    public String getSchool() {
        return school;
    }

    /**
     * Establece una nueva escuela del personal
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Devuelve el pago del personal
     */
    public double getPay() {
        return pay;
    }

    /**
     * Establece un nuevo pago del perosnal
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Devuelve una representación en cadena del personal
     */
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
    }
}
