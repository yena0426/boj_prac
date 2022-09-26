import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
		
		Scanner sc = new Scanner(System.in);
		
		int king, queen, rook, bishop, knight, pawn;
		
		king = 1-sc.nextInt();
		queen = 1-sc.nextInt();
		rook = 2-sc.nextInt();
		bishop = 2-sc.nextInt();
		knight = 2-sc.nextInt();
		pawn = 8-sc.nextInt();
		
		System.out.printf("%d %d %d %d %d %d", king, queen, rook, bishop, knight, pawn);
	}

}
