import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taskCase = sc.nextInt();
        int[] array1 = new int[taskCase];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        for (int counter : array1) {
            if (counter == v){
                count++;
            }
        }

        System.out.println(count);

    }

}