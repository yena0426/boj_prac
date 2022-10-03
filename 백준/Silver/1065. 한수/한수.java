import java.io.*;

public class Main {
	
	public static int hannum(int n) {
		if (n < 100) {
			return 1;
		} else {
			int tmp = n % 10;
			n /= 10;
			int gap = n % 10 - tmp;
			while (n >= 10) {
				tmp = n % 10;
				n /= 10;
				if (gap != n % 10 - tmp) return 0;
			}
			return 1;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += hannum(i);
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(ans+"\n");
		bw.flush();
		bw.close();
	}

}
