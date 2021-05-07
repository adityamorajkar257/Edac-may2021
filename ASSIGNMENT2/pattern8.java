class pattern8
{
public static void main(String args[])
{
	int n=5;
for(int i=5;i>=1;i--)	//Row
	{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int k=i;k<=n;k++)
	{	
		System.out.print(k+" ");
	}
		System.out.println();
	}
}
}	