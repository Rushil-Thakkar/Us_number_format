import java.util.*;

public class number_format {
	
	//Function that accepts the input string and returns the formated output string.
	public static String format(String str) {
		
		// Empty character array to get the input numbered string from user.
		char array[] = new char[10];
		
		// Country code declaration for USA
		String countrycode = "+1";
		
		//Variable declaration for the phone number format.
		String firstthree;
		String secondthree;
		String lastfour;
		
		//Check if the inputed numbered string from user is valid or not.
		if(str.length() != 10){
			return null;
		}
		else{
			int j=0;
			
			//only stores the character if it is number form 0 to 9.
			for(int i=0; i<str.length();i++)
			{
				if(Integer.valueOf(str.charAt(i))<58 && Integer.valueOf(str.charAt(i))>47) {
					array[j]= str.charAt(i);
					j++;
				}
			}
			if(Integer.valueOf(array[array.length-1])==0)
			{
				return null;
			}
		}
		
		// String representation of first three characters.
		firstthree=String.valueOf(Arrays.copyOfRange(array, 0, 3));
		
		// String representation of second three characters.
		secondthree=String.valueOf(Arrays.copyOfRange(array, 3, 6));
		
		// String representation of last four characters.
		lastfour=String.valueOf(Arrays.copyOfRange(array, 6, array.length));
		
		//return final result in E.164 format adding all the strings together.
		return(countrycode+ "(" + firstthree + ")" + secondthree + "-" + lastfour);
				
	}
	
	// Main function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String final_result;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter 10 digit number");
		final_result = s.nextLine();
		final_result=format(final_result);
		System.out.println(final_result);
	}
}
