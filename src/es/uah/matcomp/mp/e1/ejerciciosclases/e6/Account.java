package es.uah.matcomp.mp.e1.ejerciciosclases.e6;

public class Account {
    /**ATRIBUTOS**/
    private String id;
    private String name;
    private int balance;
    /**METODOS**/
    //me crea una cuenta con el balance por defecto y los datos necesarios: nombre y id.
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    //crea una cuenta con los datos que introduzca
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    //me devuelve el id
    public String getID() {
        return id;
    }
    //me devuelve el nombre
    public String getName() {
        return name;
    }
    //me devuelve la cantidad de dinero de la cuenta
    public int getBalance() {
        return balance;
    }
    //ingresa dinero a la cuenta y me devuelve el dinero total
    public int credit(int amount){
        balance= balance+amount;
        return balance;
    }
    //hace un pago con la cuenta comprobando si hay dinero suficiente ,
    //si si hay resta la cantidad y me devuelve el dinero que queda en la cuenta
    //si no hay suficiente imprime un mensaje ya que no es posible realizar la operacion
    public int debit(int amount){
        if(amount<=balance){
            balance=balance-amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    //transfiere dinero a otra cuenta comprobando si hay sufiente o no como en el anterior metodo
    public int transferTo(Account Another, int amount){
        if(amount<=balance){
            this.debit(amount);
            Another.credit(amount);
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    //me devuelve los datos de la cuenta
    @Override
    public String toString() {
        return "Account{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", balance=" + balance + '}';
    }
}
