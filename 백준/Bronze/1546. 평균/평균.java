import java.util.Scanner;

public class Main {
/*
 * 문제)
 * 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다.
 * 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
 * 
 * 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
 * 
 * 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
 * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
 * 
 * 고려할 조건)
 * **첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다.**
 * **이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.**
 * 
 * 문제 해석)
 * 1. 과목의 갯수만큼 배열을 만든다.
 * => 1000보다 작거나 같으니 일단 상관은 없음.
 * 2. 가장 최고점을 찾는다.
 * => 가장 최고점인 점수로 대상점수/최고점수*100을 한다.
 * 3. 점수를 처리하고 새로운 점수의 평균을 구한다.
 * 
 * 오답노트)
 * **자꾸 97%에서 틀리는데 뭐지**
 * 1. 소수점 자릿수로 인한 이슈
 * => testCase에 대해서 BigDecimal로도 해봤는데 틀림
 * 2. 0에 대한 처리....?
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//처음에는 과목의 수를 입력받는다
		int n = sc.nextInt();
		//과목수만큼 배열을 만들고 이후에 오는 입력을 담는다.
		int[] arr = new int[n];
		
		//최종 점수입력 까지 값을 넣고 최고값을 찾아놓기 
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int score = sc.nextInt();
			arr[i] = score;
			max = max > score ? max:score; //max 값 찾아놓기
		}
			
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += (double) arr[i]/max * 100;
		}
		System.out.println(sum/arr.length);
	}
}