import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		String[] ox = new String[T];
		
		for (int i = 0; i < T; i++) {
			ox[i] = br.readLine();
		}
		
		for (int i = 0; i < T; i++) {
			int cnt = 0;
			int ans = 0;			
			for (int j = 0; j < ox[i].length(); j++) {
				if (ox[i].charAt(j) == 'O') {
					++cnt;
					ans += cnt;
				} else {
					cnt = 0;
				}
			} 
			sb.append(ans+"\n");
		}
		System.out.print(sb);

	}

}