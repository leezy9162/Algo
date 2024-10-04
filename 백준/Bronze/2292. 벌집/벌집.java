import java.util.Scanner;

public class Main {
	/*
	 * 위의 그림과 같이 육각형으로 이루어진 벌집이 있다.
	 * 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
	 * 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
	 * 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
	 * 
	 * **사진 상으로는 1부터 시작해 주변의 숫자가 6의 배수만큼 둘러(?)진다**
	 * **예를 들면 1+1번만에 갈 수 있는 곳은 1이후의 6개의 숫자
	 * **2+1번만에 갈 수 있는 곳은 1번 이후 6*2개의 숫자...
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int range = 2;
		int cnt = 1;
		if (target==1) {
			System.out.println(1);
		} else {
			while (range <= target) {
				range = range+ (6*cnt);
				cnt ++;
			}
			System.out.println(cnt);
		}

	}
}