import java.util.*;
class Table{
	void printTable(int n) {
		synchronized(this){
			for(int i=1;i<=10;i++) {
				System.out.println(n+"*"+i+"="+(n*i));
				try {
					Thread.sleep(40);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
			
		}
	}
}
class Mythread1 extends Thread{
	Table t;
	int n;
	Mythread1(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(n);
	}
}
class Mythread2 extends Thread{
	Table t;
	int n;
	Mythread2(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(n);
	}
}
class Mythread3 extends Thread{
	Table t;
	int n;
	Mythread3(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(n);
	}
}

public class ThreadSynch {
	public static void main(String[]args) {
		Table t=new Table();
		Scanner sc=new Scanner(System.in);
		Mythread1 th1=new Mythread1(t);
		Mythread2 th2=new Mythread2(t);
		Mythread3 th3=new Mythread3(t);
		System.out.print("Enter the table you want to run by thread1:");
		th1.n=sc.nextInt();
		System.out.print("Enter the table you want to run by thread2:");
		th2.n=sc.nextInt();
		System.out.print("Enter the table you want to run by thread3:");
		th3.n=sc.nextInt();
		th1.start();
		th2.start();
		th3.start();
}
}
