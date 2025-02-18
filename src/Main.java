    //importo la clase Time

import es.uah.matcomp.mp.e1.ejerciciosclases.e8.Time;
public class Main {
    public static void main(String[] args) {
        //creo una nueva hora y la devuelvo con el toString
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);
        //doy valor a la hora, minuto , segundo por separado y lo devuelvo con el toString
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);
        //devuelvo las horas minutos y segundos
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
        //doy valor a las horas minutos y segundos
        t1.setTime(23, 59, 58);
        System.out.println(t1);
        //calculo el siguiente segundo con el metodo nextSecond
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());
        //calculo el anterior segundo con el metodo previousSecond
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }



}

