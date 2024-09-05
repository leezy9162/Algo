import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		while (true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			if (num1==0 && num2==0 && num3==0) {
				break;
			}
			
			list.add(num1);
			list.add(num2);
			list.add(num3);
			
			Collections.sort(list);
			
			if (Math.pow(list.get(0),2)+Math.pow(list.get(1),2)==Math.pow(list.get(2),2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			list.clear();
		}
	}
}