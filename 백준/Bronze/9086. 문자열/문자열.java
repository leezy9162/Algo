import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[testCase];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }


        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            int length = str.length();
            System.out.println(str.substring(0, 1) + str.substring(length-1));

        }



    }
}