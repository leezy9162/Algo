import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int validNum = 0;
		for (int i = 0; i < arr.length; i++) {
			validNum += Math.pow(arr[i], 2);
		}
		
		System.out.println(validNum%10);
	}
}