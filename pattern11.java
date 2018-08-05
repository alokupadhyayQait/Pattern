
public class pattern11 {
    static int count=0;
	public static void main(String[] args) 
    {   int count=0;
		for(int i=5;i>=1;i--)
		{
		for(int j=1;j<=count;j++)
		{
			System.out.print(" ");
		}
		for (int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		count++;
		System.out.println("");
	    }
		for(int i=2;i<=5;i++)
		{
		for(int j=5;j>i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=(i*2)-1;k++)
		{   
		System.out.print("*");
		}
		System.out.println("");
		}
		

	}

}
