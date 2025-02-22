package es.uah.matcomp.mp.e2.ejerciciosclases.segundaprueba;

import es.uah.matcomp.mp.e2.ejerciciosclases.primeroprueba.Authorprueba;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookmejoradaTest {/**Test para la clase Bookmejorada*/
    /**Comprueba que devuelve el nombre del libro correccto*/
    @Test
    void getName() {
        Authorprueba[] authors = new Authorprueba[2];
        authors[0] = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com", 'f');
        authors[1] = new Authorprueba("Lorena Pe", "lorena.pe@gmail.com", 'f');
        Bookmejorada bookmejorada = new Bookmejorada("El río", authors, 40, 13);
        assertEquals("El río", bookmejorada.getName());
    }
    /**Comprueba que devuelve los datos correctos de los autores del libro*/
    @Test
    void getAuthors() {
        Authorprueba[] authors = new Authorprueba[2];
        authors[0] = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com", 'f');
        authors[1] = new Authorprueba("Lorena Pe", "lorena.pe@gmail.com", 'f');
        Bookmejorada bookmejorada = new Bookmejorada("El río", authors, 40, 13);
        assertEquals(authors,  bookmejorada.getName());
    }
    /**Establece un nuevo precio a través del setPrice y comprueba que el valor
     * retornado es el correcto*/
    @Test
    void setPrice() {
        Authorprueba[] authors = new Authorprueba[2];
        authors[0] = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com", 'f');
        authors[1] = new Authorprueba("Lorena Pe", "lorena.pe@gmail.com", 'f');
        Bookmejorada bookmejorada = new Bookmejorada("El río", authors, 40, 13);
        bookmejorada.setPrice(20);
        assertEquals(20, bookmejorada);
    }
    /**Comprueba que la cantidad es correcta y es la misma que la establecida */
    @Test
    void getQty() {
        Authorprueba[] authors = new Authorprueba[2];
        authors[0] = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com", 'f');
        authors[1] = new Authorprueba("Lorena Pe", "lorena.pe@gmail.com", 'f');
        Bookmejorada bookmejorada = new Bookmejorada("El río", authors, 40, 13);
        assertEquals(13, bookmejorada.getQty());
    }
    /**Se modifica la cantidad de ejemplares que hay y se debe imprimir los datos correcto y esta
     * funcion lo comprueba*/
    @Test
    void setQty() {
        Authorprueba[] authors = new Authorprueba[2];
        authors[0] = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com", 'f');
        authors[1] = new Authorprueba("Lorena Pe", "lorena.pe@gmail.com", 'f');
        Bookmejorada bookmejorada = new Bookmejorada("El río", authors, 40, 13);
        bookmejorada.setQty(10);
        assertEquals(10, bookmejorada.getQty());
    }
    /**Prueba el metodo toString de manera que se devuelva de manera correcta la cadena establecida
     * sobre los datos del bookmejorada*/
    @Test
    void testToString() {
        Authorprueba[] authors = new Authorprueba[2];
        authors[0] = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com", 'f');
        authors[1] = new Authorprueba("Lorena Pe", "lorena.pe@gmail.com", 'f');
        Bookmejorada bookmejorada = new Bookmejorada("El río", authors, 40, 13);
        assertEquals("Book= [name='EL río', authors= ['Sofia Lopez', 'Lorena Pe'], price= 40, qty=13]", bookmejorada.toString());
    }
    /**Comprueba que los nombres retornados de los autores son correctos*/
    @Test
    void getAuthorNames() {
        Authorprueba[] authors = new Authorprueba[2];
        authors[0] = new Authorprueba("Sofia Lopez", "sofia.lopez@gmail.com", 'f');
        authors[1] = new Authorprueba("Lorena Pe", "lorena.pe@gmail.com", 'f');
        Bookmejorada bookmejorada = new Bookmejorada("El río", authors, 40, 13);
        assertEquals("'Sofia Lopez','Lorena Pe'", bookmejorada.getAuthorNames());
    }
}