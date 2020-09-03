import java.util.Scanner;

public class FuckAround {
    public static void main(String[] args)
    {
        double number = Math.random() * 10;
        System.out.println(number);
        System.out.println((int)number);
        System.out.println((int)(number * 100));
        System.out.println((int)(number * 100) / 100.0);
    }
}
