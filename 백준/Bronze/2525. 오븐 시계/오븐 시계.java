import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		int second = sc.nextInt();
		int oven = sc.nextInt();
		
		second += oven;
		
		if (second >= 60) {
			time += second / 60;
			second = second % 60;
			if (time >= 24) { 
				time = time % 24;
			}
		}
		
		System.out.printf("%d %d", time, second);

	}

}
