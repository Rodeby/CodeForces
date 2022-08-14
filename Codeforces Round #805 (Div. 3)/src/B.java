import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class B {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();

		String[] array = new String[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextToken();
		}

		for (int i = 0; i < n; i++) {
			char[] temp = array[i].toCharArray();
			Set<Character> set = new HashSet<>();
			int count = 0;
			for (int j = 0; j < temp.length; j++) {
				if(!set.contains(temp[j]) && set.size() < 3)
					set.add(temp[j]);
				else if(!set.contains(temp[j]) && set.size() == 3) {
					count++;
					set.clear();
					set.add(temp[j]);
				}
				

			}
			
			if(set.size() >  0) {
				count++;
			}
			System.out.println(count);
			set.clear();
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
