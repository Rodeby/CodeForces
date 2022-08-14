import java.util.Arrays;

public class HexToRGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println('A' - '7');
	
		System.out.println(Arrays.toString(hexStringToRGB("111111")));
		
	}

	public static int[] hexStringToRGB(String hex) {
		int result = 0;
		int resultTemp = 0;
		int[] array = new int[3];
		
		for(int i = 0; i < hex.length(); i++){
			
			char temp = hex.charAt(i);
			switch (temp){
				case 'A':
					resultTemp+= 'A' - '7';
					break;
				case'B' :
					resultTemp+= 'B' - '7';
					break;
				case 'C':
					resultTemp+= 'C' - '7';
					break;
				case'D' :
					resultTemp+= 'D' - '7';
					break;
				case 'E':
					resultTemp+= 'E' - '7';
					break;
				case'F' :
					resultTemp+= 'F' - '7';
					break;
				default:
					resultTemp += (int)temp -48;
					break;
			}
			
			if(i%2 != 0) {
				result =  (result * resultTemp) -1;				
				array[i/2] = result;
				result = 0;
				resultTemp = 0;
				
			}else {
				result = resultTemp;
			}
				
			
		}
		
		
	
		// hex -> {r, g, b}

		return array;
	}
}
