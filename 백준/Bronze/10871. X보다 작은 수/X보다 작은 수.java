import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//배열 사이즈 입력 받기
		int arrSize = sc.nextInt();
		
		//입력받은 배열의 크기만큼 1차원 배열 생성
		int[] arr = new int[arrSize];
		//비교할 정수 입력 받기
		int num = sc.nextInt();
		//배열에 값을 넣기
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = sc.nextInt();
		}
		
		//배열에서 num보다 작다면 출력
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < num) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
	}
}