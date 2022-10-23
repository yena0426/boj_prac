import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] classroom = new int[31];
		for (int i=0; i<28; i++) {
			int n = Integer.parseInt(br.readLine());
			classroom[n] = 1;
		}
		
		for (int i=1; i<31; i++) {
			if (classroom[i] == 0) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}

}
