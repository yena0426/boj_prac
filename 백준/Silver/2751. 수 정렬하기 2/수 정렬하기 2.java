import java.io.*;

public class Main {
	
	public static int[] merge_sort(int[] lst) {
		if (lst.length == 1) {
			return lst;
		}
		int middle = lst.length/2;
		int[] left = new int[middle];
		int[] right = new int[lst.length-middle];
		System.arraycopy(lst, 0, left, 0, middle);
		System.arraycopy(lst, middle, right, 0, lst.length-middle);
		left = merge_sort(left);
		right = merge_sort(right);
		return merge(left, right);
	}
	
	public static int[] merge(int[] left, int[] right) {
		int l_idx = 0;
		int r_idx = 0;
		int[] result = new int[left.length+right.length];
		int idx = 0;
		while (idx < left.length+right.length) {
			if (r_idx == right.length) {
				result[idx] = left[l_idx];
				l_idx++;
			} else if (l_idx == left.length) {
				result[idx] = right[r_idx];
				r_idx++;
			} else if (left[l_idx] <= right[r_idx]) {
				result[idx] = left[l_idx];
				l_idx++;
			} else {
				result[idx] = right[r_idx];
				r_idx++;
			}
			idx++;
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int[] nums = new int[T];
		
		for (int i = 0; i < T; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		// 머지소트 구현해라 예나야
		
		int[] sort_nums = merge_sort(nums);
		
		for (int i = 0; i < T; i++) {
			sb.append(sort_nums[i]+"\n");
		}
 
		System.out.println(sb);
	}
}