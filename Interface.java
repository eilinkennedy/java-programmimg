import java.util.Scanner;
interface Human{
	final int job_id=111;
	void learn(String str);
	void work();
}
interface Recruitment{
	void screening(int score);
}
class Programmer implements Human, Recruitment{
	public void learn(String str) {
		System.out.println("trained area is:"+str);
	}
	public void screening(int score) {
		System.out.println("test score:"+score);
	}
	public void work(){
		System.out.println("working as web developer");
	}
}
public class Interface {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the area of learn:");
	String str=sc.nextLine();
	System.out.println("enter the test score:");
	int score=sc.nextInt();
	System.out.println("**** MY PLACEMENT****");
	Programmer trainee=new Programmer();
	trainee.learn(str);
	trainee.screening(score);
	trainee.work();
	System.out.println("Trainee's JOB_ID:"+trainee.job_id);
	}
}
