import java.util.Scanner;
public class EXP1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		char ch;
	   do {
		System.out.println("Operations:");
		System.out.println("1: Arithmatic Operations");
		System.out.println("2: Array Access");
		System.out.println("enter the choice:");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
		
			try {
				 System.out.println("enter the numerator:");
				 int numerator=sc.nextInt();
				 System.out.println("enter the denominator:");
				 int denominator=sc.nextInt();
				 int result=numerator/denominator;;
				 System.out.println("Result:"+result);
			}catch(ArithmeticException e) {
					System.out.println("caught an exception:"+e.getMessage());
			}break;
			case 2:
				int[]number= {1,2,3};
			try {
				 System.out.println("enter the array index to access:");
				 int index=sc.nextInt();
				 System.out.println("element at index"+index+":"+number[index]); 
			}catch(ArrayIndexOutOfBoundsException f) {
				System.out.println("caught exception:"+f.getMessage());
			}break;
			
			default:
				System.out.println("Invalid Choice");
				break;
		}System.out.println("do u want to continue:yes:yor no:n");
		ch=sc.next().charAt(0);
	   } 
       while(ch=='y' || ch =='Y');
	
		
		sc.close();
	
}

}