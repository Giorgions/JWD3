package pl.edu.wszib.poli;

public class Polymorphism {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        pl.edu.wszib.poli.Rectangle rectangle = new pl.edu.wszib.poli.Rectangle();
        rectangle.draw();

        /*System.out.println(rectangle instanceof Shape);*/

        shape = new Rectangle();
        shape = new Circle();

        shape.draw();



    }
}
