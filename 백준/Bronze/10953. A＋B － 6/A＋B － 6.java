import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= testCase; i++) {
			String str = sc.nextLine();
			String[] arr = str.split(",");
			int num1 = Integer.parseInt(arr[0]);
			int num2 = Integer.parseInt(arr[1]);
			System.out.println(num1+ num2);
		}
		
		
	}

}