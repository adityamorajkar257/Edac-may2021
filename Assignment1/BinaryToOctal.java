//Que.24

import java.util.Scanner;
class BinaryToOctal
{
public static void main(String args[])
{
int num1;
Scanner sc= new Scanner(System.in);
num1= Integer.parseInt(sc.nextLine(),2);
System.out.println(Integer.toOctalString(num1));
}
}