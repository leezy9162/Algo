import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        str1 = str1.trim();

       if (str1.isEmpty()){
           System.out.println(0);
       } else {
           String[] strArr = str1.split(" ");
           System.out.println(strArr.length);
       }

    }
}