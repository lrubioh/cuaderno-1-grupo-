package es.uah.matcomp.mp.e4.ejerciciosclases.e4;

//La clase MovablePoint representa un punto en un espacio bidimensional
//que puede moverse en diferentes direcciones según una velocidad establecida.
//Implementa la interfaz Movable.
public class MovablePoint implements Movable {
    //Las coordenadas (x, y) y las velocidades (xSpeed, ySpeed) determinan su
    //posición y la magnitud del movimiento en cada dirección.
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    /**ZONA DE METODOS**/
    //Constructor que inicializa el punto con una posición y velocidades específicas.
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    //Mueve el punto hacia arriba disminuyendo su coordenada Y según la velocidad en Y.
    @Override
    public void moveUp() {
        y -= ySpeed;
    }
    //Mueve el punto hacia abajo aumentando su coordenada Y según la velocidad en Y.
    @Override
    public void moveDown() {
        y += ySpeed;
    }
    //Mueve el punto hacia la izquierda disminuyendo su coordenada X según la velocidad en X.
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
    //Mueve el punto hacia la derecha aumentando su coordenada X según la velocidad en X.
    @Override
    public void moveRight() {
        x += xSpeed;
    }
    //Devuelve una cadena con la posición actual y la velocidad del punto en el formato "(x,y),speed=(xSpeed,ySpeed)".
    @Override
    public String toString() {
        return "(" + x + "," + y + "),speed=(" + xSpeed + "," + ySpeed + ")";
    }
}
