import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		String[][] members = new String[N][2];
		
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			members[i][0] = st.nextToken();
			members[i][1] = st.nextToken();
		}
		
		Arrays.sort(members, (m1, m2) -> {
			int mb1 = Integer.parseInt(m1[0]);
			int mb2 = Integer.parseInt(m2[0]);
			
			return Integer.compare(mb1,mb2);	
		});
		
        for (int i = 0; i < N; i++) {           
        	sb.append(members[i][0]).append(" ").append(members[i][1]).append("\n");                      
        	}
        System.out.println(sb);
		

	}

}
