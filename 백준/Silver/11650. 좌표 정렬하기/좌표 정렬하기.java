import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] nums = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			nums[i][0] = Integer.parseInt(st.nextToken());
			nums[i][1] = Integer.parseInt(st.nextToken());
		}
	
		Arrays.sort(nums, (o1, o2) -> {
			if(o1[0] == o2[0]){
		    	return Integer.compare(o1[1],o2[1]);
			} else {
		    	return Integer.compare(o1[0],o2[0]);
		    }
		});
		
        for (int i = 0; i < N; i++) {           
        	sb.append(nums[i][0]).append(" ").append(nums[i][1]).append("\n");                      
        	}
        System.out.println(sb);
	}

}