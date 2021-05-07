import java.util.*;
class question9
{
	public static void main(String[] args) 
{
	double num1 = 25.5;
	double num2 = 3.5;
	double num3 = 40.5;
	double num4 = 4.5;
	double first = (25.5 *3.5 - 3.5 * 3.5);
	double second = (40.5-4.5);
	
	System.out.println("((" + num1 + " * " + num2 + " - " + num2+ " * " + num2 + ")" + " / " + "(" + num3 + " - " + num4 + " ))" );
	System.out.println("");
	System.out.println("Result is:");
	System.out.println(first/second);
}
}