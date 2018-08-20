package solutions.prototype;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Oval oval = new Oval();
            Square square = new Square();
            Triangle triangle = new Triangle();

            oval.loadShapeData("Oval");
            square.loadShapeData("Square");
            triangle.loadShapeData("Triangle");

            Oval oval1 = oval.clone();
            Square square1 = square.clone();
            Triangle triangle1 = triangle.clone();


            System.out.println("Original Objects\n");
            System.out.println(oval);
            System.out.println(square);
            System.out.println(triangle);



            System.out.println("\nCloned Objects\n");

            System.out.println("This is the clone oval " + oval1);
            System.out.println("This is the clone square " + square1);
            System.out.println("This is the clone triangle " + triangle1);




        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
