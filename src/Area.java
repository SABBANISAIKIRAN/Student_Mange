
import java.util.Scanner;
abstract class Shapes
{
	public int x,y;
	public abstract void printArea();
}
class Rectangle extends Shapes
{
	public void printArea() {
		float c=x*y;
	System.out.println("Area of Rectangle="+c);
	}
	
}
class Triangle extends Shapes
{

	@Override
	public void printArea() {
		float c=1/2*x*y;
		System.out.println("Area of Rectangle="+c);	
	}
	
}
class Circle extends Shapes
{

	@Override
	public void printArea() {
		float c=(float) (3.14*x*x);
		System.out.println("Area of Rectangle="+c);
		
	}
	
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int s;
		Rectangle r=new Rectangle();
		r.x=2;
		r.y=3;
		Triangle t=new Triangle();
		t.x=3;
		t.y=3;
		Circle c=new Circle();
		c.x=2;
		c.y=3;	
		while(true)
		{
	    s=scan.nextInt();	
		System.out.println("Enter the 1 to Rectangle:\nEnter 2 to Triangle \n Enter 3 to Circle");
		switch(s)
		{
		case 1:r.printArea();
		break;
		case 2:t.printArea();
		break;
		case 3:c.printArea();
		break;
		}
		}
	}
	}

