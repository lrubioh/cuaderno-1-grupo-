//importo la clase Rectangle

import es.uah.matcomp.mp.e1.ejerciciosclases.e3.Rectangle;
//creo un main para probar los metodos y atrivutos
public class Main {
        public static void main(String[] args) {
            //creo un rectangulo con las medidas de largo y  ancho que yo quiera
            Rectangle r1 = new Rectangle(1.2f, 3.4f);
            //imprimo el rectangulo con el metodo toString()
            System.out.println(r1);
            //creo un nuevo rectángulo con el metodo por defecto
            Rectangle r2 = new Rectangle();
            //imprimo el rectangulo r2
            System.out.println(r2);
            //pruebo a cambiar el largo y ancho por separado del rectangulo r1 con las funciones
            // setLength y setWidth
            r1.setLength(5.6f);
            r1.setWidth(7.8f);
            //imprimo el r1 con sus cambios y atarves del metodo toString
            System.out.println(r1);
            //imprimo el largo del rectangulo con la funcion getLength
            System.out.println("length is: " + r1.getLength());
            //imprimo el ancho del rectangulo con la funcion getWidth
            System.out.println("width is: " + r1.getWidth());
            //pruebo las funciones getArea y getPerimeter
            System.out.printf("area is: %.2f%n", r1.getArea());
            System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
        }
    }
