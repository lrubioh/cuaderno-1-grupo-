package es.uah.matcomp.mp.e3.ejerciciosclases.e4;

/**
 * Clase Point que representa un punto en un plano cartesiano con coordenadas (x,y)
 */
public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    /**
     * Constrctor con parámetros
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor por defecto
     */
    public Point() {
    }

    /**
     * Devuelve el valor de la x
     */
    public float getX() {
        return x;
    }

    /**
     * Establece un nuevo valor de la x
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Devuelve el valor de la y
     */
    public float getY() {
        return y;
    }

    /**
     * Establece un nuevo valor de la y
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Establece nuevos valores simultáneamente de la x e y
     */
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Devuelve valores de la x e y simultáneamente
     */
    public float[] getXY() {
        return new float[] {x, y};
    }

    /**
     * Devuelve la representación en cadena de la x e y
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
