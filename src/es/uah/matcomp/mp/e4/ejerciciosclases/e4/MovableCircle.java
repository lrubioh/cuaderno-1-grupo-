package es.uah.matcomp.mp.e4.ejerciciosclases.e4;


public class MovableCircle implements Movable {
    /**DECLARO LOS ATRIBUTOS PRIVADOS**/
    private int radius;
    private MovablePoint center;
    /**DECLARO LOS METODOS PUBLICOS**/
    //Constructor que inicializa el círculo con su centro y radio.
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    //Mueve el círculo hacia arriba moviendo su centro.
    @Override
    public void moveUp(){
        this.center.moveUp();
    }
    //Mueve el círculo hacia abajo moviendo su centro.
    @Override
    public void moveDown(){
        this.center.moveDown();
    }
    //Mueve el círculo hacia la izquierda moviendo su centro.
    @Override
    public void moveLeft(){
        this.center.moveLeft();
    }
    //Mueve el círculo hacia la derecha moviendo su centro.
    @Override
    public void moveRight(){
        this.center.moveRight();
    }
    //Representación en cadena del objeto MovableCircle.
    @Override
    public String toString() {
        return "MovableCircle[=" + center.toString() + ", radius=" + radius +"]";
    }
}