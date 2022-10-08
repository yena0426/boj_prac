import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		for (String c : cro) {
			str = str.replaceAll(c, "a");
		}
		System.out.println(str.length());
	}

}
