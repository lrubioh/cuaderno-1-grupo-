package es.uah.matcomp.mp.e3.ejerciciosclases.e7;

public class LineSub extends Point{
    /**
     * Clase que representa el punto final
     */
     private Point end;

    /**
     * Constructor que recibe las coordenadas
     */
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    /**
     * Constructor que recibe objetos Point
     */
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    /**
     * Devuelve el punto inicial como objeto Point
     */
    public Point getBegin() {
        return new Point(getX(), getY());
    }

    /**
     * Devuelve el punto final
     */
    public Point getEnd() {
        return end;
    }

    /**
     * Establece un nuevo punto inicial
     */
    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }

    /**
     * Establece un punto final
     */
    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return getX(); }

    public int getBeginY() {
        return getY(); }

    public int getEndX() {
        return end.getX(); }

    public int getEndY() {
        return end.getY(); }

    public void setBeginX(int x) {
        setX(x); }

    public void setBeginY(int y) {
        setY(y); }

    public void setBeginXY(int x, int y) {
        setX(x); setY(y); }

    public void setEndX(int x) {
        end.setX(x); }

    public void setEndY(int y) {
        end.setY(y); }

    public void setEndXY(int x, int y) {
        end.setXY(x, y); }

    /**
     * Método para calcular la longitud de la línea
     */
    public double getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Método para calcular la pendiente (gradiente) en radianes
      */
    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }

    /**
     * Devuelve una representación en cadena de la línea
     */
    @Override
    public String toString() {
        return "LineSub[begin=" + getBegin() + ", end=" + end + "]";
    }
}
