import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[][] nums = new int[N][3];
		
		for (int i=0; i<N; i++) {
			nums[i][0] = Integer.parseInt(st.nextToken());
			nums[i][1] = i;
		}

		Arrays.sort(nums, (n1, n2) -> {
			return n1[0] - n2[0];
		});
		
		int tmp = 0;
		nums[0][2] = tmp;
		for (int i=1; i<N; i++) {
			if (nums[i][0] != nums[i-1][0]) tmp += 1;
			nums[i][2] = tmp;
		}

		Arrays.sort(nums, (n1, n2) -> {
			return n1[1] - n2[1];
		});

		for (int i=0; i<N; i++) {
			sb.append(nums[i][2]).append(" ");
		}
		System.out.println(sb);
	}
}