import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();


        System.out.println(number1 + number2 );
        System.out.println(number1 - number2 );
        System.out.println(number1 * number2 );
        System.out.println(number1 / number2 );
        System.out.println(number1 % number2 );

    }
}