
public class DigitsSum {

	public static void main(String[] args) 
	{
	
		
		int number=9999;
		int a,sum=0;
		
		System.out.println("******");
		while(number>0 || sum>9)
		{
			 if (number == 0) {
	                number = sum;
	                sum = 0;
	            }
        a=number%10;	 
		sum=sum+a;
		number=number/10;
		

		}
	
		System.out.println("Sum of digits of number "+sum);


	}

}
