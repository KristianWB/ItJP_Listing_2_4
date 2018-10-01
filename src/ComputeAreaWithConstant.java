import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        // Create a scanner object - done

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * Math.PI;

        // Display result
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
