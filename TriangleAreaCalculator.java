package triangle;

import java.util.Scanner;

public class TriangleAreaCalculator {
    private double base;
    private double height;
    private double area;

    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();

        // Call the method to ask the user for input
        calculator.getUserInput();

        // Call the method to compute the area
        calculator.computeArea();

        // Call the method to display the calculated area
        calculator.displayArea();
    }

    // Method to ask the user for the base and height of the triangle
    private void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("base of the triangle:");
        this.base = scanner.nextDouble();

        System.out.print("height of the triangle:");
        this.height = scanner.nextDouble();

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to compute the area of the triangle
    private void computeArea() {
        this.area = 0.5 * this.base * this.height;
    }

    // Method to display the calculated area of the triangle
    private void displayArea() {
        System.out.println("The area of the triangle with base " + this.base +
                " and height " + this.height + " is: " + this.area);
    }
}
