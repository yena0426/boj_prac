import java.io.*;
import java.util.*;

// arithmetic mean 산술평균 : N개의 수들의 합을 N으로 나눈 값
// median 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
// mode 최빈값 : N개의 수들 중 가장 많이 나타나는 값
// range 범위 : N개의 수들 중 최댓값과 최솟값의 차이

public class  Main {
	
	public static int func1(int[] lst) {
		double sum = 0;
		for (int l : lst) {
			sum += l;
		}
		int avg = (int)Math.round(sum/lst.length);
		return avg;
	}
	
	public static int func2(int[] lst) {
		Arrays.sort(lst);
		return lst[lst.length/2];
	}
	
	public static int func3(int[] lst) {
		int[] cnt = new int[8001];
		int maxcnt = 0;
		for (int l : lst) {
			cnt[l+4000] += 1;
			maxcnt = (cnt[l+4000] > maxcnt) ? cnt[l+4000] : maxcnt;
		}
		int cntorder = 0;
		int res = 0;
		for (int i = 0; i < 8001; i++) {
			if (cnt[i] == maxcnt) {
				cntorder += 1;
				res = i-4000;
			}
			if (cntorder == 2) {
				break;
			}
		}
		return res;
	}
	
	public static int func4(int[] lst) {
		int minn = 4001;
		int maxn = -4001;
		for (int l : lst) {
			minn = (l < minn) ? l : minn;
			maxn = (l > maxn) ? l : maxn;
		}
		return maxn - minn;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
				
		sb.append(func1(nums)).append("\n");
		sb.append(func2(nums)).append("\n");
		sb.append(func3(nums)).append("\n");
		sb.append(func4(nums)).append("\n");
		System.out.println(sb);
	}
	
}
