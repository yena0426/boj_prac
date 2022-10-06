import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		int[] cnt = new int[26];
		int tmp;
		for (int i = 0; i < word.length(); i++) {
			tmp = (int)word.charAt(i);
			if (tmp <= 90) {
				cnt[tmp-65] += 1;
			} else {
				cnt[tmp-97] += 1;
			}
		}
		
		int max = 0;
		int maxcnt = 0;
		int maxidx = 0;
		for (int i = 0; i < 26; i++) {
			if (cnt[i] > max) {
				max = cnt[i];
				maxcnt = 1;
				maxidx = i;
			} else if (cnt[i] == max) {
				maxcnt += 1;
			} 
		}
		
		if (maxcnt == 1) {
			System.out.println((char)(maxidx+65));
		} else {
			System.out.println("?");
		}

	}

}