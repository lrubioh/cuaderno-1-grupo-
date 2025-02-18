//importo la clase Date

import es.uah.matcomp.mp.e1.ejerciciosclases.e7.Date;
public class Main {
    public static void main(String[] args) {
        //creo una nueva fecha y la devuelvo con el toString
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1);
        //doy malor al mes dia y año y los devuelvo con el toString
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1);
        //devuelvo los valores del mes dia y año por separado
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());
        //doy valor a una fecha completa y le devuelvo con el metodo toString
        d1.setDate(3, 4, 2016);
        System.out.println(d1);
    }



}

