import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		boolean[] prime = new boolean[10001];
		prime[0] = prime[1] = true;
		
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			for (int j = 2; j <= N; j++) {
				for (int k = 2; j*k <= N; k++) {
					if (prime[j*k] != true) prime[j*k] = true;
				}
			}

			for (int n = N/2; n >= 2; n--) {
				if (!prime[n] && !prime[N-n]) {
					sb.append(n+" "+(N-n)+"\n");
					break;
				}
			}
			
		}
		System.out.println(sb);
	}

}