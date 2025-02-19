package es.uah.matcomp.mp.e1.ejerciciosclases.e5;

public class InvoiceItem {
    /**ATRIBUTOS**/
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    /**METODOS**/
    //creo un nuevo empleado
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    //me devuelve el id del empleado
    public String getId() {
        return id;
    }
    //me devuelve el descuento del empleado
    public String getDesc() {
        return desc;
    }
    //me devuelve la cantidad
    public int getQty() {
        return qty;
    }
    //la da valor al Qty
    public void setQty(int qty) {
        this.qty = qty;
    }
    //me devuelve el unit price
    public double getUnitPrice() {
        return unitPrice;
    }
    //le da valor al UnitPrice
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    //me devuelve el total
    public double getTotal() {
        return qty * unitPrice;
    }
    //me devuelve la informacion del InvoiceItem
    public String toString() {
        return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
    }
}
