import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int n = sc.nextInt();
		
		int price, cnt;
		int totalchk = 0;
		
		for (int i = 0; i < n; i++) {
			price = sc.nextInt();
			cnt = sc.nextInt();
			
			totalchk += price*cnt;
		}
		
		if (total == totalchk) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}