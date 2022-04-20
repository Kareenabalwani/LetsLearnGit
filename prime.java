public class prime
{
	public static void main(String args[])
	{
		int flag=0;
		for(int i=1;i<=100;i++)
		{
			flag=0;
			for(int j=2;j<i;j++)
			{
			    if(i%j==0)
			    {
			         flag++;
			     }
			  
			    
			
			}
			if(flag>0)
			  {
				
			  }
			else
			{
			if(i==1){//1 is neither primer nor non prime}
			else{System.out.println("\n "+ i); }
			
			}
		}
	}

}








