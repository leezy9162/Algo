import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		//배열에 입력받은 값 넣기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ascCnt = 0;
		int descCnt = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				ascCnt++;
			} else {
				descCnt++;
			}
		}
		
		if (ascCnt==arr.length-1) {
			System.out.println("ascending");
		} else if(descCnt==arr.length-1) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		
		
		sc.close();
	}
}