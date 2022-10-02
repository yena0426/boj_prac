import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			double[] scores = new double[N];
			
			double sum = 0;
			for (int j = 0; j < N; j++) {
				scores[j] = Double.parseDouble(st.nextToken());
				sum += scores[j];
			}
			
			double avg = sum / N;
			int over = 0;
			for (int k = 0; k < N; k++) {
				if (scores[k] > avg) {
					++over;
				}
			}
			sb.append(String.format("%.3f", (double)over/(double)N*100));
			sb.append("%\n");
		}
		System.out.println(sb);
	}

}
