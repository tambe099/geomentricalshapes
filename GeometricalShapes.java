import java.util.Scanner;

class GeometricalShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Choose the shape to calculate area:");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Square");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter base and height of the triangle: ");
                    double base = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    System.out.println("Area of the triangle: " + areaOfTriangle(base, height));
                    break;
                case 2:
                    System.out.print("Enter length and width of the rectangle: ");
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    System.out.println("Area of the rectangle: " + areaOfRectangle(length, width));
                    break;
                case 3:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of the circle: " + areaOfCircle(radius));
                    break;
                case 4:
                    System.out.print("Enter side length of the square: ");
                    double side = scanner.nextDouble();
                    System.out.println("Area of the square: " + areaOfSquare(side));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
    
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }
    
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }
    
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static double areaOfSquare(double side) {
        return side * side;
    }
}
