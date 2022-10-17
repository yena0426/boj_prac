import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[10001];
		
		for (int i = 0; i < N; i++) {
			nums[Integer.parseInt(br.readLine())]++;
		}
		
		for (int i = 1; i <= 10000; i++) {
			if (nums[i] > 0) {
				for (int j = 0; j < nums[i]; j++) {
					sb.append(i).append("\n");
					}
				}
			}
		System.out.println(sb);
	}
}