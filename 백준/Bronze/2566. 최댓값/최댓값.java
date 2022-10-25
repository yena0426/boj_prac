import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] nums = new int[9][9];
		
		int maxi = 1;
		int maxj = 1;
		int maxv = 0;
		
		for (int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<9; j++) {
				nums[i][j] = Integer.parseInt(st.nextToken());
				
				if (nums[i][j] > maxv) {
					maxi = i+1;
					maxj = j+1;
					maxv = nums[i][j];
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(maxv).append("\n");
		sb.append(maxi).append(" ").append(maxj);
		System.out.println(sb);
	}

}
