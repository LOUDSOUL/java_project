import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ask the user for a number and find its factorial through a recursive function
        System.out.println("Enter a number to find its factorial: ");
        int number = Input.getInt();
        System.out.println("The factorial of " + number + " is " + factorial(number));
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}

class Input {
    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
