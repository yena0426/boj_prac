import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] fourtytwo = new int[42];
		
		int n;
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			n = Integer.parseInt(br.readLine());
			n = n % 42;
			if (fourtytwo[n] == 0) { 
				++cnt;
				fourtytwo[n] = 1;
				}
		}
				
		sb.append(cnt + "\n");
		System.out.print(sb);
	}

}
