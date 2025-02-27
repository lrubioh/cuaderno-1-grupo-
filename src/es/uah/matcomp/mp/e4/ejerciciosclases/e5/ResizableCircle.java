package es.uah.matcomp.mp.e4.ejerciciosclases.e5;
public class ResizableCircle extends Circle implements Resizable {
    /**ZONA DE METODOS**/
    //Constructor de la clase ResizableCircle.
    public ResizableCircle(double radius) {
        super(radius);
    }

    //Cambia el tamaño del círculo en un porcentaje dado.
    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}