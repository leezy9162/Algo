import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//배열 사이즈 입력받고, 해당 하는 크기의 배열 생성
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		
		//최대, 최소 변수 선언 및 초기화
		//배열에 값을 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//최대 최소 정수형 변수 선언
		int max = arr[0];
		int min = arr [0];
		
		//최대값 찾기
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}