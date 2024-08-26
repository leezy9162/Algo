import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hexaInt = sc.nextLine();
		
		System.out.println(Integer.parseInt(hexaInt, 16));
		sc.close();
	}
}