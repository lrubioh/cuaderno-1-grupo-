package es.uah.matcomp.mp.e3.ejerciciosclases.e4;

/**
 * Clase que inicializa un punto movible que extiende el punto
 */
public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    /**
     * Constructor con todos los parámentros
     */
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Constructor solo con velocidad
     */
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Constructor por defecto
     */
    public MovablePoint() {
    }

    /**
     * Devuelve la velocidad de la x
     */
    public float getXSpeed() {
        return xSpeed;
    }

    /**
     * Establece un nuevo valor de la velocidad de x
     */
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * Devuelve la velocidad de y
     */
    public float getYSpeed() {
        return ySpeed;
    }

    /**
     * Establece un nuevo valor de la velocidad de y
     */
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    /**
     * Establece un nuevo valor de la velocidad de x e y simultáneamente
     */
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Devuelve un valor de la velocidad de x e y simultáneamente
     */
    public float[] getSpeed() {
        return new float[] { xSpeed, ySpeed };
    }

    /**
     * Devuelve una representación en cadena
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}

