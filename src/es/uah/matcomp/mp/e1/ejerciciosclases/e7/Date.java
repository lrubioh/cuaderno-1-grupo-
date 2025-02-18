package es.uah.matcomp.mp.e1.ejerciciosclases.e7;

public class Date {
    /**ATRIVUTOS**/
    private int day;
    private int month;
    private int year;
    /**METODOS**/
    //crea una fecha introduciendo el dia mes y año
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //devuelve el dia de una fecha
    public int getDay() {
        return day;
    }
    //devuelve el mes
    public int getMonth() {
        return month;
    }
    //devuelve el año
    public int getYear() {
        return year;
    }
    //da valor a un dia
    public void setDay(int day) {
        this.day = day;
    }
    //da valor al mes
    public void setMonth(int month) {
        this.month = month;
    }
    //da valor al año
    public void setYear(int year) {
        this.year = year;
    }
    //da valor a la fecha completa con dia mes y año
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //me devuelve la fecha de la forma dia/mes/año
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

