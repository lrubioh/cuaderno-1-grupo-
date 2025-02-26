package es.uah.matcomp.mp.e3.ejerciciosclases.e3;

/**
 * Clase que introduce un punto en 3D con extensiñonn del 2D
 */
public class Point3D extends Point2D {
    private float z = 0.0f;

    /**
     * Constructor con los parámetros x , y , z
     */
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    /**
     * Constructor por defecto
     */
    public Point3D() {
    }

    /**
     * Devuelve el parámetro z
     */
    public float getZ() {
        return z;
    }

    /**
     * Establece un nuevo parámetro z
     * @param z
     */
    public void setZ(float z) {
        this.z = z;
    }

    // Método para establecer x, y , z
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    // Método para obtener un array con los valores de x, y , z
    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    // Método toString()
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}

