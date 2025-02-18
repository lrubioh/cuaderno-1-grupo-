//importo la clase Account

import es.uah.matcomp.mp.e1.ejerciciosclases.e6.Account;
public class Main {
    public static void main(String[] args) {
        //creo dos nuevas cuentas la primera introduciendo todos lo datos y la segunda con el valor del dinero por defecto
        //y las devuelvo por pantalla con el metodo toString
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);
        Account a2 = new Account("A102", "Kumar");
        System.out.println(a2);

        //devuelvo el id
        System.out.println("ID: " + a1.getID());
        //devuelvo el nombre
        System.out.println("Name: " + a1.getName());
        //devuelvo el dinero que hay en la cuenta
        System.out.println("Balance: " + a1.getBalance());
        //ingreso dinero a la cuenta e imprimo el nuevo total
        a1.credit(100);
        System.out.println(a1);
        //saco dinero de la cuenta y devuelvo cuanto queda (habiendo sufiicente dinero)
        a1.debit(50);
        System.out.println(a1);
        //saco dinero de la cuenta y devuelvo cuanto queda (sin haber sufiicente dinero)
        a1.debit(500);
        System.out.println(a1);
        //pruebo a transferir dinero a otra cuenta y devuelvo el nuevo total del las dos
        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }


}

