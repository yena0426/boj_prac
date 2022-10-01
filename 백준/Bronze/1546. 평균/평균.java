import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		float[] scores = new float[T];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		float maxscore = 0;
		
		for (int i = 0; i < T; i++) {
			scores[i] = Float.parseFloat(st.nextToken());
			if (scores[i] > maxscore) {
				maxscore = scores[i];
			}
		}
		
		float scoresum = 0;
		for (int i = 0; i < T; i++) {
			scores[i] = scores[i]/maxscore*100;
			scoresum += scores[i];
		}
		
		sb.append((scoresum/T) + "\n");
		System.out.print(sb);

	}
}
