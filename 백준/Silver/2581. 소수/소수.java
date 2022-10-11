import java.io.*;

public class Main {
	
	public static int isPrime(int N) {
		int prime = 1;
		if (N == 1) {
			prime = 0;
		} else if (N == 2) {
			prime = 1;
		} else if (N % 2 == 0) { 
			prime = 0;
		} else {
			for (int i = 3; i <= Math.sqrt(N); i++) {
				if (N % i == 0) {
					prime = 0;
					break;
				}
			} 
		} return prime;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int minn = Integer.parseInt(br.readLine());
		int maxn = Integer.parseInt(br.readLine());
		
		int nsum = 0;
		int nmin = 0;
		for (int i = maxn; i >= minn; i--) {
			if (isPrime(i) == 1) {
				nsum += i;
				nmin = i;
			} 
		}
		if (nsum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(nsum);
			System.out.println(nmin);
		}
	}

}
