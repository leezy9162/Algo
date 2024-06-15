import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taskCase = sc.nextInt();
        int[] A = new int[taskCase];
        int[] B = new int[taskCase];

        for (int i = 0; i < taskCase; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < taskCase; i++){
            System.out.println("Case #" + (i + 1) + ": " + A[i] + " + " +  B[i] + " = " + (A[i] + B[i]));
        }
    }
}