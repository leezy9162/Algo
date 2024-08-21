import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();


        String num1 = Integer.toString(first);
        String num2 = Integer.toString(second);

        String[] num1Arr = num1.split("");
        String[] num2Arr = num2.split("");

        String num1Reverse = "";

        for (int i = 2; i >= 0 ; i--) {
            num1Reverse += num1Arr[i];
        }

        String num2Reverse = "";

        for (int i = 2; i >= 0 ; i--) {
            num2Reverse += num2Arr[i];
        }

        int realNum1 = Integer.parseInt(num1Reverse);
        int realNum2 = Integer.parseInt(num2Reverse);

        if (realNum1>realNum2){
            System.out.println(realNum1);
        } else {
            System.out.println(realNum2);
        }
    }
}