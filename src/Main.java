//importo la clase InvoiceItem

import es.uah.matcomp.mp.e1.ejerciciosclases.e5.InvoiceItem;
public class Main {
    public static void main(String[] args) {
        //creo un nuevo empleado y la imprimo con el toString
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);
        //la da el valor 999 al Qty del inv1
        inv1.setQty(999);
        //le da valor al unitprice
        inv1.setUnitPrice(0.99);
        //devuelve el inv1 con el metodoo toString
        System.out.println(inv1);
        //devuelve el id
        System.out.println("id is: " + inv1.getId());
        //devuelve el descuento
        System.out.println("desc is: " + inv1.getDesc());
        // devuelve la cantidad
        System.out.println("qty is: " + inv1.getQty());
        //devuelve el unitprice
        System.out.println("unitPrice is: " + inv1.getUnitPrice());
        //me devuelve el total
        System.out.println("The total is: " + inv1.getTotal());
    }

}

