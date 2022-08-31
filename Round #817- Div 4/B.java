import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B {

	public static void main(String[] args) {

		FastScanner sc = new FastScanner();
		// number of test cases
		int n = sc.nextInt();

		// second input
		for (int i = 0; i < n; i++) {
			int j = sc.nextInt();

			char[] first = new char[j];
			char[] second = new char[j];
			first = sc.nextToken().toCharArray();
			second = sc.nextToken().toCharArray();

			for (int k = 0; k < j; k++) {
				if (first[k] == 'G')
					first[k] = 'B';
				if (second[k] == 'G')
					second[k] = 'B';

			}
			if (Arrays.equals(first, second))
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

	public static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String nextToken() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(nextToken());
		}

		long nextLong() {
			return Long.parseLong(nextToken());
		}

		double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}
}
