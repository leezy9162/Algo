import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] fullArr = {1,1,2,2,2,8};
		int[] needArr = new int[6];
		
		for (int i = 0; i < fullArr.length; i++) {
			needArr[i] = fullArr[i] - sc.nextInt();
		}
		
		for (int i : needArr) {
			System.out.println(i);
		}
		
	}
}