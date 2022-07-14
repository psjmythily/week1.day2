package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
		char[] charArray = test.toCharArray();
		char toPrint;
	
		for (int i = 0; i < charArray.length; i++)
		{
			if(i%2!= 0) {
				
			    toPrint = Character.toUpperCase(charArray[i]);
				System.out.print(toPrint);
			}
				else
				{
				toPrint = Character.toLowerCase(charArray[i]);
				System.out.print(toPrint);
				}
         		
		}

	}

}
