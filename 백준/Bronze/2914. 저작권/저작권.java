import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSongNum = sc.nextInt();
        int melodyAverage = sc.nextInt();

        System.out.println(totalSongNum * (melodyAverage - 1) + 1);
        
    }
}