import java.util.Scanner;
public class Rectanglearea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate the area of a rectangle using integers:");
        System.out.print("Enter the length (int): ");
        int lengthInt = scanner.nextInt();
        System.out.print("Enter the width (int): ");
        int widthInt = scanner.nextInt();
        int areaInt = lengthInt * widthInt;
        System.out.println("The area of the rectangle (int): " + areaInt);  
        System.out.println("\nCalculate the area of a rectangle using floats:");
        System.out.print("Enter the length (float): ");
        float lengthFloat = scanner.nextFloat();
        System.out.print("Enter the width (float): ");
        float widthFloat = scanner.nextFloat();
        float areaFloat = lengthFloat * widthFloat;
        System.out.println("The area of the rectangle (float): " + areaFloat);
        scanner.close();
    }
}
