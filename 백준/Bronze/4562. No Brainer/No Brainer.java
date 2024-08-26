import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for (int i = 0; i < testCase; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if (Math.max(num1, num2)!=num1) {
				System.out.println("NO BRAINS");
			} else {
				System.out.println("MMM BRAINS");
			}
		}
		
	}
}