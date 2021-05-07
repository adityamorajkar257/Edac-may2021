import java.util.*;
class A4d
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter integer nos :");
int i= sc.nextInt();
int j= sc.nextInt();
int k= sc.nextInt();
int l= sc.nextInt();
int m= sc.nextInt();
int n= sc.nextInt();
int o= i+j/k*l-m%n;
System.out.println(i+ "+" +j+"/"+k+"*"+l+"-"+m+"%"+n+"="+o);
}
}