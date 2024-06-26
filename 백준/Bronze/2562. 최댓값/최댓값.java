import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        
        if (sc.hasNext()){
            for (int i = 0; i < 9; i++) {
                arr[i] = sc.nextInt();
            }
        }

        int max = arr[0];
        for (int ar : arr) {
            if (ar > max){
                max = ar;
            }
        }
        System.out.println(max);

        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max){
                maxIndex = i + 1;
            }
        }
        System.out.println(maxIndex);
    }
}