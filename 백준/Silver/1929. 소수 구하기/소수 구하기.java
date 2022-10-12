import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		boolean[] prime = new boolean[N+1];
		prime[0] = prime[1] = true;
		
		for (int i = 2; i <= Math.sqrt(N); i++) {
			for (int j = 2; i*j <= N; j++) {
				prime[i*j] = true;
			}
		}
		
		for (int range = M; range <= N; range++) {
			if (!prime[range]) sb.append(range+"\n");
		}
		System.out.println(sb);
	}

}
