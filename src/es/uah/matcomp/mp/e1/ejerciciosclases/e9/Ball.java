package es.uah.matcomp.mp.e1.ejerciciosclases.e9;

public class Ball {
    /**ATRIBUTOS**/
    //private clases, declaro las variables que voy a usar luego
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    /**METODOS**/
    //creo una bola
    public Ball(float x, float y, int radius , float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }
    //devuelve el x
    public float getX() {
        return x;
    }
    //da el valor al x
    public void setX(float x) {
        this.x = x;
    }
    //devuelve x
    public float getY() {
        return y;
    }
    //da valor al y
    public void setY(float y) {
        this.y = y;
    }
    //devuelve el radio
    public int getRadius() {
        return radius;
    }
    //da valor al radio
    public void setRadius(int radius) {
        this.radius = radius;
    }
    //devuelve el incremento de x
    public float getXDelta() {
        return xDelta;
    }
    //da valor al incremento de x
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    //devuelve el incremento de y
    public float getYDelta() {
        return yDelta;
    }
    //da valor al incremento de y
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    //mueve las coordenadas del punto sumandole a las originales los incrementos
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    //hace el simetrico  horizontal del xdelta
    public void reflectHorizontal(){
        xDelta = -xDelta;
    }
    //hace el simetrico vertical del y delta
    public void reflectVertical(){
        yDelta = -yDelta;
    }
    //me da las coordenadas de la bola y su velocidad
    @Override
    public String toString() {
        return "Ball [(" + x+","+ y + ")"+ "speed=(" + xDelta + ","+ yDelta +")]";
    }
}

