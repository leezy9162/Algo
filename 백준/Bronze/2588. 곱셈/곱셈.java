import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int last = num2 % 10;
        int middle =  (num2 % 100) / 10;
        int first = num2 / 100;

        System.out.println(last * num1);
        System.out.println(middle * num1);
        System.out.println(first * num1);
        System.out.println(num1 * num2);

    }
}