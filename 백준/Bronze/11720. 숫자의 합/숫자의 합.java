import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.nextLine();

        String num2 = sc.nextLine();
        String[] arr = num2.split("");

        int sum  = 0;
        for (String a : arr){
            sum += Integer.parseInt(a);
        }

        System.out.println(sum);

    }
}