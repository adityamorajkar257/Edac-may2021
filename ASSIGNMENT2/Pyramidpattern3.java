class Pyramidpattern3
{
public static void main(String args[])
{
for(int i=1;i<=9;i++) //Row
	{
	for(int j=8;j>=i;j--)
	//j=4 is for column spaces and j>=i for triangular format
		{
		System.out.print(" ");
		}
	for(int k=1;k<=i;k++)	//column:star
		{
		System.out.print("*" +" ");
		}
		System.out.println();
	}
}
}	
	