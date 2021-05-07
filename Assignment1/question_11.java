import java.util.*;
class question_11
{
	public static void main(String[] args)  
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the value of radius:  ");
	double radius = sc.nextDouble();

	double perimeter = 2*3.1416*radius;
	double area = 3.1416*radius*radius;

	System.out.println("Perimeter = "+perimeter);
	System.out.println("Area = "+area);
	}
}