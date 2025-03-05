package es.uah.matcomp.mp.e3.ejerciciosclases.e3;

/**
 * Clase de prueba para la clase Point3D
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para Point3D
 */
public class Point3DTest {
    /**
     * Prueba del método getZ
     */
    @Test
    void testGetZ() {
        Point3D point = new Point3D(1.0f, 2.0f, 3.0f);
        assertEquals(3.0f, point.getZ(), 0.001);
    }

    /**
     * Prueba del método setZ
     */
    @Test
    void testSetZ() {
        Point3D point = new Point3D();
        point.setZ(5.5f);
        assertEquals(5.5f, point.getZ(), 0.001);
    }

    /**
     * Prueba del método setXY
     */
    @Test
    void testSetXY() {
        Point3D point = new Point3D();
        point.setX(4.4f);
        point.setY(5.5f);
        assertEquals(4.4f, point.getX(), 0.001);
        assertEquals(5.5f, point.getY(), 0.001);
    }

    /**
     * Prueba del método getXYZ
     */
    @Test
    void testGetXYZ() {
        Point3D point = new Point3D();
        point.setXYZ(4.4f, 5.5f, 6.6f);
        float[] coordinates = point.getXYZ();
        assertArrayEquals(new float[]{4.4f, 5.5f, 6.6f}, coordinates, 0.001f);
    }

    /**
     * Prueba del método toString
     */
    @Test
    void testToString() {
        Point3D point = new Point3D();
        point.setXYZ(7.7f, 8.8f, 9.9f);
        assertEquals("(7.7, 8.8, 9.9)", point.toString());
    }
}