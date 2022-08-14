import java.lang.*;

public class camelCase {

	public static void main(String[] args) {

		System.out.println(toCamelCase("the-stealth-warrior"));
	}

	public static String toCamelCase(String s) {
		boolean hasSeen = false;

		String result = "";
		char[] array = new char[s.length()];
		array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {

			char temp = array[i];

			if (hasSeen) {
				array[i] = Character.toUpperCase(array[i]);
				hasSeen = false;
			}

			if (temp == '-' || temp == '_') {
				hasSeen = true;
				array[i] = '\u0000';
			}
			if (array[i] != '\u0000')
				result += array[i];
		}

		return result;
	}
}
