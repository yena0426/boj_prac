import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int second = sc.nextInt();
		
		if (second >= 45) {
			System.out.printf("%d %d", time, second-45);
			
		} else {
			if (time == 0) {
				System.out.printf("%d %d", 23, 60+second-45);
			} else {
				System.out.printf("%d %d", time-1, 60+second-45);
			}
		}

	}

}
