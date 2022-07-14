package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
		String rev = "";
		int length = str.length();
	
		for (int i=length-1; i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if (str.equals(rev))
		System.out.println("The given word is palindrome");
		else
		System.out.println("The given word is not palindrome");	
	}

}
