import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		int[] numCheckArr = new int[10];
		
//		for (int i : numCheckArr) {
//			System.out.print(i);
//		}
		
//		System.out.println();
		int outNum = num1 * num2 * num3;
//		System.out.println(outNum);
		String parseNum  = String.valueOf(outNum);
//		System.out.println("pasing: "+parseNum);
		String[] parseNumArr = parseNum.split("");
//		for (String str : parseNumArr) {
//			System.out.print(str + " ");
//		}
		
		for (int i = 0; i < parseNumArr.length; i++) {
			int number = Integer.parseInt(parseNumArr[i]);
			numCheckArr[number] += 1;
		}
		
		for (int i : numCheckArr) {
			System.out.println(i);
		}
		
		
	}
}