package es.uah.matcomp.mp.e4.ejerciciosclases.e3;

//La clase MovablePoint implementa la interfaz Movable, y representa un punto en el plano cartesiano
//que se puede mover en las direcciones cardinales a una velocidad definida para cada dirección.
public class MovablePoint implements Movable {

    /**ZONA DE ATRIBUTOS**/
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    /**ZONA DE METODOS**/
    //Constructor de la clase MovablePoint.
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;           // Inicializa la coordenada X.
        this.y = y;           // Inicializa la coordenada Y.
        this.xSpeed = xSpeed; // Inicializa la velocidad en la dirección X.
        this.ySpeed = ySpeed; // Inicializa la velocidad en la dirección Y.
    }

    //Mueve el punto hacia arriba, reduciendo su coordenada Y en la cantidad de la velocidad en Y.
    @Override
    public void moveUp() {
        y -= ySpeed; // Decrementa la coordenada Y para mover el punto hacia arriba.
    }

    //Mueve el punto hacia abajo, incrementando su coordenada Y en la cantidad de la velocidad en Y.
    public void moveDown() {
        y += ySpeed; // Incrementa la coordenada Y para mover el punto hacia abajo.
    }

    //Mueve el punto hacia la izquierda, reduciendo su coordenada X en la cantidad de la velocidad en X.
    public void moveLeft() {
        x -= xSpeed; // Decrementa la coordenada X para mover el punto hacia la izquierda.
    }

    //Mueve el punto hacia la derecha, incrementando su coordenada X en la cantidad de la velocidad en X.
    public void moveRight() {
        x += xSpeed; // Incrementa la coordenada X para mover el punto hacia la derecha.
    }

    //Devuelve una representación en forma de cadena del objeto MovablePoint.
    //La cadena incluye las coordenadas del punto y su velocidad en ambas direcciones.
    @Override
    public String toString() {
        return "(" + x + "," + y + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }
}