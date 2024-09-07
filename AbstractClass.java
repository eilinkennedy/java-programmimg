abstract class Shape{
	abstract void numberofSides();
}
 class Rectangle extends Shape{
	 int side;
	 Rectangle(int side){
		 this.side=side;
	 }
	 public void numberofSides(){
		 System.out.println("I am rectangle, Number of sides="+side);
	 }
 }
	 class Triangle extends Shape{
		 int side;
		 Triangle(int side){
			 this.side=side;
		 }
		 public void numberofSides(){
			 System.out.println("I am triangle, Number of sides="+side);
		 }
		 
 }
	 class Hexagon extends Shape{
		 int side;
		 Hexagon(int side){
			 this.side=side;
		 }
		 public void numberofSides(){
			 System.out.println("I am hexagon, Number of sides="+side);
		 }
	 } 
		 
public class AbstractClass {
	public static void main (String[]args) {
		Rectangle r=new Rectangle(4);
		Triangle t=new Triangle(3);
		Hexagon h=new Hexagon(6);
		r.numberofSides();
		t.numberofSides();
		h.numberofSides();
		
	}
}
 
 


