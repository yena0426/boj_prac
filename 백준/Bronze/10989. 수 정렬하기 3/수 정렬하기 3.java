import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[10001];
		
		int maxnum = -1;
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(br.readLine());
			nums[tmp]++;
			maxnum = (tmp > maxnum) ? tmp : maxnum;
		}
		
		for (int i = 1; i <= maxnum; i++) {
			if (nums[i] > 0) {
				for (int j = 0; j < nums[i]; j++) {
					sb.append(i).append("\n");
					}
				}
			}
		System.out.println(sb);
	}
}