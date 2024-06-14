import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // S = (R1 + R2) / 2
        int R1 = sc.nextInt();
        int S = sc.nextInt();
        int R2 = (2 * S) - R1;


        System.out.println(R2);
        
    }
}