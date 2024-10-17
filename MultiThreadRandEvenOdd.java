import java.util.*;
class EvenNum implements Runnable{
	public int a;
	public EvenNum(int a) {
		this.a=a;
	}
	public void run() {
		System.out.println("The Thread"+a+"is Even and square of"+a+"is:"+a*a);
	}
}
class OddNum implements Runnable{
	public int a;
	public OddNum(int a) {
		this.a=a;
	}
	public void run() {
		System.out.println("The Thread"+a+"is Odd and cube of"+a+"is:"+a*a*a);
	}
}
class RandomNumGenerator extends Thread{
	public void run() {
		int n=0;
		Random rand=new Random();
		try {
			for(int i=0;i<3;i++) {
				n=rand.nextInt(20);
				System.out.print("Generated number is:"+n);
				if(n%2==0) {
					Thread t1=new Thread(new EvenNum(n));
					t1.start();
				}
				else {
					Thread t2=new Thread(new OddNum(n));
					t2.start();
					
				}
				Thread.sleep(1000);
				System.out.println("--------------------------------------");
			}
		}
		catch(Exception x) {
			System.out.println(x.getMessage());
		}
	}
	
	
}
public class MultiThreadRandEvenOdd {
	public static void main(String[]args) {
		RandomNumGenerator rand_gen=new RandomNumGenerator();
		rand_gen.start();
	}

}
