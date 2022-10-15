import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int[] nums = new int[T];
		
		for (int i = 0; i < T; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < T-1; i++) {
			for (int j = i+1; j < T; j++) {
				if (nums[i] > nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
			sb.append(nums[i]+"\n");
		}
		sb.append(nums[T-1]+"\n");
		System.out.println(sb);
	}
}
