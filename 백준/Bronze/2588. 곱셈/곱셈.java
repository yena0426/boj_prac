import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int res;
		res = B/10;
		System.out.println(A*(B%10));
		System.out.println(A*(res%10));
		System.out.println(A*(res/10));
		System.out.println(A*B);
	}

}
