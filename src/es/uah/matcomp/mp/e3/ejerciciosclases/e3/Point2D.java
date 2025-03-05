package es.uah.matcomp.mp.e3.ejerciciosclases.e3;

/**
 * Clase que introduce un punto en 2D
 */
public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    /**
     * Constructor con los parámmetros x e y
     */
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Construcor por defecto
     */
    public Point2D() {
    }

    /**
     * Devuelve el parámetro x
     */
    public float getX() {
        return x;
    }

    /**
     * Establece un nuevo parámetro x
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Devuelve el parámetro y
     */
    public float getY() {
        return y;
    }

    /**
     * Establece un nuevo parámetro y
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Establece parámetros x e y simultáneamente
     */
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Método para obtener un array con los valores x e y
     */
    public float[] getXY() {
        return new float[] {x, y};
    }

    //Método toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
