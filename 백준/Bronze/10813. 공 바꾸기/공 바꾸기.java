import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] basket = new int[size];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        int testCase = sc.nextInt();

        int indexNum1;
        int indexNum2;
        int temp;


        for (int i = 0; i < testCase; i++) {
            indexNum1 = sc.nextInt() -1;
            indexNum2 = sc.nextInt() -1;
            temp = basket[indexNum1];

            basket[indexNum1] = basket[indexNum2];
            basket[indexNum2] = temp;
        }

        for(int a: basket){
            System.out.println(a);
        }
    }
}