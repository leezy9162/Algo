import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int k = 0; k < testCase; k++) {

            int N = sc.nextInt();

            List<String> list = new ArrayList<>();

            for (int i = 1; i <= N; i++) {
                for (int j = i+1; j <= N; j++) {
                    if ((i+j)==N && i != j) {
                        list.add(i + " " + j);
                    }
                }
            }



            System.out.print("Pairs for " + N + ":");

            if (list.isEmpty()){
                System.out.println();
                continue;
            }
            for (int i = 0; i < list.size(); i++) {
                if (i==0){
                    System.out.print(" " + list.get(i));
                } else {
                    System.out.print(", " + list.get(i));
                }
            }
            System.out.println();
        }
    }
}