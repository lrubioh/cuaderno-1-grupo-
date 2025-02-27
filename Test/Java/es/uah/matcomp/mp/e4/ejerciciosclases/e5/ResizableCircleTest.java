package es.uah.matcomp.mp.e4.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {


    //Prueba para verificar el metodo resize() de ResizableCircle.
    @Test
    public void testResize() {
        ResizableCircle resizableCircle = new ResizableCircle(10);
        resizableCircle.resize(50);
        assertEquals(5.0, resizableCircle.radius, 0.0001, "El radio no se ha redimensionado correctamente");
    }

    /**
     * Prueba para verificar el cálculo del área después de redimensionar.
     */
    @Test
    public void testResizableCircleGetAreaAfterResize() {
        ResizableCircle resizableCircle = new ResizableCircle(10);
        resizableCircle.resize(50);
        assertEquals(78.53981633974483, resizableCircle.getArea(), 0.0001, "El área después de redimensionar no es la esperada");
    }

    /**
     * Prueba para verificar el cálculo del perímetro después de redimensionar.
     */
    @Test
    public void testResizableCircleGetPerimeterAfterResize() {
        ResizableCircle resizableCircle = new ResizableCircle(10);
        resizableCircle.resize(50);
        assertEquals(31.41592653589793, resizableCircle.getPerimeter(), 0.0001, "El perímetro después de redimensionar no es el esperado");
    }
}