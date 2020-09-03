import java.util.Scanner;

public class BMI {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInInches = input.nextDouble();

        final double KILOGRAMS = 0.45359237;
        final double METERS = 0.0254;

        // Computing BMI
        double weightInKilograms = weightInPounds * KILOGRAMS;
        double heightInMeters = heightInInches * METERS;

        double BMI = weightInKilograms / Math.pow(heightInMeters, 2);

        // Display results
        System.out.println("Your BMI is " + BMI);

        if(BMI < 18.5)
            System.out.println("Underweight");
        else if(BMI < 25.0)
            System.out.println("Normal");
        else if(BMI < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
