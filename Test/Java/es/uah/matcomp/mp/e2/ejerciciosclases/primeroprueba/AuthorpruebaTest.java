package es.uah.matcomp.mp.e2.ejerciciosclases.primeroprueba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorpruebaTest {/**Test de la clase Authorprueba*/
    /**Prueba la clase del getName donde se comprueba que se devuelve el nombre correcto del autorprueba*/
    @Test
    void getName() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        assertEquals("Sofia Lopez", a1.getName());
    }
    /**Prueba la clase del getEmail donde se comprueba que se devuelve el email correcto del autorprueba*/
    @Test
    void getEmail() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        assertEquals("sofia.lopez@gmail.com", a1.getEmail());
    }
    /**Se establece un email nuevo a partir de la funcion setEmail y se prueba la clase del getName donde se comprueba que se devuelve el email
     * actualizado correctamente del autorprueba*/
    @Test
    void setEmail() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        a1.setEmail("sofia.lopez.nuevo@gmail.com");
        assertEquals("sofia.lopez.nuevo@gmail.com", a1.getEmail());

    }
    /**Prueba la clase del getGender donde se comprueba que se devuelve el email correcto del autorprueba*/
    @Test
    void getGender() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        assertEquals('f', a1.getGender());
    }
    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos del autorprueba*/
    @Test
    void testToString() {
        Authorprueba a1 = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com",'f');
        assertEquals("Authorprueba{name= 'Sofia Lopez', email= 'sofia.lopez@gmail.com',gender= 'f'}", a1.toString());
    }
}