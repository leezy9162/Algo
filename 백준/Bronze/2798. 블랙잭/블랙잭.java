import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	/*
	 * 문제) 카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다. 카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게
	 * 만드는 게임이다. 블랙잭은 카지노마다 다양한 규정이 있다.
	 * 
	 * 한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다. 김정인 버전의 블랙잭에서 각 카드에는 양의
	 * 정수가 쓰여 있다. 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
	 * 
	 * 이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의
	 * 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다. N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한
	 * 가까운 카드 3장의 합을 구해 출력하시오.
	 * 
	 * 고려할 조건) 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
	 * 
	 * 문제 해석) 
	 * 1. 첫줄에 카드의 개수와 targetNum을 제시한다. 
	 * 2. 총 3개의 카드를 조합하면서 카드의 값이 targetNum과 가장 가깝게 만들어야 한다.
	 * 3. for문을 통해 3개를 더해 tragetNum 보다 작으면 List에 다 저장해 버린다.
	 * 4. Collections.max를 이용해 가장 큰 조합을 찾는다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cards = new int[sc.nextInt()];
		int targetNum = sc.nextInt();

		// 일단 카드의 값들을 모두 저장
		for (int i = 0; i < cards.length; i++) {
			cards[i] = sc.nextInt();
		}

		//그냥 for문 돌려서 3개 더했을때 targetNum보다 작으면 리스트에 모두 넣어버리고
		//나중에 그중에서 가장 큰 값을 찾기
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < cards.length; i++) {
			for (int j = i+1; j < cards.length; j++) {
				for (int j2 = j+1; j2 < cards.length; j2++) {
					if (cards[i] + cards[j] + cards[j2]<=targetNum) {
						list.add(cards[i] + cards[j] + cards[j2]);
					}
				}
			}
		}
		System.out.println(Collections.max(list));
	}
}