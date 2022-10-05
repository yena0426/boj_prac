import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int R = Integer.parseInt(st.nextToken());
			String[] S = st.nextToken().split("");
			
			for (String l : S) {
				for (int j = 0; j < R; j++) {
					sb.append(l);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
