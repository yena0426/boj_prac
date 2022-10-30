import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N= Integer.parseInt(br.readLine());
		String[] words = new String[N];
		
		for (int i = 0; i < N; i++) {
			words[i] = br.readLine().trim();
		}
				
		Arrays.sort(words, (s1, s2) -> {
			if (s1.length() == s2.length()) {
				return s1.compareTo(s2);
			} 
			else {
				return s1.length() - s2.length();
			}
		});
		
		sb.append(words[0]).append("\n");
		String tmp = words[0];
		for (String word : words) {
			if (!word.equals(tmp)) {
				sb.append(word).append("\n");
				tmp = word;
			}
		}
 
		System.out.println(sb);
	}

}