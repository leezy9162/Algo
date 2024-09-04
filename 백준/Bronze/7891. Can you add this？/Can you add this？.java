import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < testCase; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1+num2);
		}
	}
}