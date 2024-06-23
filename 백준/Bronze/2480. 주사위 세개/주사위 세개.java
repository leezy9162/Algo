import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int result = 0;


        if (num1 == num2 && num2 == num3){//모두 같은 경우
            result = goodResult(num1);
        } else if (num1  == num2 || num1 == num3){
            result = normalResult(num1);
        } else if ( num2 == num3){
            result = normalResult(num2);
        } else {
            result = badResult(num1, num2, num3);
        }

        System.out.println(result);
    }


    public static int goodResult(int num){
        int sum;
        sum = 10000 + (num * 1000);
        return sum;
    }

    public static int normalResult(int num){
        int sum;
        sum = 1000 + (100 * num);
        return sum;
    }

    public static int badResult(int num1, int num2, int num3){
        int cal = Math.max(num1, Math.max(num2, num3));
        cal = cal * 100;
        return cal;
    }
}