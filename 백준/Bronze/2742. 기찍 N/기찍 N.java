import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		recursive(num);
	}
	
	//재귀를 써보자
	private static void recursive(int num) {		
		if (num == 1) {
			System.out.println(num);
			return;
		} else {
			System.out.println(num);
			num -= 1;
			recursive(num);
		}
	}
}