import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사용자의 입력을 받기
		String str = sc.nextLine();
		
		//알파벳 수만큼 배열을 생성
		int[] arr = new int[26];
		//배열의 기본값을 -1로 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(arr[ch-97]==-1) {
				arr[ch - 97] = i;
			}
			
			
		}
		
		for (int i : arr) {
			System.out.print(i +" ");
		}
		
	}
}