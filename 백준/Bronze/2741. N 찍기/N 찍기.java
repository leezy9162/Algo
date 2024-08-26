import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		recursive(num,1);
		
//		for (int i = 1; i <= num; i++) {
//			System.out.println(i);
//		}
	}
	
	//재귀를 써보자
	private static void recursive(int num, int start) {		
		if (num == start) {
			System.out.println(num);
			return;
		} else {
			System.out.println(start);
			start += 1;
			recursive(num, start);
		}
	}
}