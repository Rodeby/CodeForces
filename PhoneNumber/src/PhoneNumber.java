
public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		System.out.println(createPhoneNumber(array));
	}

	public static String createPhoneNumber(int[] numbers) {
		
		String number = "(";	
		for(int i = 0; i < numbers.length; i++) {
			 if(i == 3)
				 number += ") ";
			 if(i == 6)
				 number += "-";
			 number += Integer.toString(numbers[i]);			
		}
	return number;
	}
}
