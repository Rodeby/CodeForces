import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class A {

	public static void main(String[] args) {
		
		char[] array = {'T','i','m','u','r'};
		Arrays.sort(array);
		
		FastScanner sc = new FastScanner();
		//number of test cases
		int n = sc.nextInt();

		int[] a = new int[n];
		//second input
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			String temp = sc.nextToken();
			if(temp.length() != 5)
				System.out.println("NO");
			else {
				char[] check = temp.toCharArray();
				Arrays.sort(check);
				if(Arrays.equals(array, check)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			
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
