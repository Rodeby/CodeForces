import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D {

	public static void main(String[] args) {
		
		FastScanner sc = new FastScanner();
		//number of test cases
		int n = sc.nextInt();

		//LRRLL
		//k   j
		//second input
		
		for (int i = 0; i < n; i++) {
			int changes = sc.nextInt();
			String str = sc.nextToken();
			long result = countSum(str);
			char[] array = str.toCharArray();
			int k = 0;
			int j =  str.length()-1;
			int mid = str.length() / 2;
			
			
			
			while(k <= j && changes > 1) {
				if(array[k] == 'R') {
					k++;
				}
				else if(mid-k >= j - mid) {
					array[k] = 'R';
					result += str.length() - k -1;
					//result = countSum(new String(array));
					changes--;
					k++;
					
					System.out.print(result +" ");
				}
				else if(array[j]== 'L') {
					j--;
				}
				else if(j-mid >= mid-k) {
					array[j] = 'L';
					//result = countSum(new String(array));
					result += j-1;
					changes--;
					j--;
					
					System.out.print(result+" ");
				}
					
				
				
				
				
			}
			if(changes > 0) {
				while(changes > 0) {
					System.out.print(result + " ");
					changes--;
				}
			}
			System.out.println();
		}
		

	}
	
	public static long countSum(String str) {
		long result = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'L')
				result += i;
			else
				result += str.length() - i-1;
		}
		
		return result;
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
