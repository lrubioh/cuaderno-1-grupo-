package es.uah.matcomp.mp.e1.ejerciciosclases.e1;

public class Circle {
        //DECLARO LOS ATRIBUTOS PRIVADOS
        private double radius;
        private String color;

        //DECLARO LOS MÉTODOS PÚBLICOS
        //construye un circulo por defecto con los datos privados (radio y el color)
        public Circle(){
            radius = 1;
            color="red";
        }

        //con esta función podré construir mi circulo de la forma: Circle nombre = new Circle( radius , color)
        //poniendo en nombre el nombre que le doy a mi circulo para luego poder usarle y en radius su radios
        public Circle(double radius){
            this.radius = radius;
        }

        //esta función me extrae el radio de el circulo que yo meta a la función
        public double getRadius() {
            return radius;
        }

        //me calcula el area de un circulo a partir de su radio
        public double getArea(){
            return radius * radius*Math.PI;
        }

        /// MODIFICACIONES
        //Constructor con dos entradas: radio ,color
        public Circle(double radius, String color){
            this.radius = radius;
            this.color = color;
        }

        //metodo que de el color (getter)
        public String getColor() {
            return color;
        }
        //setters
        //para cambiar el radio
        public void setRadius(double radius) {
            this.radius = radius;
        }
        //para el color
        public void setColor(String color) {
            this.color = color;
        }
        //imprimo el circulo
        @Override
        public String toString() {
            return "Circle{radius=" + radius + ", color='" + color + '}';
        }


    }
