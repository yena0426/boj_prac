import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int N2;
		
		while (N > 0) {
			N2 = N*2;
	
			boolean[] prime = new boolean[N2+1];
			prime[0] = prime[1] = true;
			
			for (int i = 2; i <= Math.sqrt(N2); i++) {
				for (int j = 2; i*j <= N2; j++) {
					prime[i*j] = true;
				}
			}
			
			int cnt = 0;
			for (int range = N+1; range <= N2; range++) {
				if (!prime[range]) ++cnt;
			}
			sb.append(cnt+"\n");
			N = Integer.parseInt(br.readLine());

		}
		System.out.println(sb);
	}

}
