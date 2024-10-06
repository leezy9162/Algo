import java.util.Scanner;

public class Main {
/*
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArr = new int[sc.nextInt()];
		sc.nextLine();//버퍼 비우기
		
		String[] strArr = sc.nextLine().split("");
		sc.close();
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
		}
		System.out.println(sum);
		
	}
	
}