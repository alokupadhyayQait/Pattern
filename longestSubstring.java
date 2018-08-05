/*
public class longestSubstring {

	public static void main(String[] args) 
	{
	String s="this is program to find largest non repeating substring";
	int l=s.length();
	String subS="";
	String longestSub="";
	 String	Sub1="";
	int countSub=0;
	int count=0;
	int count1=0;
	for (int i=0;i<l;i++)
	{
		char ch=s.charAt(i);
		subS=subS+ch;
	    
		int k=subS.length();
		if(ch==' ' && i!=l)
		{
		 char ch2=subS.charAt(count1);
         for(int j=count1+1;j<k;j++)
         {
        	 if(subS.charAt(count1)!=subS.charAt(count1+1))
        	 {
        		   Sub1=Sub1+subS.charAt(count1);
                 	 count1++;
              	 count++;
        		
        	 }
         
          }
         if(count>countSub)
         {
        	 longestSub=Sub1;
        	 countSub=count;
         }
			
		}
		Sub1="";
		count=0;
	}
	System.out.println(longestSub);
		

	}

}
*/