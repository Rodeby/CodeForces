import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class C {

	public static void main(String[] args) {

		FastScanner sc = new FastScanner();
		// number of test cases
		int n = sc.nextInt();

		// int[] a = new int[n];

		// second input
		for (int i = 0; i < n; i++) {
			int j = sc.nextInt();
			int[] scores = new int[3];
			HashMap<String, ArrayList<Integer>> map = new HashMap<>();
			for (int k = 0; k < 3; k++) {
				for (int m = 0; m < j; m++) {
					String temp = sc.nextToken();
					map.putIfAbsent(temp, new ArrayList<Integer>());
					map.get(temp).add(k);
				}
			}

			for (String key : map.keySet()) {
				ArrayList<Integer> temp = new ArrayList<>();
				temp = map.get(key);
				if (temp.size() == 1) {
					scores[temp.get(0)] += 3;
				} else if (temp.size() == 2) {
					scores[temp.get(0)] += 1;
					scores[temp.get(1)] += 1;

				}

			}

			for (int p = 0; p < scores.length; p++) {
				System.out.print(scores[p] + " ");
			}
			System.out.println();

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
