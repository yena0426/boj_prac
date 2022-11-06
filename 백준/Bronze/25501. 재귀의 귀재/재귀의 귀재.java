import java.io.*;

public class Main {

    public static int[] recursion(String s, int l, int r, int cnt){
    	cnt++;
    	int[] res = {0, cnt};
        if(l >= r) {
        	res[0] = 1;
        	return res;
        }
        else if(s.charAt(l) != s.charAt(r)) return res;
        else return recursion(s, l+1, r-1, cnt);
    }
    public static int[] isPalindrome(String s, int cnt){
        return recursion(s, 0, s.length()-1, cnt);
    }
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=0; i<N; i++) {
			String word = br.readLine();
			int[] ans = isPalindrome(word, 0);
			sb.append(ans[0]).append(" ").append(ans[1]).append("\n");
		}
		System.out.println(sb);
    }
}
