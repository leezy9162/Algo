import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//스캐너 생성.
		Scanner sc = new Scanner(System.in);
		
		//testCase 입력.
		int testCase = sc.nextInt();
		sc.nextLine(); //입력 버퍼를 비웁니다.

		//tesCase만큼 반복합니다.
		for (int j = 0; j < testCase; j++) {
			//입력 받은 ox 점수
			String oxScore = sc.nextLine();
			//한자리씩 배열에 넣기
			String[] oxScoreArr = oxScore.split("");
			
			//계산을 위한 변수 선언
			int sum = 0;
			int plus = 1;
			
			//점수 계산 반복문
			for (int i = 0; i < oxScoreArr.length; i++) {
				if (i==0) {
					if (oxScoreArr[i].equals("O")){
						sum += 1;
					} 
					continue;
				}
				
				if (oxScoreArr[i].equals("O")&&oxScoreArr[i-1].equals("O")) {
					plus += 1;
					sum += plus;
				} else if (oxScoreArr[i].equals("O")){
					sum += 1;
				}else {
					plus = 1;
				}
			}
			
			//출력하고 다음 테스트 케이스로 넘어갑니다.
			System.out.println(sum);
		}
	}
}