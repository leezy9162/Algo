import java.util.Scanner;

public class Main {
/*
 * 어떤 단어를 뒤에서부터 읽어도 똑같다면 그 단어를 팰린드롬이라고 한다. 'radar', 'sees'는 팰린드롬이다.
 * 수도 팰린드롬으로 취급할 수 있다. 수의 숫자들을 뒤에서부터 읽어도 같다면 그 수는 팰린드롬수다.
 * 121, 12421 등은 팰린드롬수다. 123, 1231은 뒤에서부터 읽으면 다르므로 팰린드롬수가 아니다.
 * 또한 10도 팰린드롬수가 아닌데, 앞에 무의미한 0이 올 수 있다면 010이 되어 팰린드롬수로 취급할 수도 있지만,
 * 특별히 이번 문제에서는 무의미한 0이 앞에 올 수 없다고 하자.

 * **입력의 마지막 줄에는 0이 주어지며, 이 줄은 문제에 포함되지 않는다.**
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String num = sc.nextLine();
			if (Integer.parseInt(num)==0) {
				break;
			}
			String[] numArr = num.split("");
			
			String flag = "no";
			for (int i = 0; i < numArr.length; i++) {
				if (Integer.parseInt(numArr[i])==Integer.parseInt(numArr[numArr.length-1-i])) {
					flag = "yes";
				} else {
					flag = "no";
					break;
				}
			}
			System.out.println(flag);
		}
		sc.close();
	}
}