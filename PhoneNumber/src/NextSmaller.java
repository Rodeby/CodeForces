import java.util.ArrayList;

public class NextSmaller {

	public static void main(String[] args) {

		System.out.println(21 / 10);
		long test = 1956196783484980L;
		System.out.println(test);
		System.out.println(test(5310));
		//System.out.println(test());

	}

	public static long nextSmaller(long n) {

		// 2071 2017 531 513
		long temp = n;
		boolean hasSwapped = true;
		if (n < 10)
			return -1;
		while (!hasSwapped) {
			int count = 0;
			int div;

			if (temp % 10 < temp % 100) {

				hasSwapped = true;
			}

		}

		return n;
	}

	public static long test(long n) {
		long result = 0;

		if (n < 10)
			return -1;
		else if (n < 100 && n > 9) {
			if (n % 10 > n / 10) {
				return -1;
			} else {
				long temp = n / 10;
				long temp2 = n % 10;

				return (temp2 * 10 + temp);

			}

		} else {

			ArrayList<Integer> array = new ArrayList<>();

			int index = 0;
			long pow = 0;
			while (n > 0) {

				pow = n % 10;

				array.add(index, (int) pow);
				n /= 10;
				index++;
			}

			boolean found = false;
			int indexOfLastNonZero = 0;
			for (int i = 1; i < array.size(); i++) {

				if (array.get(i) > array.get(i - 1) && array.get(i) != 0 && array.get(i - 1) != 0) {
					int temp = array.get(i);
					int temp2 = array.get(i - 1);

					array.set(i, temp2);
					array.set(i - 1, temp);
					found = true;
					
				}
				if (array.get(i - 1) > 0)
					indexOfLastNonZero = i - 1;

			}

			if (!found && !(array.get(array.size() - 2) == 0))

				return -1;
			else if(!found && array.get(array.size()-1) > array.get(indexOfLastNonZero)) {
				int nonZero = array.get(indexOfLastNonZero);
				array.remove(indexOfLastNonZero);
				array.add(array.size(), nonZero);

			}
			else if(!found) {
				return -1;
			}
			

			for (int i = array.size() - 1; i >= 0; i--) {

				result += array.get(i);
				if (i > 0)
					result *= 10;
			}

			return result;
		}

	}

}
