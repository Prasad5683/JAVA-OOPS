import java.util.Scanner;

class Area {
    // Declare length and breadth as instance variables
    private double length;
    private double breadth;

    // Method to set the length and breadth of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Create an object of the class
        Area rectangle = new Area();

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for length and breadth
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        // Set the dimensions of the rectangle
        rectangle.setDim(length, breadth);

        // Print the area of the rectangle
        System.out.println("Area of rectangle: " + rectangle.getArea());

        scanner.close();
    }
}
