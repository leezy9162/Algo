import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;


        while (true){
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0){
                break;
            }
            int sum = cal(a,b);
            System.out.println(sum);
        }
    }

    public static int cal(int a, int b){
        int sum = a + b;
        return sum;
    }
}