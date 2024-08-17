import java.util.Scanner;
public class FrequencyofChar {
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str1=sc.nextLine();
		String str=str1.toLowerCase();
		int len=str.length();
		//System.out.println("enter the character to check for its frequency:");
		//char ch=sc.nextLine().charAt(0);
		int count=0;
		for(int i=0;i<len;i++) 
		{
			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o'))
			{
				count++;
			}
              
		}
		
		System.out.println("The number of vowels is" +count);
	}
}
		


