import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int testCase = sc.nextInt();
		
		int index1;
		int index2;
		
		
		for (int i = 0; i < testCase; i++) {
			index1 = sc.nextInt(); 
			index2 = sc.nextInt();
			int input = sc.nextInt();
			for (int j = index1 - 1; j <= index2 -1; j++) {
				arr[j] = input;
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
}