import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, exponent, result = 1;

        System.out.println("Enter the number and the exponent: ");
        number = input.nextInt();
        exponent = input.nextInt();

        for (int i = 0; i < exponent; i++){
            result *= number;
        }

        System.out.println("The result is: " + result);
    }
}
