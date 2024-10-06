import java.util.Scanner;

public class Main {
/*
 * 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
 * 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 
 * level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
 */
	public static void main(String[] args) {
		//입력 받은 단어 저장
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//단어 쪼개기
		String[] strArr = str.split("");
		
		//for문을 첫번째 단어와 마지막 단어 비교
		//첫번째부터~ vs 마지막부터~
		//flag를 사용해 최종적으로 비교
		boolean flag = false;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equals(strArr[strArr.length - 1 - i])) {
				flag = true;
			} else {
				//하나라도 false에 걸리면 break;
				flag = false;
				break;
			}
		}
		
		if (flag==true) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}
}