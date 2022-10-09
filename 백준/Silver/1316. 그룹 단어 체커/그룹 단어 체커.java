import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for (int i = 0; i < t; i++) {
			String word = br.readLine();
			char word_a = word.charAt(0);
			int[] word_c = new int[26];
			Arrays.fill(word_c, 0);
			word_c[((int)word_a)-97] = 1;
			++cnt;
			for (int j = 1; j < word.length(); j++) {
				char tmp = word.charAt(j);
				if (tmp != word_a && word_c[((int)tmp)-97] == 1) {
					--cnt;
					break;
				} else if ((tmp == word_a && word_c[((int)tmp)-97] == 1)) {
					continue;
				} else {
					word_a = tmp;
					word_c[((int)tmp)-97] = 1;
				}
			}
		}
		System.out.println(cnt); 

	}

}