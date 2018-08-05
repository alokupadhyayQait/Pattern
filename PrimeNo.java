
public class PrimeNo {
     
	int sum=0;
	public static boolean prime(int n)
	{
		boolean b=true;
		for(int i=2;i<n;i++)
		{
			
			if(n%i==0)
			{
				b=false;
				break;
			}
			else
			{
				b=true;
			}
		}
		return b;
		
	}
	public void primeSum()
	{
		for(int i=2;i<=1000;i++)
		{
			if(PrimeNo.prime(i))
			{
				sum=sum+i;
			}
		}
		System.out.println("first 1000 prime no sum= "+sum);
		
	}
	public static void main(String[] args)
	{
		PrimeNo obj=new PrimeNo();
		obj.primeSum();
		

	}

}
