import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		int[] nums = new int[T];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int minnum = 1000000;
		int maxnum = -1000000;
		
		for (int i = 0; i < T; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			if (nums[i] < minnum) { minnum = nums[i]; }
			if (nums[i] > maxnum) { maxnum = nums[i]; }
		}
				
		sb.append(minnum + " ");
		sb.append(maxnum + "\n");
		System.out.print(sb);

	}
}