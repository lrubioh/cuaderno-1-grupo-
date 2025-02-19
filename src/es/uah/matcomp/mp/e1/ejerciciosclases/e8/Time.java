package es.uah.matcomp.mp.e1.ejerciciosclases.e8;

public class Time {
    /**ATRIBUTOS**/
    private int hour;
    private int minute;
    private int second;
    /**METODOS**/
    //crea una hora con una hora unos minutos y unos segundo que se le introduzcan
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //devuelve la hora
    public int getHour() {
        return  hour ;
    }
    //devuelve los minutos
    public int getMinute() {
        return minute;
    }
    //devuelve  los segundos
    public int getSecond() {
        return second;
    }
    //da valor a la hora
    public void setHour(int hour) {
        this.hour = hour;
    }
    //da valor a los minutos
    public void setMinute(int minute) {
        this.minute = minute;
    }
    //da valor a los segundos
    public void setSecond(int second) {
        this.second = second;
    }
    //da valor a una hora minutos y segundos
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //devuelve la hora minutos y segundos en formato de cadena de texto para estar en el formato 00/00/00
    // de manera que si solo es un numero la hora/minuto/segundos la añade un 0 a la izquierda
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    //calcula el siguiente segundo sumandole uno a los segundos y teniendo en cuenta que si llegan a 60 hay que ponerlos
    //a 0 y sumerle uno a los minutos igual que si los minutos llegan a 60 hay que restablecerlos a 0 y sumarle uno a las horas
    //y si las horas se pasan de 24 hacer el modulo 24 para que nunca pase de ahi siendo el 24 el 00
    public Time nextSecond(){
        second++;
        if(second==60){
            second=0;
            minute++;
            if(minute==60){
                minute=0;
                hour = (hour +1)%24;
            }
        }
        return this;
    }
    //devuelve el segundo anterior teniendo en cuenta las mismas cosas que en el anterior metodo, resta un segundo y
    //si era 0 se quedaria negativo y hay que establecerlo como 59 y restar un minuto, si el minuto era 0 ponerlo a 59 y restarle 1
    //a la hora haciendo el modulo 24 para que este siempre en ese formato.
    public Time previousSecond(){
        second--;
        if(second<0){
            second=59;
            minute--;
            if(minute<0){
                minute=59;
                hour = (hour - 1 + 24) % 24;
            }
        }

        return this;
    }
}
