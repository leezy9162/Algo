import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int total = 0;
        int taskCase = sc.nextInt();
        int[] productPrice = new int[taskCase];
        int[] productCount = new int[taskCase];

        for (int i = 0; i < taskCase; i++) {
            productPrice[i] = sc.nextInt();
            productCount[i] = sc.nextInt();
            total += productPrice[i] * productCount[i];
        }

        if (total == amount){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}