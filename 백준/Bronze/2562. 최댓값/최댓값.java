import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] nums = new int[10];
		
		int maxnum = 1;
		int maxidx = 0;
		
		for (int i = 1; i <= 9; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			if (nums[i] > maxnum) { 
				maxnum = nums[i];
				maxidx = i;
				}
		}
				
		sb.append(maxnum + "\n");
		sb.append(maxidx + "\n");
		System.out.print(sb);
	}

}
