import java.util.Scanner;
class Emp{
double salary,DA,HRA,salary1;
Emp(double salary,double DA, double HRA)
{
this.salary=salary;
this.DA=DA;
this.HRA=HRA;
}
void display()
{
System.out.println("Employee..........");
}
void calcSalary()
{
salary1=salary+salary*(DA/100)+salary*(HRA/100);
System.out.println("Gross salary="+ salary1);
}
}
class Engineer extends Emp
{
Engineer(double salary,double DA, double HRA)
{
	super(salary,DA,HRA);
	}
	void display()
	{
	super.display();
	super.calcSalary();
	System.out.println("Engineer.......");
	}
	void calcSalary()
	{
	System.out.println("Gross saalary of the Engineer="+salary1*2);
	}
	}
	public class MethodOverriding {
	public static void main(String[] args) {
	double salary,DA,HRA;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the basic salary of the Employee");
	salary=sc.nextDouble();
	System.out.println("Enter DA% of Employee");
	DA=sc.nextDouble();
	System.out.println("Enter HRA% of Employee");
	HRA=sc.nextDouble();
	Engineer e =new Engineer(salary,DA,HRA);
	e.display();
	e.calcSalary();
	sc.close();
	}
	}