import java.util.*;
class A4c
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter 4 integer nos :");
int i= sc.nextInt();
int j= sc.nextInt();
int k= sc.nextInt();
int l= sc.nextInt();
int m= i+j*k/l;
System.out.println(i+ "+" +j+"*"+k+"/"+l+"="+m);
}
}