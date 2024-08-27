import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while (true) {
			int numZero = sc.nextInt();
			if (numZero ==0) {
				break;
			} 
			count += 1;
			
			String isOddEven = null;
			if (numZero%2 != 0) {
				isOddEven = "odd";
			} else {
				isOddEven = "even";
			}
			
			int lastNum = 0;
				
				
			if (isOddEven.equals("odd")) {
				lastNum = ((((numZero*3)+1)/2)*3)/9;
			} else {
				lastNum = numZero/2;
			}
			
			System.out.println(count + ". " + isOddEven + " " + lastNum);
		}
	}
}