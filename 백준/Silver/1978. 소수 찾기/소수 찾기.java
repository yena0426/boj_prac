import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		String[] nums = br.readLine().split(" ");
		
		int cnt = 0;
		for (String num : nums) {
			int N = Integer.parseInt(num);
			if (N != 1 && N % 2 == 1) {
				for (int i = 3; i <= N; i++) {
					if (N == i) {
						++cnt;
					} else if (N % i == 0) {
						break;
					}
				}
			} else if (N == 2) {
				++cnt;
			}
		}
		System.out.println(cnt);
	}

}