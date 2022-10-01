import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int ans = N;
		int a, b;
		int cnt = 0;
		
		do {
			++cnt;
			if (ans < 10) {
				 a = 0;
				 b = ans;
			} else {
				a = ans / 10;
				b = ans % 10;
			}
			ans = b*10 + (a+b)%10;
		} while (ans != N);
		
		sb.append(cnt+"\n");
		System.out.print(sb);
	}
}