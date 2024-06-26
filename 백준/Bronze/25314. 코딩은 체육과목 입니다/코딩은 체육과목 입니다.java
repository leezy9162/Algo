import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //4배수 확인
        boolean type  = inputType(input);

        if (type){
            for (int i = 0; i < (input / 4); i++) {
                System.out.print("long ");
            }
            System.out.print("int");
        }


    }

    public static boolean inputType(int input){
        return input % 4 == 0;
    }
}