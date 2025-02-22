package es.uah.matcomp.mp.e2.ejerciciosclases.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest { /**Test para la clase Author*/

    /**Prueba la clase del getName donde se comprueba que se devuelve el nombre correcto del autor*/
    @Test
    void getName() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        assertEquals("John Doe", a1.getName());
    }

    /**Prueba la clase del getEmail donde se comprueba que se devuelve el email correcto del autor*/
    @Test
    void getEmail() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        assertEquals("john.doe@gmail.com", a1.getEmail());
    }

    /**Se establece un email nuevo a partir de la funcion setEmail y se prueba la clase del getName donde se comprueba que se devuelve el email
     * actualizado correctamente del autor*/
    @Test
    void setEmail() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        a1.setEmail("john.doe.nuevo@gmail.com");
        assertEquals("john.doe.nuevo@gmail.com", a1.getEmail());
    }

    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos del autor*/
    @Test
    void testToString() {
        Author a1 = new Author("John Doe", "john.doe@gmail.com");
        assertEquals("Author{name= 'John Doe', email= 'john.doe@gmail.com'}" , a1.toString());
       }
}