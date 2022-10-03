import java.io.*;

public class Main {

	public static int d(int n) {
		if (n < 10) {
			return n;
		} else {
			return n%10 + d(n/10);
		}
	}
	
	public static void main(String[] args) {
		int[] d_num = new int[10001];
		
		for (int i = 1; i <= 10000; i++) {
			int tmp = i + d(i);
			if (tmp <= 10000) {
				d_num[tmp] += 1;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int j = 1; j <= 10000; j++) {
			if (d_num[j] == 0) {
				sb.append(j+"\n");
			}
		}
		System.out.println(sb);
	}

}