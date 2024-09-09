import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력 받기
		int total = sc.nextInt();
		int[] sizeArr = new int[6];
		for (int i = 0; i < sizeArr.length; i++) {
			sizeArr[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		int p = sc.nextInt();
		
		//티셔츠 주문 횟수를 카운트할 변수
		int tCnt = 0;
		for (int i : sizeArr) {
			if (i==0) {
				continue;
			}
			
			if (i <= t) {
				tCnt += 1;
			} else if(i > t && (i%t)==0) {
				tCnt += i / t;
			} else {
				tCnt += i/t  + 1;
			}
		}
		System.out.println(tCnt);
		
		System.out.println(total/p+" " + total%p);
	}
}