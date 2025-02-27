package es.uah.matcomp.mp.e3.ejerciciosclases.e7;

public class Point {
    /**
     * Clase que representa un punto
     */
    private int x;
    private int y;

    /**
     * Constructor para inicializar el punto con la coordenada x e y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Devuelve la coordenada x
     */
    public int getX() {
        return x;
    }

    /**
     * Devuelve la coordenada y
     */
    public int getY() {
        return y;
    }

    /**
     * Establece una coordenada x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Establece una coordenada y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Establece una coordenada x e y simultáneamente
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Devuelve una representación en cadena del punto
     */
    @Override
    public String toString() {
        return "Point: (" + x + ", " + y + ")";
    }
}
