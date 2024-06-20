import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1부터 n 까지의 합을 출력한다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }
}