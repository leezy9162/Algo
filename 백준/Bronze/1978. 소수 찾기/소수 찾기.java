import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[] arr = new int[testCase];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0; //소수면 올라가는 변수
		for (int i : arr) {
			if (i == 1) {
				continue;
			}
			if (i == 2) {
				cnt++;
				continue;
			}
			
			for (int j = 2; j < i; j++) {
				if (i%j == 0) {
					break;
				}
				if (j==(i-1)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}