
public class pattern7 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
		for(int j=5;j>i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(""+k+"");
		}
		System.out.println("");
			
		}
	int z=1;	
	for(int l=1;l<=4;l++)
	{
	for(int m=1;m<=l;m++)
	{
		System.out.print(" ");
	}
	for(int n=4;n>=l;n--)
	{
		System.out.print(z);
		z++;
	}
	System.out.println("");
	z=1;
	}

	}

}
