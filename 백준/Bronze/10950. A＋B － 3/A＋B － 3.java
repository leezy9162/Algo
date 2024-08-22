import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taskCae = sc.nextInt();
        int[] a = new int[taskCae];
        int[] b = new int[taskCae];



        for (int i = 0; i < taskCae; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < taskCae; i++) {
            System.out.println(a[i] + b[i]);
        }

    }
}