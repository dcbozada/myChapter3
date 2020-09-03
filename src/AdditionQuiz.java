import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args)
    {
        // Generating two random numbers
        int number1 = (int)System.currentTimeMillis() % 10;
        int number2 = (int) System.currentTimeMillis() / 10 % 10;

        // Creating scanner
        Scanner input = new Scanner(System.in);

        // Asking user question
        System.out.print("What is " + number1 + " + " + number2 + "? ");

        // Getting answer from user
        int answer = input.nextInt();

        // Evaluating if answer is correct
        if (number1 + number2 != answer)
        {
            System.out.println("That answer is not correct");
        }

        else
            System.out.println("That answer is correct");

        // Displaying result
       // System.out.println(number1 + " + " + number2 + " is " + (number1 + number2 == answer));
    }
}
