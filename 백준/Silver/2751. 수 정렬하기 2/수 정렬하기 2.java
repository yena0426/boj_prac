import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		ArrayList<Integer> nums = new ArrayList<>();
			
		for (int i = 0; i < T; i++) {
			nums.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(nums);

		for (int n : nums) {
			sb.append(n+"\n");
		}
		
		System.out.println(sb);
	}
}