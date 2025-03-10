package es.uah.matcomp.mp.e2.ejerciciosclases.e2;
/**Representa una factura definida por el id, el cliente y el importe*/

public class Invoice {/**Guardado en la clase (Invoice.java)*/
    /**ATRIBUTOS*/
    /** Establecidos de manera privada*/
    private int id;
    private Customer customer;
    private double amount;

    /**METODOS*/
    /**Construimos el metodo de la factura a partir del id, cliente y cantidad*/
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    /**Devuelve el id*/
    public int getId() {
        return id;
    }
    /**Devuelve los datos del cliente*/
    public Customer getCustomer() {
        return customer;
    }
    /** Establece valores para el metodo de cliente concretos*/
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    /**Devuelve el importe*/
    public double getAmount() {
        return amount;
    }
    /**Establece una cantidad concreta*/
    public void setAmount(double amount) {
        this.amount = amount;
    }
    /**Devuelve el id del cliente*/
    public int getCustomerId() {
        return customer.getId();
    }
    /**Devuelve nombre del cliente asociado a la factura*/
    public String getCustomerName() {
        return customer.getName();
    }
    /**Devuelve el porcentaje asociado al cliente*/
    public int getCustomerDiscount(){
        return customer.getDiscount();
    }
    /**Devuelve el importe a pagar una vez aplicado el descuento*/
    public double getAmountAfterDiscount(){
        amount = amount - (amount * customer.getDiscount()/100);
        return amount;
    }
    /**Devuelve la factura de la forma: Factura[id, cliente(nombre(id)(descuento), importe]*/
    @Override
    public String toString() {
        return "Invoice [id=" + id + ", customer=" + customer + ", amount=" + amount + "]";
    }
}
