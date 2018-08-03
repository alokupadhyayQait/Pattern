
public class pattern4 {

	public static void main(String[] args) 
	{    /*
	     
			1 
			2 3 
			5 8 13 
			21 34 55 89 
	
	      */
		int x=0;
		int y=1;
		int z=x+y;
		for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(""+z+" ");
			x=y;
			y=z;
			z=x+y;
		}
	   System.out.println("");
			
		}

	  }
    }
