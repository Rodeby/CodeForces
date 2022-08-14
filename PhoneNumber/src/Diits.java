import java.util.ArrayList;

public class Diits {

	public static void main(String[] args) {
		System.out.println(digPow(46288,3));

	}

	public static long digPow(int n, int p) {

		int saveN = n;
		ArrayList<Integer> array = new ArrayList<>();
		while(n > 0) {
			
			array.add(n%10);
			n= n/10;			
		}
		
		int temp = 0;
		
		for(int i = array.size()-1; i >= 0; i--) {
			
			temp+= Math.pow(array.get(i), p++);
		}
		return temp%saveN == 0 ? temp/saveN : -1;
	}
}
